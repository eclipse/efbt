/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.efbt_mapping.util;

import java.util.Map;

import org.eclipse.efbt.cocamo.smcubes.model.efbt_mapping.Efbt_mappingPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Efbt_mappingXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Efbt_mappingXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Efbt_mappingPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Efbt_mappingResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Efbt_mappingResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Efbt_mappingResourceFactoryImpl());
		}
		return registrations;
	}

} //Efbt_mappingXMLProcessor
