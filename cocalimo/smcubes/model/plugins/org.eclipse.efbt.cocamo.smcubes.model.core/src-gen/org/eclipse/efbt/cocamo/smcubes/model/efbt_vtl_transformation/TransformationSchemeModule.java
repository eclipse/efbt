/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.efbt_vtl_transformation;

import org.eclipse.efbt.cocamo.smcubes.model.vtl_transformation.TRANSFORMATION_SCHEME;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Scheme Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Module of Tranformation Schemes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.efbt_vtl_transformation.TransformationSchemeModule#getSchemes <em>Schemes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocamo.smcubes.model.efbt_vtl_transformation.Efbt_vtl_transformationPackage#getTransformationSchemeModule()
 * @model
 * @generated
 */
public interface TransformationSchemeModule extends org.eclipse.efbt.cocamo.core.model.module_management.Module
{
	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.smcubes.model.vtl_transformation.TRANSFORMATION_SCHEME}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TransformationSchemes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schemes</em>' containment reference list.
	 * @see org.eclipse.efbt.cocamo.smcubes.model.efbt_vtl_transformation.Efbt_vtl_transformationPackage#getTransformationSchemeModule_Schemes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TRANSFORMATION_SCHEME> getSchemes();

} // TransformationSchemeModule
