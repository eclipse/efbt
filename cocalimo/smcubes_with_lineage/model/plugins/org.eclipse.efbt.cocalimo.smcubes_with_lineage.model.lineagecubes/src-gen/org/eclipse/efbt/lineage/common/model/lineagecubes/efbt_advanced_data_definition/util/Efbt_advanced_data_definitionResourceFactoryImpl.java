/**
 */
package org.eclipse.efbt.lineage.common.model.lineagecubes.efbt_advanced_data_definition.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.lineage.common.model.lineagecubes.efbt_advanced_data_definition.util.Efbt_advanced_data_definitionResourceImpl
 * @generated
 */
public class Efbt_advanced_data_definitionResourceFactoryImpl extends ResourceFactoryImpl
{
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Efbt_advanced_data_definitionResourceFactoryImpl()
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
		Resource result = new Efbt_advanced_data_definitionResourceImpl(uri);
		return result;
	}

} //Efbt_advanced_data_definitionResourceFactoryImpl
