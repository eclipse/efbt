/**
 */
package org.eclipse.efbt.cocamo.core.model.test;

import org.eclipse.efbt.cocamo.core.model.test_definition.E2ETestDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E2E Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An end to end test
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test.E2ETest#getTestDefinition <em>Test Definition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocamo.core.model.test.TestPackage#getE2ETest()
 * @model
 * @generated
 */
public interface E2ETest extends Test
{
	/**
	 * Returns the value of the '<em><b>Test Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TesDefinition associated with the test
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Definition</em>' reference.
	 * @see #setTestDefinition(E2ETestDefinition)
	 * @see org.eclipse.efbt.cocamo.core.model.test.TestPackage#getE2ETest_TestDefinition()
	 * @model
	 * @generated
	 */
	E2ETestDefinition getTestDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.core.model.test.E2ETest#getTestDefinition <em>Test Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Definition</em>' reference.
	 * @see #getTestDefinition()
	 * @generated
	 */
	void setTestDefinition(E2ETestDefinition value);

} // E2ETest
