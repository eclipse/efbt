/**
 */
package org.eclipse.efbt.lineage.common.model.lineagecubes.efbt_advanced_data_definition.util;

import java.util.Map;

import org.eclipse.efbt.lineage.common.model.lineagecubes.efbt_advanced_data_definition.Efbt_advanced_data_definitionPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Efbt_advanced_data_definitionXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Efbt_advanced_data_definitionXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Efbt_advanced_data_definitionPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Efbt_advanced_data_definitionResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Efbt_advanced_data_definitionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Efbt_advanced_data_definitionResourceFactoryImpl());
		}
		return registrations;
	}

} //Efbt_advanced_data_definitionXMLProcessor
