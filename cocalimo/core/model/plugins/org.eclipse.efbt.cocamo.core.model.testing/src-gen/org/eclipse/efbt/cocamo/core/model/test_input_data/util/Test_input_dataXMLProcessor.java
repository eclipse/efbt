/**
 */
package org.eclipse.efbt.cocamo.core.model.test_input_data.util;

import java.util.Map;

import org.eclipse.efbt.cocamo.core.model.test_input_data.Test_input_dataPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Test_input_dataXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test_input_dataXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Test_input_dataPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Test_input_dataResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Test_input_dataResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Test_input_dataResourceFactoryImpl());
		}
		return registrations;
	}

} //Test_input_dataXMLProcessor
