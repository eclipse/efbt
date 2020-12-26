/**
 */
package org.eclipse.efbt.cocamo.core.model.requirements_text.util;

import java.util.Map;

import org.eclipse.efbt.cocamo.core.model.requirements_text.Requirements_textPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Requirements_textXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements_textXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		Requirements_textPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Requirements_textResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new Requirements_textResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Requirements_textResourceFactoryImpl());
		}
		return registrations;
	}

} //Requirements_textXMLProcessor
