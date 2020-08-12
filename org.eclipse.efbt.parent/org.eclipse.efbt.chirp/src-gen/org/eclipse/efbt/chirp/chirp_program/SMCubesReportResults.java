/**
 */
package org.eclipse.efbt.chirp.chirp_program;

import org.eclipse.efbt.data_structures.smcubes.model.reports.ReportCellValue;

import org.eclipse.efbt.testing.common.model.test.Result;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Cubes Report Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.SMCubesReportResults#getReportCells <em>Report Cells</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getSMCubesReportResults()
 * @model
 * @generated
 */
public interface SMCubesReportResults extends Result
{
	/**
	 * Returns the value of the '<em><b>Report Cells</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.data_structures.smcubes.model.reports.ReportCellValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Cells</em>' containment reference list.
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getSMCubesReportResults_ReportCells()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReportCellValue> getReportCells();

} // SMCubesReportResults
