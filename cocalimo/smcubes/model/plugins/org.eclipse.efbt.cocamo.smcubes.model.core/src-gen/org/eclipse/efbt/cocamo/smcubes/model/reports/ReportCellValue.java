/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.reports;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Cell Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReportCell Value, effectively a populate Report Cell 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.reports.ReportCellValue#getReportCell <em>Report Cell</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocamo.smcubes.model.reports.ReportsPackage#getReportCellValue()
 * @model extendedMetaData="name='ReportCellValue' kind='empty'"
 * @generated
 */
public interface ReportCellValue extends EObject
{
	/**
	 * Returns the value of the '<em><b>Report Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ReportCell
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Cell</em>' reference.
	 * @see #setReportCell(ReportCell)
	 * @see org.eclipse.efbt.cocamo.smcubes.model.reports.ReportsPackage#getReportCellValue_ReportCell()
	 * @model extendedMetaData="kind='attribute' name='reportCell'"
	 * @generated
	 */
	ReportCell getReportCell();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.smcubes.model.reports.ReportCellValue#getReportCell <em>Report Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Cell</em>' reference.
	 * @see #getReportCell()
	 * @generated
	 */
	void setReportCell(ReportCell value);

} // ReportCellValue
