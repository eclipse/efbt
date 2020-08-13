/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic;

import org.eclipse.efbt.input_data.smcubes.model.column_structured_data.ColumnStructuredData;

import org.eclipse.efbt.lineage.common.model.cubes.FreeBirdToolsCube;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Column Structured Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  data for derived cubes 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedColumnStructuredData#getRows <em>Rows</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedColumnStructuredData#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedColumnStructuredData#getSourceColumnStructuredData <em>Source Column Structured Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage#getDerivedColumnStructuredData()
 * @model extendedMetaData="name='DerivedColumnStructuredData' kind='elementOnly'"
 * @generated
 */
public interface DerivedColumnStructuredData extends ColumnStructuredData
{
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedRowData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The  Rows of data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage#getDerivedColumnStructuredData_Rows()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rows'"
	 * @generated
	 */
	EList<DerivedRowData> getRows();

	/**
	 * Returns the value of the '<em><b>Cube</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associated cube
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cube</em>' reference.
	 * @see #setCube(FreeBirdToolsCube)
	 * @see org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage#getDerivedColumnStructuredData_Cube()
	 * @model extendedMetaData="kind='attribute' name='cube'"
	 * @generated
	 */
	FreeBirdToolsCube getCube();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedColumnStructuredData#getCube <em>Cube</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube</em>' reference.
	 * @see #getCube()
	 * @generated
	 */
	void setCube(FreeBirdToolsCube value);

	/**
	 * Returns the value of the '<em><b>Source Column Structured Data</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.input_data.smcubes.model.column_structured_data.ColumnStructuredData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cube data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Column Structured Data</em>' reference list.
	 * @see org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage#getDerivedColumnStructuredData_SourceColumnStructuredData()
	 * @model extendedMetaData="kind='attribute' name='sourceColumnStructuredData'"
	 * @generated
	 */
	EList<ColumnStructuredData> getSourceColumnStructuredData();

} // DerivedColumnStructuredData
