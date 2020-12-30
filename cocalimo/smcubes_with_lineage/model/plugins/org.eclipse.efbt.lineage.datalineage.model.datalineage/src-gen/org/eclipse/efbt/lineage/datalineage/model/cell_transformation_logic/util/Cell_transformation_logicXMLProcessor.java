/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.util;

import java.util.Map;

import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Cell_transformation_logicXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell_transformation_logicXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Cell_transformation_logicPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Cell_transformation_logicResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Cell_transformation_logicResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Cell_transformation_logicResourceFactoryImpl());
		}
		return registrations;
	}

} //Cell_transformation_logicXMLProcessor
