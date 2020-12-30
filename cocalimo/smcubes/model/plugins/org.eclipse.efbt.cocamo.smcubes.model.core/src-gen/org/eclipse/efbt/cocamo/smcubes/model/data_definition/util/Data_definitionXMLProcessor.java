/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.data_definition.util;

import java.util.Map;

import org.eclipse.efbt.cocamo.smcubes.model.data_definition.Data_definitionPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Data_definitionXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_definitionXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Data_definitionPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Data_definitionResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Data_definitionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Data_definitionResourceFactoryImpl());
		}
		return registrations;
	}

} //Data_definitionXMLProcessor
