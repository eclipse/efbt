/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.util;

import java.util.Map;

import org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.Advanced_row_transformation_logicPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Advanced_row_transformation_logicXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advanced_row_transformation_logicXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Advanced_row_transformation_logicPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Advanced_row_transformation_logicResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Advanced_row_transformation_logicResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Advanced_row_transformation_logicResourceFactoryImpl());
		}
		return registrations;
	}

} //Advanced_row_transformation_logicXMLProcessor
