/**
 */
package org.eclipse.efbt.lineage.datalineage.model.data_lineage;

import org.eclipse.efbt.input_data.smcubes.model.base_column_structured_data.BaseColumnStructuredData;

import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedColumnStructuredData;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet Lineage Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A mixture of Data for derived cubes (where each cell is a function of cells in source Cubes) 
 *     and sourceData (where each cell has a value). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getDataTraceableByCell <em>Data Traceable By Cell</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getSourceData <em>Source Data</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.Data_lineagePackage#getSpreadsheetLineageModel()
 * @model extendedMetaData="name='SpreadsheetLineageModel' kind='elementOnly'"
 * @generated
 */
public interface SpreadsheetLineageModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Data Traceable By Cell</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.DerivedColumnStructuredData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The  Data for derived cubes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Traceable By Cell</em>' containment reference list.
	 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.Data_lineagePackage#getSpreadsheetLineageModel_DataTraceableByCell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataTraceableByCell'"
	 * @generated
	 */
	EList<DerivedColumnStructuredData> getDataTraceableByCell();

	/**
	 * Returns the value of the '<em><b>Source Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.input_data.smcubes.model.base_column_structured_data.BaseColumnStructuredData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data from the base cubes/input layer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Data</em>' containment reference list.
	 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.Data_lineagePackage#getSpreadsheetLineageModel_SourceData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceData'"
	 * @generated
	 */
	EList<BaseColumnStructuredData> getSourceData();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the SpreadsheetLineageModel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.efbt.lineage.datalineage.model.data_lineage.Data_lineagePackage#getSpreadsheetLineageModel_Name()
	 * @model id="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.datalineage.model.data_lineage.SpreadsheetLineageModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SpreadsheetLineageModel
