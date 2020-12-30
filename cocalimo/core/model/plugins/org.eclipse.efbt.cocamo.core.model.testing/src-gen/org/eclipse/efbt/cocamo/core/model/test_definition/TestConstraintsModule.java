/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Constraints Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A module containing a set of TestContraints
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestConstraintsModule#getCoverageTestSets <em>Coverage Test Sets</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestConstraintsModule()
 * @model
 * @generated
 */
public interface TestConstraintsModule extends org.eclipse.efbt.cocamo.core.model.module_management.Module
{
	/**
	 * Returns the value of the '<em><b>Coverage Test Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TestConstraints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Test Sets</em>' containment reference list.
	 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestConstraintsModule_CoverageTestSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestContraints> getCoverageTestSets();

} // TestConstraintsModule
