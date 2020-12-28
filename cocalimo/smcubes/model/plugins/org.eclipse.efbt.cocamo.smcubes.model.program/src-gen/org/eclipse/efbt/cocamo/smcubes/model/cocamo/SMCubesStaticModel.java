/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.cocamo;

import org.eclipse.efbt.cocalimo.core.model.functionality_module.FunctionalityModuleModule;

import org.eclipse.efbt.cocalimo.core.model.requirements_text.RequirementsModule;

import org.eclipse.efbt.cocalimo.core.model.test_definition.TestContraints;
import org.eclipse.efbt.cocalimo.core.model.test_definition.TestDefinitionModule;
import org.eclipse.efbt.cocalimo.core.model.test_definition.TestTemplateModule;

import org.eclipse.efbt.cocamo.smcubes.model.smcubes_model.SmcubesModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Cubes Static Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An SMCubesStaticModel  relates to the group of artifacts, and we allow the contents of  a SMCubesStaticModel  to reference other SMCubesStaticModels.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getSmCubesModel <em>Sm Cubes Model</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getTestDefinitions <em>Test Definitions</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getTests <em>Tests</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getTestTemplates <em>Test Templates</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getTestConstriants <em>Test Constriants</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getFunctionalityModules <em>Functionality Modules</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesStaticModel()
 * @model
 * @generated
 */
public interface SMCubesStaticModel extends StaticModel
{
	/**
	 * Returns the value of the '<em><b>Sm Cubes Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SMCubes Model associated with the Program
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sm Cubes Model</em>' containment reference.
	 * @see #setSmCubesModel(SmcubesModel)
	 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesStaticModel_SmCubesModel()
	 * @model containment="true"
	 * @generated
	 */
	SmcubesModel getSmCubesModel();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getSmCubesModel <em>Sm Cubes Model</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * The requirements associated with the program, these will be refrence by FunctionalityModules
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(RequirementsModule)
	 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesStaticModel_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	RequirementsModule getRequirements();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getRequirements <em>Requirements</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * The TestDefinitions associated with the program, these will be refrence by FunctionalityModules
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Definitions</em>' containment reference.
	 * @see #setTestDefinitions(TestDefinitionModule)
	 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesStaticModel_TestDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	TestDefinitionModule getTestDefinitions();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getTestDefinitions <em>Test Definitions</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * The Tests associated with the program, these will be refrence by FunctionalityModules
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference.
	 * @see #setTests(SMCubesTestModule)
	 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesStaticModel_Tests()
	 * @model containment="true"
	 * @generated
	 */
	SMCubesTestModule getTests();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getTests <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests</em>' containment reference.
	 * @see #getTests()
	 * @generated
	 */
	void setTests(SMCubesTestModule value);

	/**
	 * Returns the value of the '<em><b>Test Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TestTemplates associated with the program, these will be refrence by FunctionalityModules
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Templates</em>' containment reference.
	 * @see #setTestTemplates(TestTemplateModule)
	 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesStaticModel_TestTemplates()
	 * @model containment="true"
	 * @generated
	 */
	TestTemplateModule getTestTemplates();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getTestTemplates <em>Test Templates</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * The TestConstraints associated with the program, these will be refrence by FunctionalityModules
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Constriants</em>' containment reference.
	 * @see #setTestConstriants(TestContraints)
	 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesStaticModel_TestConstriants()
	 * @model containment="true"
	 * @generated
	 */
	TestContraints getTestConstriants();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getTestConstriants <em>Test Constriants</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * The FunctionaltyModules associated with the program, these will be refrence by FunctionalityModules
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functionality Modules</em>' containment reference.
	 * @see #setFunctionalityModules(FunctionalityModuleModule)
	 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#getSMCubesStaticModel_FunctionalityModules()
	 * @model containment="true"
	 * @generated
	 */
	FunctionalityModuleModule getFunctionalityModules();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel#getFunctionalityModules <em>Functionality Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionality Modules</em>' containment reference.
	 * @see #getFunctionalityModules()
	 * @generated
	 */
	void setFunctionalityModules(FunctionalityModuleModule value);

} // SMCubesStaticModel
