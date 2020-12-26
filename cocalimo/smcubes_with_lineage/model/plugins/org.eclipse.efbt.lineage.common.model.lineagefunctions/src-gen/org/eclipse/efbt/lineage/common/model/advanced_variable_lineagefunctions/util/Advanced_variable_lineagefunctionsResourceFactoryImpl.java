/**
 */
package org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.util.Advanced_variable_lineagefunctionsResourceImpl
 * @generated
 */
public class Advanced_variable_lineagefunctionsResourceFactoryImpl extends ResourceFactoryImpl
{
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advanced_variable_lineagefunctionsResourceFactoryImpl()
	{
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri)
	{
		Resource result = new Advanced_variable_lineagefunctionsResourceImpl(uri);
		return result;
	}

} //Advanced_variable_lineagefunctionsResourceFactoryImpl
