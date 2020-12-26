/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.cocamo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage
 * @generated
 */
public interface CocamoFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CocamoFactory eINSTANCE = org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl.CocamoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SM Cubes Static Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Cubes Static Model</em>'.
	 * @generated
	 */
	SMCubesStaticModel createSMCubesStaticModel();

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
	 * Returns a new object of class '<em>SM Cubes Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Cubes Test</em>'.
	 * @generated
	 */
	SMCubesTest createSMCubesTest();

	/**
	 * Returns a new object of class '<em>SM Cubes Test Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Cubes Test Module</em>'.
	 * @generated
	 */
	SMCubesTestModule createSMCubesTestModule();

	/**
	 * Returns a new object of class '<em>Static Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Model</em>'.
	 * @generated
	 */
	StaticModel createStaticModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CocamoPackage getCocamoPackage();

} //CocamoFactory
