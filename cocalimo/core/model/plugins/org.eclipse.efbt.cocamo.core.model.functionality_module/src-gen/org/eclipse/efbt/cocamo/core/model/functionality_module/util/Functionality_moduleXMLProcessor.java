/**
 */
package org.eclipse.efbt.cocamo.core.model.functionality_module.util;

import java.util.Map;

import org.eclipse.efbt.cocamo.core.model.functionality_module.Functionality_modulePackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Functionality_moduleXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functionality_moduleXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Functionality_modulePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Functionality_moduleResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Functionality_moduleResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Functionality_moduleResourceFactoryImpl());
		}
		return registrations;
	}

} //Functionality_moduleXMLProcessor
