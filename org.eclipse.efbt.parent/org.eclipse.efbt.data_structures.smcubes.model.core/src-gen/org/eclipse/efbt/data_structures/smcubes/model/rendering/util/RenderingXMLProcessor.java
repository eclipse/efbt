/**
 */
package org.eclipse.efbt.data_structures.smcubes.model.rendering.util;

import java.util.Map;

import org.eclipse.efbt.data_structures.smcubes.model.rendering.RenderingPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RenderingXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		RenderingPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the RenderingResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new RenderingResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new RenderingResourceFactoryImpl());
		}
		return registrations;
	}

} //RenderingXMLProcessor
