/**
 */
package org.eclipse.efbt.lineage.datalineage.model.data_lineage.util;

import java.util.Map;

import org.eclipse.efbt.lineage.datalineage.model.data_lineage.Data_lineagePackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Data_lineageXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_lineageXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Data_lineagePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Data_lineageResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Data_lineageResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Data_lineageResourceFactoryImpl());
		}
		return registrations;
	}

} //Data_lineageXMLProcessor
