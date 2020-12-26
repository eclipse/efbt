/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach;

import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.FreeBirdToolsCube;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Accumulation Row Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RowCreationApproach which describes how single rows are created when AccumulatingDeltas from a BaseDeltaCube and another DeltaAccumulation DerivedCube
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction#getUltimateCubeSource <em>Ultimate Cube Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage#getDeltaAccumulationRowFunction()
 * @model
 * @generated
 */
public interface DeltaAccumulationRowFunction extends RowCreationApproach
{
	/**
	 * Returns the value of the '<em><b>Ultimate Cube Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associated BaseCube
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ultimate Cube Source</em>' reference.
	 * @see #setUltimateCubeSource(FreeBirdToolsCube)
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage#getDeltaAccumulationRowFunction_UltimateCubeSource()
	 * @model
	 * @generated
	 */
	FreeBirdToolsCube getUltimateCubeSource();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction#getUltimateCubeSource <em>Ultimate Cube Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Cube Source</em>' reference.
	 * @see #getUltimateCubeSource()
	 * @generated
	 */
	void setUltimateCubeSource(FreeBirdToolsCube value);

} // DeltaAccumulationRowFunction
