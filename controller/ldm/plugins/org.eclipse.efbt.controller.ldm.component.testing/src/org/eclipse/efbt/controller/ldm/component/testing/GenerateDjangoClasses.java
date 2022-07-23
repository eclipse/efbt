package org.eclipse.efbt.controller.ldm.component.testing;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.DOMAIN;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.FACET_VALUE_TYPE;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.MEMBER;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.VARIABLE;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.SUBDOMAIN;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.SUBDOMAIN_ENUMERATION;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.Attribute;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.BasicEntity;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.DerivedEntity;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.Entity;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.EntityModule;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.GeneratedEntity;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.ManyToOneRelationshipAttribute;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.OneToManyRelationshipAttribute;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.OneToOneRelationshipAttribute;
import org.eclipse.efbt.openregspecs.model.open_reg_specs.RelationshipAttribute;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class GenerateDjangoClasses {

	public static void convert(String fileDirectory, EntityModule entityModule) {

		FileWriter fw = new FileWriter(fileDirectory + "\\django.py");
		fw.write("from django.db import models\r\n\r\n");
		EList<Entity> enitities = entityModule.getEntities();
		for (Entity entity : enitities) {
			fw.write("class "+entity.getName()+"(models.Model):\r\n");
			if(entity instanceof BasicEntity)
			{
				BasicEntity basicEntity = (BasicEntity) entity;
				EList<Attribute> attributes = basicEntity.getAttributes();
				for (Attribute attribute : attributes) {
					 if(attribute instanceof RelationshipAttribute)
					 {
						 
					 }
					 else
					 {
						 fw.write("    " + attribute.getName());
						 
						 boolean isDomainEnumerated = ((VARIABLE) attribute.getConcept()).getDomain_id().isIs_enumerated();
						 if(isDomainEnumerated)
						 {
							 EEnum eenum = getEnumClassifier(epackage, (SUBDOMAIN) attribute.getType());
							 eAttribute.setEType(eenum);
						 }
						 else
						 {
							 FACET_VALUE_TYPE facetValueType = ((VARIABLE) attribute.getConcept()).getDomain_id().getData_type();
							 EDataType dtype = getDJangoDataTypeFromFacetValueType(facetValueType,epackage);
							 eAttribute.setEType(dtype);
						 }
						
						 eclass.getEAttributes().add(eAttribute);
					 }
				}	
				
				epackage.getEClassifiers().add(eclass);
			}
			if(entity instanceof DerivedEntity)
			{
				DerivedEntity derivedEntity = (DerivedEntity) entity;
				EList<Attribute> attributes = derivedEntity.getAttributes();
				for (Attribute attribute : attributes) {
					 if(attribute instanceof RelationshipAttribute)
					 {
						 
					 }
					 else
					 {
						 EAttribute eAttribute = EcoreFactory.eINSTANCE.createEAttribute();
						 eAttribute.setName(attribute.getName());
						 boolean isDomainEnumerated = ((VARIABLE) attribute.getConcept()).getDomain_id().isIs_enumerated();
						 if(isDomainEnumerated)
						 {
							 EEnum eenum = getEnumClassifier(epackage, (SUBDOMAIN) attribute.getType());
							 eAttribute.setEType(eenum);
						 }
						 else
						 {
							 FACET_VALUE_TYPE facetValueType = ((VARIABLE) attribute.getConcept()).getDomain_id().getData_type();
							 EDataType dtype = getEcoreDataTypeFromFacetValueType(facetValueType,epackage);
							 eAttribute.setEType(dtype);
						 }
						
						 eclass.getEAttributes().add(eAttribute);
					 }
				}	
				
				epackage.getEClassifiers().add(eclass);
			}
			if(entity instanceof GeneratedEntity)
			{
				GeneratedEntity generatedEntity = (GeneratedEntity) entity;
				EList<Attribute> attributes = generatedEntity.getAttributes();
				for (Attribute attribute : attributes) {
					 if(attribute instanceof RelationshipAttribute)
					 {
						 
					 }
					 else
					 {
						 EAttribute eAttribute = EcoreFactory.eINSTANCE.createEAttribute();
						 eAttribute.setName(attribute.getName());
						 boolean isDomainEnumerated = ((VARIABLE) ((VARIABLE) attribute.getConcept())).getDomain_id().isIs_enumerated();
						 if(isDomainEnumerated)
						 {
							 EEnum eenum = getEnumClassifier(epackage, (SUBDOMAIN) attribute.getType());
							 eAttribute.setEType(eenum);
						 }
						 else
						 {
							 FACET_VALUE_TYPE facetValueType = ((VARIABLE) attribute.getConcept()).getDomain_id().getData_type();
							 EDataType dtype = getEcoreDataTypeFromFacetValueType(facetValueType,epackage);
							 eAttribute.setEType(dtype);
						 }
						
						 eclass.getEAttributes().add(eAttribute);
					 }
				}	
				
				epackage.getEClassifiers().add(eclass);
			}
		}
		
		//add superclass
		for (Entity entity : enitities) {
			if(entity instanceof BasicEntity)
			{
				BasicEntity basicEntity = (BasicEntity) entity;
				BasicEntity superClass = basicEntity.getSuperClass();
				if(superClass != null)
				{
					EClass eclass = getEClassForEntity(epackage,entity);
					EClass eSuperclass = getEClassForEntity(epackage,superClass);
					eclass.getESuperTypes().add(eSuperclass);
				}
			}
		}
		//add referenced enums
		for (Entity entity : enitities) {
			if(entity instanceof BasicEntity)
			{
				BasicEntity basicEntity = (BasicEntity) entity;
				EList<Attribute> attributes = basicEntity.getAttributes();
				for (Attribute attribute : attributes) {
					 if(attribute instanceof RelationshipAttribute)
					 {
						 RelationshipAttribute relAttribute = (RelationshipAttribute) attribute;
						 EReference reference = EcoreFactory.eINSTANCE.createEReference();
						 Entity relatedEntity = relAttribute.getEntity();
						 EClass relatedeclass = getEClassForEntity(epackage,relatedEntity);
						 EClass entityeclass  = getEClassForEntity(epackage,entity);
						 reference.setEType(relatedeclass);
						 reference.setName(relAttribute.getName());
						 reference.setContainment(relAttribute.isContainment());
						 boolean mandatory = relAttribute.isMandatory();
						 if (!mandatory)
						 {
							 reference.setLowerBound(0); 
						 }
						 else
						 {
							 reference.setLowerBound(1);
						 }
						 if(attribute instanceof OneToOneRelationshipAttribute)
						 {
							 reference.setUpperBound(1);
						 }
						 if(attribute instanceof ManyToOneRelationshipAttribute)
						 {
							 reference.setUpperBound(1);							 
						 }
						 if(attribute instanceof OneToManyRelationshipAttribute)
						 {
							 reference.setUpperBound(-1);
							
						 }
						 entityeclass.getEReferences().add(reference);
					 }
				}
			}
			if(entity instanceof DerivedEntity)
			{
				DerivedEntity derivedEntity = (DerivedEntity) entity;
				EList<Attribute> attributes = derivedEntity.getAttributes();
				for (Attribute attribute : attributes) {
					 if(attribute instanceof RelationshipAttribute)
					 {
						 RelationshipAttribute relAttribute = (RelationshipAttribute) attribute;
						 EReference reference = EcoreFactory.eINSTANCE.createEReference();
						 Entity relatedEntity = relAttribute.getEntity();
						 EClass relatedeclass = getEClassForEntity(epackage,relatedEntity);
						 EClass entityeclass  = getEClassForEntity(epackage,entity);
						 reference.setEType(relatedeclass);
						 reference.setName(relAttribute.getName());
						 
						 reference.setContainment(relAttribute.isContainment());
						 boolean mandatory = relAttribute.isMandatory();
						 if (!mandatory)
						 {
							 reference.setLowerBound(0); 
						 }
						 else
						 {
							 reference.setLowerBound(1);
						 }
						 if(attribute instanceof OneToOneRelationshipAttribute)
						 {
							 reference.setUpperBound(1);
						 }
						 if(attribute instanceof ManyToOneRelationshipAttribute)
						 {
							 reference.setUpperBound(1);
							
						 }
						 if(attribute instanceof OneToManyRelationshipAttribute)
						 {
							 reference.setUpperBound(-1);
							
						 }
						 entityeclass.getEReferences().add(reference);
					 }
				}
			}
			if(entity instanceof GeneratedEntity)
			{
				GeneratedEntity generatedEntity = (GeneratedEntity) entity;
				EList<Attribute> attributes = generatedEntity.getAttributes();
				for (Attribute attribute : attributes) {
					 if(attribute instanceof RelationshipAttribute)
					 {
						 RelationshipAttribute relAttribute = (RelationshipAttribute) attribute;
						 EReference reference = EcoreFactory.eINSTANCE.createEReference();
						 Entity relatedEntity = relAttribute.getEntity();
						 EClass relatedeclass = getEClassForEntity(epackage,relatedEntity);
						 EClass entityeclass  = getEClassForEntity(epackage,entity);
						 reference.setEType(relatedeclass);
						 reference.setEType(relatedeclass);
						 reference.setName(relAttribute.getName());
						 reference.setContainment(relAttribute.isContainment());
						 boolean mandatory = relAttribute.isMandatory();
						 if (!mandatory)
						 {
							 reference.setLowerBound(0); 
						 }
						 else
						 {
							 reference.setLowerBound(1);
						 }
						 if(attribute instanceof OneToOneRelationshipAttribute)
						 {
							 reference.setUpperBound(1);
						 }
						 if(attribute instanceof ManyToOneRelationshipAttribute)
						 {
							 reference.setUpperBound(1);
							
						 }
						 if(attribute instanceof OneToManyRelationshipAttribute)
						 {
							 reference.setUpperBound(-1);
							
						 }
						 entityeclass.getEReferences().add(reference);
					 }
				}
			}
			
		}
		
		 
		 
		 
		ResourceFactoryImpl resourceFactory = new XMIResourceFactoryImpl();
		URI modelURI = URI.createFileURI(fileDirectory + "\\dmm.ecore");

		Resource dmmResource = resourceFactory.createResource(modelURI);
		dmmResource.getContents().add(epackage);
		try {
			dmmResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// persist the resource
		
		
	}
	
	private static EClass getEClassForEntity(EPackage epackage, Entity entity) {
		EList<EClassifier> classifiers = epackage.getEClassifiers();
		EClass returnValue= null;
		for (EClassifier eClassifier : classifiers) {
			if(eClassifier instanceof EClass)
			{
				if(eClassifier.getName().equals(entity.getName()))
					returnValue = (EClass) eClassifier;
			}
					
		}
		return returnValue;
	}

	private static EEnum getEnumClassifier(EPackage epackage, SUBDOMAIN subdomain) {
		// return Enum or create it and return it
		EList<EClassifier> classifiers = epackage.getEClassifiers();
		EEnum returnValue= null;
		for (EClassifier eClassifier : classifiers) {
			if(eClassifier instanceof EEnum)
			{
				if(eClassifier.getName().equals(subdomain.getName()))
					returnValue = (EEnum) eClassifier;
			}
					
		}
		if (returnValue == null)
		{
			EEnum eenum = EcoreFactory.eINSTANCE.createEEnum();
			eenum.setName(subdomain.getCode());
			EList<SUBDOMAIN_ENUMERATION> subDomainItems = subdomain.getItems();
			// EList<MEMBER> members = subdomain_ENUMERATION.getMember_ids();
			int counter=0;
			for (SUBDOMAIN_ENUMERATION subdomain_ENUMERATION : subDomainItems) {
				
				MEMBER member = subdomain_ENUMERATION.getMember_id();
				EEnumLiteral eliteral= EcoreFactory.eINSTANCE.createEEnumLiteral();
				counter++;
				eliteral.setLiteral(member.getCode());
				eliteral.setName(member.getCode());
				eliteral.setValue(counter);
				eenum.getELiterals().add(eliteral);

			}
			epackage.getEClassifiers().add(eenum);
			returnValue = eenum;
		}
		return returnValue;
	}

	private static String  getDjangoDataTypeFromFacetValueType(FACET_VALUE_TYPE facetValueType, EPackage epackage) {
		String returnType = null;
		if (facetValueType == FACET_VALUE_TYPE.BIG_INTEGER )
			returnType = ;
		if (facetValueType == FACET_VALUE_TYPE.STRING )
			returnType = "models.CharField(max_length=255)";
		if (facetValueType == FACET_VALUE_TYPE.DOUBLE )
			returnType = ;
		
		return returnType;
		
		
	}

	public static void main(String[] args)
	{
		convert(null,null);
	}
}

