/**
 */
package org.eclipse.efbt.chirp.chirp_program;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage
 * @generated
 */
public interface Chirp_programFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Chirp_programFactory eINSTANCE = org.eclipse.efbt.chirp.chirp_program.impl.Chirp_programFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>SM Cubes Test Input Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Cubes Test Input Data</em>'.
	 * @generated
	 */
	SMCubesTestInputData createSMCubesTestInputData();

	/**
	 * Returns a new object of class '<em>SM Cubes Report Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Cubes Report Results</em>'.
	 * @generated
	 */
	SMCubesReportResults createSMCubesReportResults();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Chirp_programPackage getChirp_programPackage();

} //Chirp_programFactory
