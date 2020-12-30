/**
 */
package org.eclipse.efbt.lineage.common.model.lineagecubes.incremental_cubes.util;

import java.util.Map;

import org.eclipse.efbt.lineage.common.model.lineagecubes.incremental_cubes.Incremental_cubesPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Incremental_cubesXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incremental_cubesXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Incremental_cubesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Incremental_cubesResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Incremental_cubesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Incremental_cubesResourceFactoryImpl());
		}
		return registrations;
	}

} //Incremental_cubesXMLProcessor
