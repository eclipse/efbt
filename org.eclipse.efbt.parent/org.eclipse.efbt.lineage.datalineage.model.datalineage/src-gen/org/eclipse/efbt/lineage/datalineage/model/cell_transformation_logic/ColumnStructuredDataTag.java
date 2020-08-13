/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic;

import org.eclipse.efbt.input_data.smcubes.model.column_structured_data.ColumnStructuredData;

import org.eclipse.efbt.requirements.core.model.requirements_text.Tag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Structured Data Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.ColumnStructuredDataTag#getColumnStructuredData <em>Column Structured Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage#getColumnStructuredDataTag()
 * @model
 * @generated
 */
public interface ColumnStructuredDataTag extends Tag
{
	/**
	 * Returns the value of the '<em><b>Column Structured Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Structured Data</em>' reference.
	 * @see #setColumnStructuredData(ColumnStructuredData)
	 * @see org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage#getColumnStructuredDataTag_ColumnStructuredData()
	 * @model
	 * @generated
	 */
	ColumnStructuredData getColumnStructuredData();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.ColumnStructuredDataTag#getColumnStructuredData <em>Column Structured Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Structured Data</em>' reference.
	 * @see #getColumnStructuredData()
	 * @generated
	 */
	void setColumnStructuredData(ColumnStructuredData value);

} // ColumnStructuredDataTag
