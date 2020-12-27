/**
 */
package org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.util;

import java.util.Map;

import org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.Advanced_variable_lineagefunctionsPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Advanced_variable_lineagefunctionsXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advanced_variable_lineagefunctionsXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Advanced_variable_lineagefunctionsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Advanced_variable_lineagefunctionsResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Advanced_variable_lineagefunctionsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Advanced_variable_lineagefunctionsResourceFactoryImpl());
		}
		return registrations;
	}

} //Advanced_variable_lineagefunctionsXMLProcessor
