/**
 */
package org.eclipse.efbt.chirp.chirp_program;

import org.eclipse.efbt.data_structures.smcubes.model.smcubes_model.SmcubesModel;

import org.eclipse.efbt.functional_design.core.model.functionality_module.FunctionalityModuleModule;

import org.eclipse.efbt.requirements.core.model.requirements_text.RequirementsModule;

import org.eclipse.efbt.testing.common.model.test.TestModule;

import org.eclipse.efbt.testing.common.model.test_definition.TestContraints;
import org.eclipse.efbt.testing.common.model.test_definition.TestDefinitionModule;
import org.eclipse.efbt.testing.common.model.test_definition.TestTemplateModule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.Program#getSmCubesModel <em>Sm Cubes Model</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.Program#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.Program#getTestDefinitions <em>Test Definitions</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.Program#getTests <em>Tests</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.Program#getTestTemplates <em>Test Templates</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.Program#getTestConstriants <em>Test Constriants</em>}</li>
 *   <li>{@link org.eclipse.efbt.chirp.chirp_program.Program#getFunctionalityModules <em>Functionality Modules</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
	/**
	 * Returns the value of the '<em><b>Sm Cubes Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sm Cubes Model</em>' containment reference.
	 * @see #setSmCubesModel(SmcubesModel)
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getProgram_SmCubesModel()
	 * @model containment="true"
	 * @generated
	 */
	SmcubesModel getSmCubesModel();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.chirp.chirp_program.Program#getSmCubesModel <em>Sm Cubes Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sm Cubes Model</em>' containment reference.
	 * @see #getSmCubesModel()
	 * @generated
	 */
	void setSmCubesModel(SmcubesModel value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(RequirementsModule)
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getProgram_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	RequirementsModule getRequirements();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.chirp.chirp_program.Program#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(RequirementsModule value);

	/**
	 * Returns the value of the '<em><b>Test Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Definitions</em>' containment reference.
	 * @see #setTestDefinitions(TestDefinitionModule)
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getProgram_TestDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	TestDefinitionModule getTestDefinitions();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.chirp.chirp_program.Program#getTestDefinitions <em>Test Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Definitions</em>' containment reference.
	 * @see #getTestDefinitions()
	 * @generated
	 */
	void setTestDefinitions(TestDefinitionModule value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference.
	 * @see #setTests(TestModule)
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getProgram_Tests()
	 * @model containment="true"
	 * @generated
	 */
	TestModule getTests();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.chirp.chirp_program.Program#getTests <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests</em>' containment reference.
	 * @see #getTests()
	 * @generated
	 */
	void setTests(TestModule value);

	/**
	 * Returns the value of the '<em><b>Test Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Templates</em>' containment reference.
	 * @see #setTestTemplates(TestTemplateModule)
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getProgram_TestTemplates()
	 * @model containment="true"
	 * @generated
	 */
	TestTemplateModule getTestTemplates();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.chirp.chirp_program.Program#getTestTemplates <em>Test Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Templates</em>' containment reference.
	 * @see #getTestTemplates()
	 * @generated
	 */
	void setTestTemplates(TestTemplateModule value);

	/**
	 * Returns the value of the '<em><b>Test Constriants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Constriants</em>' containment reference.
	 * @see #setTestConstriants(TestContraints)
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getProgram_TestConstriants()
	 * @model containment="true"
	 * @generated
	 */
	TestContraints getTestConstriants();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.chirp.chirp_program.Program#getTestConstriants <em>Test Constriants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Constriants</em>' containment reference.
	 * @see #getTestConstriants()
	 * @generated
	 */
	void setTestConstriants(TestContraints value);

	/**
	 * Returns the value of the '<em><b>Functionality Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality Modules</em>' containment reference.
	 * @see #setFunctionalityModules(FunctionalityModuleModule)
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#getProgram_FunctionalityModules()
	 * @model containment="true"
	 * @generated
	 */
	FunctionalityModuleModule getFunctionalityModules();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.chirp.chirp_program.Program#getFunctionalityModules <em>Functionality Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionality Modules</em>' containment reference.
	 * @see #getFunctionalityModules()
	 * @generated
	 */
	void setFunctionalityModules(FunctionalityModuleModule value);

} // Program
