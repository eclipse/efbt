/**
 */
package org.eclipse.efbt.lineage.common.model.lineagecubes.incremental_cubes.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.lineage.common.model.lineagecubes.incremental_cubes.util.Incremental_cubesResourceImpl
 * @generated
 */
public class Incremental_cubesResourceFactoryImpl extends ResourceFactoryImpl
{
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incremental_cubesResourceFactoryImpl()
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
		Resource result = new Incremental_cubesResourceImpl(uri);
		return result;
	}

} //Incremental_cubesResourceFactoryImpl
