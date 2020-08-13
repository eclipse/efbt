/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic;

import org.eclipse.efbt.requirements.core.model.requirements_text.Tag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Cell Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.FormulaCellTag#getFormulaCell <em>Formula Cell</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage#getFormulaCellTag()
 * @model
 * @generated
 */
public interface FormulaCellTag extends Tag
{
	/**
	 * Returns the value of the '<em><b>Formula Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula Cell</em>' reference.
	 * @see #setFormulaCell(FormulaCell)
	 * @see org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage#getFormulaCellTag_FormulaCell()
	 * @model
	 * @generated
	 */
	FormulaCell getFormulaCell();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.FormulaCellTag#getFormulaCell <em>Formula Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula Cell</em>' reference.
	 * @see #getFormulaCell()
	 * @generated
	 */
	void setFormulaCell(FormulaCell value);

} // FormulaCellTag
