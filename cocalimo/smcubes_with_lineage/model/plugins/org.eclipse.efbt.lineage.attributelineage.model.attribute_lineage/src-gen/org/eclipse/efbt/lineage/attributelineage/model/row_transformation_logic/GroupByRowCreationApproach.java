/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic;

import org.eclipse.efbt.cocamo.smcubes.model.core.VARIABLE;

import org.eclipse.efbt.lineage.common.model.column_transformation_logic.CubeColumn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group By Row Creation Approach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RowCreationApproach which describes how single rows are created by grouping  multiple rows from a source cube according to a grouping condition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach#getGroupByColumns <em>Group By Columns</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach#getGroupByCubeColumns <em>Group By Cube Columns</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage#getGroupByRowCreationApproach()
 * @model extendedMetaData="name='GroupByRowCreationApproach' kind='elementOnly'"
 * @generated
 */
public interface GroupByRowCreationApproach extends RowCreationApproach
{
	/**
	 * Returns the value of the '<em><b>Group By Columns</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.smcubes.model.core.VARIABLE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The columns to use to group the source cube by, e.g. grouping a  cube by a a column called Currency will lead to one row per unique currency in the source cube rows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group By Columns</em>' reference list.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage#getGroupByRowCreationApproach_GroupByColumns()
	 * @model extendedMetaData="kind='attribute' name='groupByColumns'"
	 * @generated
	 */
	EList<VARIABLE> getGroupByColumns();

	/**
	 * Returns the value of the '<em><b>Group By Cube Columns</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.lineage.common.model.column_transformation_logic.CubeColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CubeColumns to use to group the source cube by, e.g. grouping a cube by a a column called Currency will lead to one row per unique currency in the source cube rows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group By Cube Columns</em>' reference list.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage#getGroupByRowCreationApproach_GroupByCubeColumns()
	 * @model extendedMetaData="kind='attribute' name='groupByCubeColumns'"
	 * @generated
	 */
	EList<CubeColumn> getGroupByCubeColumns();

} // GroupByRowCreationApproach
