/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.efbt_vtl_transformation.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.cocamo.smcubes.model.efbt_vtl_transformation.util.Efbt_vtl_transformationResourceImpl
 * @generated
 */
public class Efbt_vtl_transformationResourceFactoryImpl extends ResourceFactoryImpl
{
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Efbt_vtl_transformationResourceFactoryImpl()
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
		Resource result = new Efbt_vtl_transformationResourceImpl(uri);
		return result;
	}

} //Efbt_vtl_transformationResourceFactoryImpl
