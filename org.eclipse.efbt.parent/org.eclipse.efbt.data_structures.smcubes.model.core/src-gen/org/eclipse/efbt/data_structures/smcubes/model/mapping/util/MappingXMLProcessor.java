/**
 */
package org.eclipse.efbt.data_structures.smcubes.model.mapping.util;

import java.util.Map;

import org.eclipse.efbt.data_structures.smcubes.model.mapping.MappingPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		MappingPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the MappingResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new MappingResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new MappingResourceFactoryImpl());
		}
		return registrations;
	}

} //MappingXMLProcessor
