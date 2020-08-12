/**
 */
package org.eclipse.efbt.chirp.chirp_program;

import org.eclipse.efbt.input_data.smcubes.model.base_column_structured_data.BaseColumnStructuredData;

import org.eclipse.efbt.testing.common.model.test_input_data.TestInputData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Cubes Test Input Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.SMCubesTestInputData#getSmcubes_inputdata <em>Smcubes inputdata</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getSMCubesTestInputData()
 * @model
 * @generated
 */
public interface SMCubesTestInputData extends TestInputData
{
	/**
	 * Returns the value of the '<em><b>Smcubes inputdata</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.input_data.smcubes.model.base_column_structured_data.BaseColumnStructuredData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smcubes inputdata</em>' containment reference list.
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getSMCubesTestInputData_Smcubes_inputdata()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseColumnStructuredData> getSmcubes_inputdata();

} // SMCubesTestInputData
