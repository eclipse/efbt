/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach;

import org.eclipse.efbt.lineage.common.model.lineagecubes.efbt_advanced_data_definition.ArrayTypedVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explode Array Of Structs Row Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.ExplodeArrayOfStructsRowFunction#getArraySourceVariable <em>Array Source Variable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.Advanced_row_transformation_logicPackage#getExplodeArrayOfStructsRowFunction()
 * @model
 * @generated
 */
public interface ExplodeArrayOfStructsRowFunction extends RowCreationApproach
{
	/**
	 * Returns the value of the '<em><b>Array Source Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Source Variable</em>' reference.
	 * @see #setArraySourceVariable(ArrayTypedVariable)
	 * @see org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.Advanced_row_transformation_logicPackage#getExplodeArrayOfStructsRowFunction_ArraySourceVariable()
	 * @model
	 * @generated
	 */
	ArrayTypedVariable getArraySourceVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.ExplodeArrayOfStructsRowFunction#getArraySourceVariable <em>Array Source Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Source Variable</em>' reference.
	 * @see #getArraySourceVariable()
	 * @generated
	 */
	void setArraySourceVariable(ArrayTypedVariable value);

} // ExplodeArrayOfStructsRowFunction
