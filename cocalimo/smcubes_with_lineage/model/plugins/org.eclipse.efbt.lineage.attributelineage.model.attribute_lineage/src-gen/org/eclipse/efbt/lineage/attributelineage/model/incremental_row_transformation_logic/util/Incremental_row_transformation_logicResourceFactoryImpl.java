/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.util.Incremental_row_transformation_logicResourceImpl
 * @generated
 */
public class Incremental_row_transformation_logicResourceFactoryImpl extends ResourceFactoryImpl
{
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incremental_row_transformation_logicResourceFactoryImpl()
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
		Resource result = new Incremental_row_transformation_logicResourceImpl(uri);
		return result;
	}

} //Incremental_row_transformation_logicResourceFactoryImpl
