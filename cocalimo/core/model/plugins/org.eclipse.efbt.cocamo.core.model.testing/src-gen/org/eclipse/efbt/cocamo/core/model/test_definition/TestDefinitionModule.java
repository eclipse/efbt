/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Definition Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A module containing a set of TestDefinitions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestDefinitionModule#getTestDefinitions <em>Test Definitions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestDefinitionModule()
 * @model
 * @generated
 */
public interface TestDefinitionModule extends org.eclipse.efbt.cocamo.core.model.module_management.Module
{
	/**
	 * Returns the value of the '<em><b>Test Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.core.model.test_definition.TestDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TestDefinitions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Definitions</em>' containment reference list.
	 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestDefinitionModule_TestDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestDefinition> getTestDefinitions();

} // TestDefinitionModule
