/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition.util;

import java.util.Map;

import org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Test_definitionXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test_definitionXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Test_definitionPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Test_definitionResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations()
	{
		if (registrations == null)
		{
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Test_definitionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Test_definitionResourceFactoryImpl());
		}
		return registrations;
	}

} //Test_definitionXMLProcessor
