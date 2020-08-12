/**
 */
package org.eclipse.efbt.data_structures.smcubes.model.efbt_vtl_transformation.util;

import java.util.Map;

import org.eclipse.efbt.data_structures.smcubes.model.efbt_vtl_transformation.Efbt_vtl_transformationPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Efbt_vtl_transformationXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Efbt_vtl_transformationXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Efbt_vtl_transformationPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Efbt_vtl_transformationResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Efbt_vtl_transformationResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Efbt_vtl_transformationResourceFactoryImpl());
		}
		return registrations;
	}

} //Efbt_vtl_transformationXMLProcessor
