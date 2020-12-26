/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.smcubes_model.util;

import java.util.Map;

import org.eclipse.efbt.cocamo.smcubes.model.smcubes_model.Smcubes_modelPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Smcubes_modelXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smcubes_modelXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Smcubes_modelPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Smcubes_modelResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Smcubes_modelResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Smcubes_modelResourceFactoryImpl());
		}
		return registrations;
	}

} //Smcubes_modelXMLProcessor
