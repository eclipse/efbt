/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach;

import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.BaseCube;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base View Incorporating Deltas Row Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RowCreationApproach which describes how single rows are created when creating a BaseView by incorporating a set of deltas into a BaseCube.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction#getUltimateCubeSource <em>Ultimate Cube Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage#getBaseViewIncorporatingDeltasRowFunction()
 * @model
 * @generated
 */
public interface BaseViewIncorporatingDeltasRowFunction extends RowCreationApproach
{
	/**
	 * Returns the value of the '<em><b>Ultimate Cube Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associated BaseCube
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ultimate Cube Source</em>' reference.
	 * @see #setUltimateCubeSource(BaseCube)
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage#getBaseViewIncorporatingDeltasRowFunction_UltimateCubeSource()
	 * @model
	 * @generated
	 */
	BaseCube getUltimateCubeSource();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction#getUltimateCubeSource <em>Ultimate Cube Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Cube Source</em>' reference.
	 * @see #getUltimateCubeSource()
	 * @generated
	 */
	void setUltimateCubeSource(BaseCube value);

} // BaseViewIncorporatingDeltasRowFunction
