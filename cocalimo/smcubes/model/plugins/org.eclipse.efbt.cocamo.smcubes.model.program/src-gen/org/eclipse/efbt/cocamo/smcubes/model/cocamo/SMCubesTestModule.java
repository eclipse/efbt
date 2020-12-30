/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.cocamo;

import org.eclipse.efbt.cocalimo.core.model.test.TestModule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Cubes Test Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A module containing a set of SMCubesTests
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesTestModule#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesTestModule()
 * @model
 * @generated
 */
public interface SMCubesTestModule extends TestModule
{
	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tests
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesTestModule_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<SMCubesTest> getTests();

} // SMCubesTestModule
