/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic;

import org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.ResolvedStructColumnParameter;

import org.eclipse.efbt.lineage.common.model.column_transformation_logic.CubeColumn;
import org.eclipse.efbt.lineage.common.model.column_transformation_logic.ResolvedCubeColumnParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Creation Approach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RowCreationApproach which describes how Rows are generated, and linked to rows from the source cubes.
 *             	 The row Function by default does not set any column values in the rows, however to allow more flexibility in a language, we also allow optionally for the row function to set fields in the created row. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach#getDependantCubeColumns <em>Dependant Cube Columns</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach#getCreatedCubeColumns <em>Created Cube Columns</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach#getDependantStructItemColumns <em>Dependant Struct Item Columns</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage#getRowCreationApproach()
 * @model extendedMetaData="name='RowCreationApproach' kind='elementOnly'"
 * @generated
 */
public interface RowCreationApproach extends EObject
{
	/**
	 * Returns the value of the '<em><b>Dependant Cube Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.lineage.common.model.column_transformation_logic.ResolvedCubeColumnParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameters (from functions) which contain the CubeColumns from the source which are used to determine how to create and link the created rows. 
	 *             	For example these could  be the CubeColumns used for grouping, or filtering, or joining. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependant Cube Columns</em>' containment reference list.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage#getRowCreationApproach_DependantCubeColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependantCubeColumns'"
	 * @generated
	 */
	EList<ResolvedCubeColumnParameter> getDependantCubeColumns();

	/**
	 * Returns the value of the '<em><b>Created Cube Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.lineage.common.model.column_transformation_logic.CubeColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any cubeColumns which are set explicitly by the row function. 
	 * An example here would be uniquely setting a CubeColumn called index if the row function is responsable for creating multiple rows from one source row.
	 * Another example would be setting a field called index if the row is responsable for ordering a set of rows and setting index to indicate ordering position.
	 * In most common cases this field is empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created Cube Columns</em>' containment reference list.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage#getRowCreationApproach_CreatedCubeColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='createdCubeColumns'"
	 * @generated
	 */
	EList<CubeColumn> getCreatedCubeColumns();

	/**
	 * Returns the value of the '<em><b>Dependant Struct Item Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.ResolvedStructColumnParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameters (from functions) which contain the CubeColumns from the source which are used to determine how to create and link the created rows. 
	 *             	For example these could  be the CubeColumns used for grouping, or filtering, or joining. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependant Struct Item Columns</em>' containment reference list.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage#getRowCreationApproach_DependantStructItemColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependantCubeColumns'"
	 * @generated
	 */
	EList<ResolvedStructColumnParameter> getDependantStructItemColumns();

} // RowCreationApproach
