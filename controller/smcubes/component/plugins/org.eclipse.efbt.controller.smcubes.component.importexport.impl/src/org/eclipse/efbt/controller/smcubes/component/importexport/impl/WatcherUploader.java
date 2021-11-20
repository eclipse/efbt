package org.eclipse.efbt.controller.smcubes.component.importexport.impl;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.efbt.cocalimo.core.model.bpmn_lite.ServiceTask;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.ActivityTag;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.LogicalTransformationModule;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.Logical_transformationsFactory;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.Scenario;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.ScenarioTag;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.Test;
import org.eclipse.efbt.cocalimo.core.model.logical_transformations.TestModule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class WatcherUploader {

	public static void uploadWatcher(String inputDirectory, 
									 String testsDirectory, 
									 LogicalTransformationModule logicalTransformationModule) {
		// get the documentation/readME file
		File documentationReadMeFile = new File(inputDirectory +"\\documentation\\README.md");
		// find the Task Name
		String taskName= getTaskNameFromDocumentationReadMeFile(documentationReadMeFile);
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
		String description= getTaskDescriptionFromDocumentationReadMeFile(documentationReadMeFile);
		serviceTask.setDescription(description);
		// for each scenario create a scenario and add it to the task, with a description
		createScenarioWithDescriptionForEachCase(documentationReadMeFile,serviceTask);
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
				for (File testObjectFile : testObjectFiles) {
					EList<EObject> testObjects = creatEObjectFromCSVFile(testObjectFile);
					// serialize these objects to XMI and store them in the correect output directory.
					persistTestObjects (testObjects, testDirectory);
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
				
				
			}

		}

	}

	private static void persistTestObjects(EList<EObject> testObjects, File testDirectory) {
		// TODO Auto-generated method stub
		
	}

	private static void persistTestObject(EObject testObject, File testDirectory) {
		// TODO Auto-generated method stub
		
	}

	private static EList<EObject> creatEObjectFromCSVFile(File testObjectFile) {
		// for the file derive an EClass from the name
		// for each row in the file, create an eObject in the relevant output tests directory, using the class name andthen1,2,3 etc...or potentialy the ID
				
		return null;
	}

	private static ArrayList<File> getTestObjectFiles(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static EList<Test> createTestForEachSceanrioTest(String scenarioDirectoryName) {
		// check the subdirectorries of the directory
		return null;
	}

	private static void setRequirementsOnTagFromJSONMetaData(ScenarioTag scenarioTag, File scenarioMetaDataFile) {
		// TODO Auto-generated method stub
		
	}

	private static void createScenarioWithDescriptionForEachCase(File documentationReadMeFile,
			ServiceTask serviceTask) {
		// TODO Auto-generated method stub
		
	}

	private static String getTaskDescriptionFromDocumentationReadMeFile(File documentationReadMeFile) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void setRequirementsOnTagFromJSONMetaData(ActivityTag activityTag, File documentationMetaData) {
		// when creating the Tag, need to find the correct requirement by parsing the JSON metadata
		// when reading the JSON we might use a JSON java library
		
	}

	private static ServiceTask getTaskFromLogicalTransformation(String taskName,
			LogicalTransformationModule logicalTransformationModule) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getTaskNameFromDocumentationReadMeFile(File documentationReadMeFile) {
		// TODO Auto-generated method stub
		return null;
	}

}
