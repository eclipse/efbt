/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage
 * @generated
 */
public interface Test_definitionFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Test_definitionFactory eINSTANCE = org.eclipse.efbt.cocamo.core.model.test_definition.impl.Test_definitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Contraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Contraints</em>'.
	 * @generated
	 */
	TestContraints createTestContraints();

	/**
	 * Returns a new object of class '<em>Test Template Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Template Module</em>'.
	 * @generated
	 */
	TestTemplateModule createTestTemplateModule();

	/**
	 * Returns a new object of class '<em>Test Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Template</em>'.
	 * @generated
	 */
	TestTemplate createTestTemplate();

	/**
	 * Returns a new object of class '<em>Test Constraints Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Constraints Module</em>'.
	 * @generated
	 */
	TestConstraintsModule createTestConstraintsModule();

	/**
	 * Returns a new object of class '<em>Test Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Definition</em>'.
	 * @generated
	 */
	TestDefinition createTestDefinition();

	/**
	 * Returns a new object of class '<em>E2E Test Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E2E Test Definition</em>'.
	 * @generated
	 */
	E2ETestDefinition createE2ETestDefinition();

	/**
	 * Returns a new object of class '<em>Unit Test Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Test Definition</em>'.
	 * @generated
	 */
	UnitTestDefinition createUnitTestDefinition();

	/**
	 * Returns a new object of class '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clause</em>'.
	 * @generated
	 */
	Clause createClause();

	/**
	 * Returns a new object of class '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param</em>'.
	 * @generated
	 */
	Param createParam();

	/**
	 * Returns a new object of class '<em>Given</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Given</em>'.
	 * @generated
	 */
	Given createGiven();

	/**
	 * Returns a new object of class '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When</em>'.
	 * @generated
	 */
	When createWhen();

	/**
	 * Returns a new object of class '<em>Then</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Then</em>'.
	 * @generated
	 */
	Then createThen();

	/**
	 * Returns a new object of class '<em>Clause Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clause Text</em>'.
	 * @generated
	 */
	ClauseText createClauseText();

	/**
	 * Returns a new object of class '<em>Coverage Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Grid</em>'.
	 * @generated
	 */
	CoverageGrid createCoverageGrid();

	/**
	 * Returns a new object of class '<em>Coverage Grid Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Grid Point</em>'.
	 * @generated
	 */
	CoverageGridPoint createCoverageGridPoint();

	/**
	 * Returns a new object of class '<em>Test Definition Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Definition Module</em>'.
	 * @generated
	 */
	TestDefinitionModule createTestDefinitionModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Test_definitionPackage getTest_definitionPackage();

} //Test_definitionFactory
