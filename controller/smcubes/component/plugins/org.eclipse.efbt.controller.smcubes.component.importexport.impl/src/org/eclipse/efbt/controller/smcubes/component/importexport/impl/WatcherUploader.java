package org.eclipse.efbt.controller.smcubes.component.importexport.impl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.efbt.cocalimo.core.model.bpmn_lite.ServiceTask;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.ActivityTag;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.LogicalTransformationModule;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.Logical_transformationsFactory;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.Scenario;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.ScenarioTag;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.Test;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.TestModule;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class WatcherUploader {

	public static void uploadWatcher(String inputDirectory, 
									 String testsDirectory, 
									 LogicalTransformationModule logicalTransformationModule, EPackage dataModelPackage) {
		// get the documentation/readME file
		String documentationReadMeFilePath = inputDirectory +"\\documentation\\README.md";
		// find the Task Name
		String taskName= getTaskNameFromDocumentationReadMeFile(documentationReadMeFilePath);
		// get the task from the transformations
		ServiceTask serviceTask = getTaskFromLogicalTransformation(taskName,logicalTransformationModule);
		String attributeName = serviceTask.getEnrichedAttribute().getName();
		// create testModule for the task
		TestModule testModule = Logical_transformationsFactory.eINSTANCE.createTestModule();
		testModule.setName(taskName+"_TestModule");
		// add the test module to the logical transformation
		logicalTransformationModule.getTestModules().add(testModule);
		// add a directory under the tests directory for the tasks
		new File(testsDirectory + "\\" + attributeName).mkdirs();
		// get the meta data from the metadata file
		File documentationMetaData = new File(inputDirectory +"\\documentation\\metadata.json");
		
		// create an ActivityTag from the meta data
		ActivityTag activityTag = Logical_transformationsFactory.eINSTANCE.createActivityTag();
		activityTag.setActivity(serviceTask);
		setRequirementsOnTagFromJSONMetaData(activityTag,documentationMetaData);

		// add the ActivityTag to the LogicalTransformation
		logicalTransformationModule.getTaskTags().add(activityTag);

		
		// get then set the description
		String description= getTaskDescriptionFromDocumentationReadMeFile(documentationReadMeFilePath);
		serviceTask.setDescription(description);
		// for each scenario create a scenario and add it to the task, with a description
		createScenarioWithDescriptionForEachCase(documentationReadMeFilePath,serviceTask);
		EList<Scenario> scenarios = serviceTask.getScenarios();
		for (Scenario scenario : scenarios) {
			// for each scenario go to the tests directory for that scenario
			// for each scenario create a directory under the tests/task directory
			new File(testsDirectory + "\\" + attributeName + "\\" + scenario.getName()).mkdirs();
			// get the meta data , create a ScenarioTag for the scenario
			String scenarioDirectoryName = inputDirectory +"\\tests\\" + scenario.getName();
			File scenarioMetaDataFile = new File(scenarioDirectoryName + "\\metadata.json");
			ScenarioTag scenarioTag = Logical_transformationsFactory.eINSTANCE.createScenarioTag();
			scenarioTag.setScenario(scenario);			
			setRequirementsOnTagFromJSONMetaData(scenarioTag,scenarioMetaDataFile);
			// add the scenario tag to the logical transformation
			logicalTransformationModule.getScenarioTags().add(scenarioTag);
			EList<Test> tests = createTestForEachSceanrioTest (scenarioDirectoryName);
			for (Test test : tests) {
				// add a directory for each test for the test/task/scenario directory				
				File testDirectory = new File(testsDirectory + "\\" + attributeName + "\\" + scenario.getName() + "\\"  + test.getName());
				testDirectory.mkdirs();
				// for each test add a test to the  testModule, and set the scenario for the test.
				test.setScenarios(scenario);
				testModule.getTests().add(test);
				ArrayList<File> testObjectFiles = getTestObjectFiles(scenarioDirectoryName+"\\"+test.getName());
				//map of EObjects by String id, and Eclass
				HashMap<EClassStringPair,EObject> objectMap = new HashMap<EClassStringPair,EObject>();
				HashMap<EObjectReferencePair,String> featureMap = new HashMap<EObjectReferencePair,String>();
				EList<EObject> objectList = new BasicEList<EObject>();
				for (File testObjectFile : testObjectFiles) {
					EList<EObject> testObjects = creatEObjectFromCSVFile(testObjectFile,
																			dataModelPackage,
																			objectMap,
																			featureMap,
																			objectList);
					
					// If the input test file began with EXpectedResults, then add the created objects to the Expected Results of the Test Object
					// For other created EObjects add them to the Input for the Test
					if(testObjectFile.getName().startsWith("ExpectedRessults_"))
					{
						test.getExpectedResult().addAll(testObjects);
					}
					else
					{
						test.getInputData().addAll(testObjects);
					}
				}
				
				//go through the object list, and set the refrences accordingly..but we need to have the references at this point.
				//so we can go trhought the csf file again? or we should have recorded this at the time in  afeature to string map. maybe it is even (feature, object) -> string.
				Iterator<EObject> objectListIteretor = objectList.iterator();
				while(objectListIteretor.hasNext())
				{
					EObject theObject = objectListIteretor.next();
					EClass theEClass = theObject.eClass();
					
					//loop through references
					EList<EStructuralFeature> contents = ((EClassImpl)theEClass).getEAllStructuralFeatures();
					Iterator<EStructuralFeature> contentsIterator = contents.iterator();
					while (contentsIterator.hasNext())
					{
						 EStructuralFeature feature = contentsIterator.next();
						 if(feature instanceof EReferenceImpl)
						 {
							 EObjectReferencePair orefPair = new EObjectReferencePair(theObject,(EReferenceImpl)feature);						 
							 String stringReference = featureMap.get(orefPair);
							 EClassStringPair classStringPair = new EClassStringPair(feature.getEType(),stringReference);
							 EObject referenceObject = objectMap.get(classStringPair);
							 theObject.eSet(feature, referenceObject);
							 
						 }
						 
					}
					
					
				}
				
				
				
				persistTestObjects (objectList, testDirectory);
				
				
			}

		}

	}

	private static void persistTestObjects(EList<EObject> testObjects, File testDirectory) {
		 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	        Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("xmi", new XMIResourceFactoryImpl());

	        // Obtain a new resource set
	        ResourceSet resSet = new ResourceSetImpl();

	        Iterator<EObject> testObjectIterator = testObjects.iterator();
	        int counter = 0;
	        while(testObjectIterator.hasNext())
	        {
	        	counter++;
	        	EObject testObject = testObjectIterator.next();
	        	
		        // create a resource
		        Resource resource = resSet.createResource(URI.createFileURI(testDirectory.getAbsolutePath()+ "tests/testObject" +counter +".xmi"));
		        // Get the first model element and cast it to the right type, in my
		        // example everything is hierarchical included in this first node
		        resource.getContents().add(testObject);
	
		        // now save the content.
		        try {
		            resource.save(Collections.EMPTY_MAP);
		        } catch (IOException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
	        }
		
	}

	private static void persistTestObject(EObject testObject, File testDirectory) {
		// TODO Auto-generated method stub
		
	}

	private static EList<EObject> creatEObjectFromCSVFile(File testObjectFile, 
												EPackage dataModelPackage, 
												HashMap<EClassStringPair,EObject> objectMap,
												HashMap<EObjectReferencePair,String> featureMap,
												EList<EObject> objectList) {
		// for the file derive an EClass from the name
		// for each row in the file, create an eObject in the relevant output tests directory, using the class name andthen1,2,3 etc...or potentialy the ID
				
		
		String fileName = testObjectFile.getName();
		String className= fileName.substring(0, fileName.indexOf('.'));

		//find the factory or the EClass 
		EFactory factory = dataModelPackage.getEFactoryInstance();
		EClassifier eClass = dataModelPackage.getEClassifier(className);
		
		// for each inheritance relationship, add the inheritence
		List<CSVRecord> rows;
		try {
			rows = getCSVRowsFromFile(testObjectFile.getAbsolutePath());
		
		HashMap<Integer,String> headerMap = new HashMap<Integer,String>();
		boolean headerSkipped = false;
		for (CSVRecord csvRow : rows) {
			// skip the first line which is the header.
			
			if (!headerSkipped)
			{
			    for (int i = 0; i < csvRow.size(); i++) {
			    	headerMap.put(new Integer(i), csvRow.get(i));
				}
				headerSkipped = true;
			}
			else {
				EObject object = factory.create( (EClass) eClass);
				objectList.add(object);
				// String className = csvRow.get(0);
				Map<String, String> map = csvRow.toMap();
				Set<String> keys = map.keySet();
				String stringId = null;
				for (int i = 0; i < csvRow.size(); i++) {
					String columnVal = csvRow.get(i);
					String columnKey = headerMap.get(new Integer(i));
					String relevantClassName = null;
					boolean relevantIsReference = false;
					
					EClassifier relevantDataType = null;
					EList<EStructuralFeature> contents = ((EClassImpl)eClass).getEAllStructuralFeatures();
					Iterator<EStructuralFeature> contentsIterator = contents.iterator();
					EStructuralFeature relevantFeature = null;
					while (contentsIterator.hasNext())
					{
						 EStructuralFeature feature = contentsIterator.next();
						 String featureName = feature.getName();
						 EClassifier dataType = feature.getEType();
						 Class<?> instanceClass = dataType.getInstanceClass();
						
						 boolean isReference = false;
						
						 
						 if(featureName.equals(columnKey))
						 {
							 if (feature instanceof EReferenceImpl)
							 {
								 isReference = true;
								 EObjectReferencePair objectFeaturePair = new EObjectReferencePair(object, (EReferenceImpl)feature );
								 featureMap.put(objectFeaturePair,columnVal );
							 }
							 else
								 className = instanceClass.getName();
							 relevantFeature = feature;
							 relevantClassName = className;
							 relevantIsReference = isReference;
							 relevantDataType = dataType;
							 if (feature instanceof EAttributeImpl)
							 {
								 EAttributeImpl featureAttr = (EAttributeImpl) feature;
								 if(featureAttr.isID())
								 {
									 stringId = columnVal;
								 }
									 
								 
							 }
							 
						 }
					}
					if( relevantIsReference)
					{
						//doNothign yet 					
					}
					else
					{
						Object objectVal = convertStringToObjectType(columnVal,relevantClassName);
						object.eSet(relevantFeature, objectVal);
					}

				}
				if(stringId != null)
				{
					EClassStringPair key = new EClassStringPair(eClass,stringId);
					objectMap.put(key,object);
				}

			}
			
			
		}
		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		return objectList;
	}

	private static Object convertStringToObjectType(String columnVal, String relevantClassName) {
		// TODO Auto-generated method stub
		if(relevantClassName.equals("double"))
			return Double.parseDouble(columnVal);
		else if(relevantClassName.equals("String"))
			return columnVal;
		else if(relevantClassName.equals("int"))
			return Integer.parseInt(columnVal);
		else 
			return columnVal;
	}

	private static ArrayList<File> getTestObjectFiles(String dirName) {
		// TODO Auto-generated method stub
		ArrayList<File> testFiles = new ArrayList<File>();
		File file = new File(dirName);
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			testFiles.add(files[i]);
		}
		return testFiles;
	}

	private static EList<Test> createTestForEachSceanrioTest(String scenarioDirectoryName) {
		//need to check if it is a directory
		EList<Test> tests= new BasicEList<Test>();
		File file = new File(scenarioDirectoryName);
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			File subDirectory = files[i];
			if(subDirectory.isDirectory())
			{
				String subDirectoryName = subDirectory.getName();
				Test test = Logical_transformationsFactory.eINSTANCE.createTest();
				test.setName(subDirectoryName);
				tests.add(test);	
			}
		}
		return tests;
	}

	private static void setRequirementsOnTagFromJSONMetaData(ScenarioTag scenarioTag, File scenarioMetaDataFile) {
		// TODO Auto-generated method stub
		
	}

	private static void createScenarioWithDescriptionForEachCase(String documentationReadMeFilePath,
			ServiceTask serviceTask) {
		// TODO Auto-generated method stub
		
	}

	private static String getTaskDescriptionFromDocumentationReadMeFile(String documentationReadMeFilePath) {
		String taskDescription ="";
		boolean descriptionLineFound = false;
		boolean descriptionFound = false;
		
		try {
			Path path = Paths.get(documentationReadMeFilePath);
			int counter = 0;
			List<String> fileContents = Files.readAllLines(path);
			while (!descriptionLineFound || !descriptionFound)
		    {				
				String fileLine = fileContents.get(counter);
				
				if (descriptionLineFound && !descriptionFound)
				{
					if(fileLine.trim().length() != 0)
					{
						descriptionFound = true;
						taskDescription = fileLine.trim();
					}
				}
				if(fileLine.equals("# Description"))
				{
					descriptionLineFound = true;
				}
				counter++;
		    }
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskDescription;
	}


	private static void setRequirementsOnTagFromJSONMetaData(ActivityTag activityTag, File documentationMetaData) {
		// when creating the Tag, need to find the correct requirement by parsing the JSON metadata
		// when reading the JSON we might use a JSON java library
		
	}

	private static ServiceTask getTaskFromLogicalTransformation(String taskName,
			LogicalTransformationModule logicalTransformationModule) {
		// TODO Auto-generated method stub
		ServiceTask returnTask = null;
		TreeIterator<EObject> contents = logicalTransformationModule.eAllContents();
		while (contents.hasNext())
		{
			EObject item = contents.next();
			if(item instanceof ServiceTask)
			{
				if ( ((ServiceTask) item).getName().equals(taskName))
				{
					returnTask = (ServiceTask) item;
				}
			}
		}
		return returnTask;
	}

	private static String getTaskNameFromDocumentationReadMeFile(String documentationReadMeFilePath) {
		
		String taskName ="";
		boolean taskLineFound = false;
		boolean taskNameFound = false;
		
		try {
			Path path = Paths.get(documentationReadMeFilePath);
			int counter = 0;
			List<String> fileContents = Files.readAllLines(path);
			while (!taskLineFound || !taskNameFound)
		    {				
				String fileLine = fileContents.get(counter);
				
				if (taskLineFound && !taskNameFound)
				{
					if(fileLine.trim().length() != 0)
					{
						taskNameFound = true;
						taskName = fileLine.trim();
					}
				}
				if(fileLine.equals("# Logical Transformation Task"))
				{
					taskLineFound = true;
				}
				counter++;
		    }
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskName;
	}
	
	private static List<CSVRecord> getCSVRowsFromFile(String fileName) throws IOException  {
		// TODO Auto-generated method stub
		File csvData = new File (fileName);
		 CSVParser parser = CSVParser.parse(csvData,StandardCharsets.UTF_8, CSVFormat.EXCEL);
		 Map<String, Integer> headerMap = parser.getHeaderMap();
		 List<CSVRecord> list = new ArrayList<CSVRecord>();
		 for (CSVRecord csvRecord : parser) {
			
			 list.add(csvRecord);
		 }
		 return list;
	}

}
