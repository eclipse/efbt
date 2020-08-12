/**
 */
package org.eclipse.efbt.chirp.chirp_program.util;

import java.util.Map;

import org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Chirp_programXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chirp_programXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Chirp_programPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Chirp_programResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Chirp_programResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Chirp_programResourceFactoryImpl());
		}
		return registrations;
	}

} //Chirp_programXMLProcessor
