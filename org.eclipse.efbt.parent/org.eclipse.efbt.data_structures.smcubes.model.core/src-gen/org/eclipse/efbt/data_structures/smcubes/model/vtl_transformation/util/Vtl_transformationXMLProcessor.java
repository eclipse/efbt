/**
 */
package org.eclipse.efbt.data_structures.smcubes.model.vtl_transformation.util;

import java.util.Map;

import org.eclipse.efbt.data_structures.smcubes.model.vtl_transformation.Vtl_transformationPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Vtl_transformationXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vtl_transformationXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Vtl_transformationPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Vtl_transformationResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Vtl_transformationResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Vtl_transformationResourceFactoryImpl());
		}
		return registrations;
	}

} //Vtl_transformationXMLProcessor
