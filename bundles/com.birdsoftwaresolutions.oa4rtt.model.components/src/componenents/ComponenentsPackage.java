/**
 */
package componenents;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see componenents.ComponenentsFactory
 * @model kind="package"
 * @generated
 */
public interface ComponenentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componenents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/componenents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componenents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponenentsPackage eINSTANCE = componenents.impl.ComponenentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link componenents.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componenents.impl.ComponentImpl
	 * @see componenents.impl.ComponenentsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componenents.impl.RegulatoryTextComponentImpl <em>Regulatory Text Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componenents.impl.RegulatoryTextComponentImpl
	 * @see componenents.impl.ComponenentsPackageImpl#getRegulatoryTextComponent()
	 * @generated
	 */
	int REGULATORY_TEXT_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Regulatory Text Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_TEXT_COMPONENT__REGULATORY_TEXT_MODULES = 0;

	/**
	 * The number of structural features of the '<em>Regulatory Text Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_TEXT_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Regulatory Text Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_TEXT_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componenents.impl.FunctionalDomainBreakdownComponentImpl <em>Functional Domain Breakdown Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componenents.impl.FunctionalDomainBreakdownComponentImpl
	 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponent()
	 * @generated
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Functionality Module Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__FUNCTIONALITY_MODULE_MODULES = 0;

	/**
	 * The feature id for the '<em><b>Component calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__COMPONENT_CALLS = 1;

	/**
	 * The number of structural features of the '<em>Functional Domain Breakdown Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Functional Domain Breakdown Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componenents.impl.ComponentCallImpl <em>Component Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componenents.impl.ComponentCallImpl
	 * @see componenents.impl.ComponenentsPackageImpl#getComponentCall()
	 * @generated
	 */
	int COMPONENT_CALL = 7;

	/**
	 * The number of structural features of the '<em>Component Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CALL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componenents.impl.FunctionalDomainBreakdownComponentCallImpl <em>Functional Domain Breakdown Component Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componenents.impl.FunctionalDomainBreakdownComponentCallImpl
	 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponentCall()
	 * @generated
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL = 3;

	/**
	 * The number of structural features of the '<em>Functional Domain Breakdown Component Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_FEATURE_COUNT = COMPONENT_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional Domain Breakdown Component Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_OPERATION_COUNT = COMPONENT_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componenents.impl.FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl <em>Functional Domain Breakdown Component Call Create Trial Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componenents.impl.FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl
	 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponentCall_CreateTrialVersion()
	 * @generated
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Old Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OLD_VERSION = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependant Requirements Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__DEPENDANT_REQUIREMENTS_VERSION = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Data Structure Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OUTPUT_DATA_STRUCTURE_MODULE = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__VERSION = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Functional Domain Breakdown Component Call Create Trial Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION_FEATURE_COUNT = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Functional Domain Breakdown Component Call Create Trial Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION_OPERATION_COUNT = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componenents.impl.FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinalImpl <em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componenents.impl.FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinalImpl
	 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal()
	 * @generated
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_SET_TRIAL_MODULE_AS_FINAL = 5;

	/**
	 * The number of structural features of the '<em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_SET_TRIAL_MODULE_AS_FINAL_FEATURE_COUNT = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_SET_TRIAL_MODULE_AS_FINAL_OPERATION_COUNT = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componenents.impl.FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleImpl <em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componenents.impl.FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleImpl
	 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule()
	 * @generated
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_REMOVE_INVALID_ITEMS_FROM_TRIAL_MODULE = 6;

	/**
	 * The number of structural features of the '<em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_REMOVE_INVALID_ITEMS_FROM_TRIAL_MODULE_FEATURE_COUNT = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_REMOVE_INVALID_ITEMS_FROM_TRIAL_MODULE_OPERATION_COUNT = FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link componenents.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see componenents.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link componenents.RegulatoryTextComponent <em>Regulatory Text Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulatory Text Component</em>'.
	 * @see componenents.RegulatoryTextComponent
	 * @generated
	 */
	EClass getRegulatoryTextComponent();

	/**
	 * Returns the meta object for the reference '{@link componenents.RegulatoryTextComponent#getRegulatoryTextModules <em>Regulatory Text Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulatory Text Modules</em>'.
	 * @see componenents.RegulatoryTextComponent#getRegulatoryTextModules()
	 * @see #getRegulatoryTextComponent()
	 * @generated
	 */
	EReference getRegulatoryTextComponent_RegulatoryTextModules();

	/**
	 * Returns the meta object for class '{@link componenents.FunctionalDomainBreakdownComponent <em>Functional Domain Breakdown Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Domain Breakdown Component</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponent
	 * @generated
	 */
	EClass getFunctionalDomainBreakdownComponent();

	/**
	 * Returns the meta object for the reference '{@link componenents.FunctionalDomainBreakdownComponent#getFunctionalityModuleModules <em>Functionality Module Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Functionality Module Modules</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponent#getFunctionalityModuleModules()
	 * @see #getFunctionalDomainBreakdownComponent()
	 * @generated
	 */
	EReference getFunctionalDomainBreakdownComponent_FunctionalityModuleModules();

	/**
	 * Returns the meta object for the containment reference list '{@link componenents.FunctionalDomainBreakdownComponent#getComponent_calls <em>Component calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component calls</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponent#getComponent_calls()
	 * @see #getFunctionalDomainBreakdownComponent()
	 * @generated
	 */
	EReference getFunctionalDomainBreakdownComponent_Component_calls();

	/**
	 * Returns the meta object for class '{@link componenents.FunctionalDomainBreakdownComponentCall <em>Functional Domain Breakdown Component Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Domain Breakdown Component Call</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponentCall
	 * @generated
	 */
	EClass getFunctionalDomainBreakdownComponentCall();

	/**
	 * Returns the meta object for class '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion <em>Functional Domain Breakdown Component Call Create Trial Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Domain Breakdown Component Call Create Trial Version</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion
	 * @generated
	 */
	EClass getFunctionalDomainBreakdownComponentCall_CreateTrialVersion();

	/**
	 * Returns the meta object for the reference '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getOldVersion <em>Old Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Version</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getOldVersion()
	 * @see #getFunctionalDomainBreakdownComponentCall_CreateTrialVersion()
	 * @generated
	 */
	EReference getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OldVersion();

	/**
	 * Returns the meta object for the reference '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getDependantRequirementsVersion <em>Dependant Requirements Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependant Requirements Version</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getDependantRequirementsVersion()
	 * @see #getFunctionalDomainBreakdownComponentCall_CreateTrialVersion()
	 * @generated
	 */
	EReference getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_DependantRequirementsVersion();

	/**
	 * Returns the meta object for the reference '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getOutputDataStructureModule <em>Output Data Structure Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Data Structure Module</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getOutputDataStructureModule()
	 * @see #getFunctionalDomainBreakdownComponentCall_CreateTrialVersion()
	 * @generated
	 */
	EReference getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OutputDataStructureModule();

	/**
	 * Returns the meta object for the attribute '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getVersion()
	 * @see #getFunctionalDomainBreakdownComponentCall_CreateTrialVersion()
	 * @generated
	 */
	EAttribute getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_Version();

	/**
	 * Returns the meta object for class '{@link componenents.FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal <em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal
	 * @generated
	 */
	EClass getFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal();

	/**
	 * Returns the meta object for class '{@link componenents.FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule <em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>'.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule
	 * @generated
	 */
	EClass getFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule();

	/**
	 * Returns the meta object for class '{@link componenents.ComponentCall <em>Component Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Call</em>'.
	 * @see componenents.ComponentCall
	 * @generated
	 */
	EClass getComponentCall();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponenentsFactory getComponenentsFactory();

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
		 * The meta object literal for the '{@link componenents.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componenents.impl.ComponentImpl
		 * @see componenents.impl.ComponenentsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link componenents.impl.RegulatoryTextComponentImpl <em>Regulatory Text Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componenents.impl.RegulatoryTextComponentImpl
		 * @see componenents.impl.ComponenentsPackageImpl#getRegulatoryTextComponent()
		 * @generated
		 */
		EClass REGULATORY_TEXT_COMPONENT = eINSTANCE.getRegulatoryTextComponent();

		/**
		 * The meta object literal for the '<em><b>Regulatory Text Modules</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATORY_TEXT_COMPONENT__REGULATORY_TEXT_MODULES = eINSTANCE.getRegulatoryTextComponent_RegulatoryTextModules();

		/**
		 * The meta object literal for the '{@link componenents.impl.FunctionalDomainBreakdownComponentImpl <em>Functional Domain Breakdown Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componenents.impl.FunctionalDomainBreakdownComponentImpl
		 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponent()
		 * @generated
		 */
		EClass FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT = eINSTANCE.getFunctionalDomainBreakdownComponent();

		/**
		 * The meta object literal for the '<em><b>Functionality Module Modules</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__FUNCTIONALITY_MODULE_MODULES = eINSTANCE.getFunctionalDomainBreakdownComponent_FunctionalityModuleModules();

		/**
		 * The meta object literal for the '<em><b>Component calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__COMPONENT_CALLS = eINSTANCE.getFunctionalDomainBreakdownComponent_Component_calls();

		/**
		 * The meta object literal for the '{@link componenents.impl.FunctionalDomainBreakdownComponentCallImpl <em>Functional Domain Breakdown Component Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componenents.impl.FunctionalDomainBreakdownComponentCallImpl
		 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponentCall()
		 * @generated
		 */
		EClass FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL = eINSTANCE.getFunctionalDomainBreakdownComponentCall();

		/**
		 * The meta object literal for the '{@link componenents.impl.FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl <em>Functional Domain Breakdown Component Call Create Trial Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componenents.impl.FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl
		 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponentCall_CreateTrialVersion()
		 * @generated
		 */
		EClass FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION = eINSTANCE.getFunctionalDomainBreakdownComponentCall_CreateTrialVersion();

		/**
		 * The meta object literal for the '<em><b>Old Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OLD_VERSION = eINSTANCE.getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OldVersion();

		/**
		 * The meta object literal for the '<em><b>Dependant Requirements Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__DEPENDANT_REQUIREMENTS_VERSION = eINSTANCE.getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_DependantRequirementsVersion();

		/**
		 * The meta object literal for the '<em><b>Output Data Structure Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OUTPUT_DATA_STRUCTURE_MODULE = eINSTANCE.getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OutputDataStructureModule();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__VERSION = eINSTANCE.getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_Version();

		/**
		 * The meta object literal for the '{@link componenents.impl.FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinalImpl <em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componenents.impl.FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinalImpl
		 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal()
		 * @generated
		 */
		EClass FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_SET_TRIAL_MODULE_AS_FINAL = eINSTANCE.getFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal();

		/**
		 * The meta object literal for the '{@link componenents.impl.FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleImpl <em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componenents.impl.FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleImpl
		 * @see componenents.impl.ComponenentsPackageImpl#getFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule()
		 * @generated
		 */
		EClass FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_REMOVE_INVALID_ITEMS_FROM_TRIAL_MODULE = eINSTANCE.getFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule();

		/**
		 * The meta object literal for the '{@link componenents.impl.ComponentCallImpl <em>Component Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componenents.impl.ComponentCallImpl
		 * @see componenents.impl.ComponenentsPackageImpl#getComponentCall()
		 * @generated
		 */
		EClass COMPONENT_CALL = eINSTANCE.getComponentCall();

	}

} //ComponenentsPackage
