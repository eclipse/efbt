/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations;

import org.eclipse.efbt.cocalimo.core.model.module_management.Module_managementPackage;

import org.eclipse.efbt.cocalimo.core.model.requirements_text.Requirements_textPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.Logical_transformationsFactory
 * @model kind="package"
 * @generated
 */
public interface Logical_transformationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logical_transformations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/efbt/logical_transformations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logical_transformations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Logical_transformationsPackage eINSTANCE = org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.Logical_transformationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.LogicalTransformationModuleImpl <em>Logical Transformation Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.LogicalTransformationModuleImpl
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.Logical_transformationsPackageImpl#getLogicalTransformationModule()
	 * @generated
	 */
	int LOGICAL_TRANSFORMATION_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__DEPENDENCIES = Module_managementPackage.MODULE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>The Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__THE_DESCRIPTION = Module_managementPackage.MODULE__THE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__LICENSE = Module_managementPackage.MODULE__LICENSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__NAME = Module_managementPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__VERSION = Module_managementPackage.MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__LONG_NAME = Module_managementPackage.MODULE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Task Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__TASK_TAGS = Module_managementPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenario Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__SCENARIO_TAGS = Module_managementPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scenario Set Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__SCENARIO_SET_TAGS = Module_managementPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE__SUB_PROCESSES = Module_managementPackage.MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Logical Transformation Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE_FEATURE_COUNT = Module_managementPackage.MODULE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Logical Transformation Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_MODULE_OPERATION_COUNT = Module_managementPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.TaskTagImpl <em>Task Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.TaskTagImpl
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.Logical_transformationsPackageImpl#getTaskTag()
	 * @generated
	 */
	int TASK_TAG = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TAG__DISPLAY_NAME = Requirements_textPackage.TAG__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TAG__NAME = Requirements_textPackage.TAG__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TAG__REQUIREMENTS = Requirements_textPackage.TAG__REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Task Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TAG_FEATURE_COUNT = Requirements_textPackage.TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TAG_OPERATION_COUNT = Requirements_textPackage.TAG_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule <em>Logical Transformation Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Transformation Module</em>'.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule
	 * @generated
	 */
	EClass getLogicalTransformationModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule#getTaskTags <em>Task Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Tags</em>'.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule#getTaskTags()
	 * @see #getLogicalTransformationModule()
	 * @generated
	 */
	EReference getLogicalTransformationModule_TaskTags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule#getScenarioTags <em>Scenario Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario Tags</em>'.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule#getScenarioTags()
	 * @see #getLogicalTransformationModule()
	 * @generated
	 */
	EReference getLogicalTransformationModule_ScenarioTags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule#getScenarioSetTags <em>Scenario Set Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario Set Tags</em>'.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule#getScenarioSetTags()
	 * @see #getLogicalTransformationModule()
	 * @generated
	 */
	EReference getLogicalTransformationModule_ScenarioSetTags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule#getSubProcesses <em>Sub Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Processes</em>'.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.LogicalTransformationModule#getSubProcesses()
	 * @see #getLogicalTransformationModule()
	 * @generated
	 */
	EReference getLogicalTransformationModule_SubProcesses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.TaskTag <em>Task Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Tag</em>'.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.TaskTag
	 * @generated
	 */
	EClass getTaskTag();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Logical_transformationsFactory getLogical_transformationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.LogicalTransformationModuleImpl <em>Logical Transformation Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.LogicalTransformationModuleImpl
		 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.Logical_transformationsPackageImpl#getLogicalTransformationModule()
		 * @generated
		 */
		EClass LOGICAL_TRANSFORMATION_MODULE = eINSTANCE.getLogicalTransformationModule();

		/**
		 * The meta object literal for the '<em><b>Task Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION_MODULE__TASK_TAGS = eINSTANCE.getLogicalTransformationModule_TaskTags();

		/**
		 * The meta object literal for the '<em><b>Scenario Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION_MODULE__SCENARIO_TAGS = eINSTANCE.getLogicalTransformationModule_ScenarioTags();

		/**
		 * The meta object literal for the '<em><b>Scenario Set Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION_MODULE__SCENARIO_SET_TAGS = eINSTANCE.getLogicalTransformationModule_ScenarioSetTags();

		/**
		 * The meta object literal for the '<em><b>Sub Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION_MODULE__SUB_PROCESSES = eINSTANCE.getLogicalTransformationModule_SubProcesses();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.TaskTagImpl <em>Task Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.TaskTagImpl
		 * @see org.eclipse.efbt.cocalimo.smcubes.model.logical_transformations.impl.Logical_transformationsPackageImpl#getTaskTag()
		 * @generated
		 */
		EClass TASK_TAG = eINSTANCE.getTaskTag();

	}

} //Logical_transformationsPackage