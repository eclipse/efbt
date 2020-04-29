/**
 */
package componenents.impl;

import componenents.ComponenentsFactory;
import componenents.ComponenentsPackage;
import componenents.Component;
import componenents.ComponentCall;
import componenents.FunctionalDomainBreakdownComponent;
import componenents.FunctionalDomainBreakdownComponentCall;
import componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion;
import componenents.FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule;
import componenents.FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal;
import componenents.RegulatoryTextComponent;

import functionality_module.functionality_modulePackage;

import module_management.Module_managementPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import output_data_structures.Output_data_structuresPackage;
import requirements_text.Requirements_textPackage;

import scenarios.ScenariosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponenentsPackageImpl extends EPackageImpl implements ComponenentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatoryTextComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDomainBreakdownComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDomainBreakdownComponentCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDomainBreakdownComponentCall_CreateTrialVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDomainBreakdownComponentCall_SetTrialModuleAsFinalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentCallEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see componenents.ComponenentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponenentsPackageImpl() {
		super(eNS_URI, ComponenentsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ComponenentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponenentsPackage init() {
		if (isInited) return (ComponenentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponenentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponenentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponenentsPackageImpl theComponenentsPackage = registeredComponenentsPackage instanceof ComponenentsPackageImpl ? (ComponenentsPackageImpl)registeredComponenentsPackage : new ComponenentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		functionality_modulePackage.eINSTANCE.eClass();
		ScenariosPackage.eINSTANCE.eClass();
		Module_managementPackage.eINSTANCE.eClass();
		Output_data_structuresPackage.eINSTANCE.eClass();
		Requirements_textPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponenentsPackage.createPackageContents();

		// Initialize created meta-data
		theComponenentsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponenentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponenentsPackage.eNS_URI, theComponenentsPackage);
		return theComponenentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegulatoryTextComponent() {
		return regulatoryTextComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegulatoryTextComponent_RegulatoryTextModules() {
		return (EReference)regulatoryTextComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalDomainBreakdownComponent() {
		return functionalDomainBreakdownComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalDomainBreakdownComponent_FunctionalityModuleModules() {
		return (EReference)functionalDomainBreakdownComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalDomainBreakdownComponent_Component_calls() {
		return (EReference)functionalDomainBreakdownComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalDomainBreakdownComponentCall() {
		return functionalDomainBreakdownComponentCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalDomainBreakdownComponentCall_CreateTrialVersion() {
		return functionalDomainBreakdownComponentCall_CreateTrialVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OldVersion() {
		return (EReference)functionalDomainBreakdownComponentCall_CreateTrialVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_DependantRequirementsVersion() {
		return (EReference)functionalDomainBreakdownComponentCall_CreateTrialVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OutputDataStructureModule() {
		return (EReference)functionalDomainBreakdownComponentCall_CreateTrialVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_Version() {
		return (EAttribute)functionalDomainBreakdownComponentCall_CreateTrialVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal() {
		return functionalDomainBreakdownComponentCall_SetTrialModuleAsFinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule() {
		return functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentCall() {
		return componentCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponenentsFactory getComponenentsFactory() {
		return (ComponenentsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);

		regulatoryTextComponentEClass = createEClass(REGULATORY_TEXT_COMPONENT);
		createEReference(regulatoryTextComponentEClass, REGULATORY_TEXT_COMPONENT__REGULATORY_TEXT_MODULES);

		functionalDomainBreakdownComponentEClass = createEClass(FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT);
		createEReference(functionalDomainBreakdownComponentEClass, FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__FUNCTIONALITY_MODULE_MODULES);
		createEReference(functionalDomainBreakdownComponentEClass, FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__COMPONENT_CALLS);

		functionalDomainBreakdownComponentCallEClass = createEClass(FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL);

		functionalDomainBreakdownComponentCall_CreateTrialVersionEClass = createEClass(FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION);
		createEReference(functionalDomainBreakdownComponentCall_CreateTrialVersionEClass, FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OLD_VERSION);
		createEReference(functionalDomainBreakdownComponentCall_CreateTrialVersionEClass, FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__DEPENDANT_REQUIREMENTS_VERSION);
		createEReference(functionalDomainBreakdownComponentCall_CreateTrialVersionEClass, FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OUTPUT_DATA_STRUCTURE_MODULE);
		createEAttribute(functionalDomainBreakdownComponentCall_CreateTrialVersionEClass, FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__VERSION);

		functionalDomainBreakdownComponentCall_SetTrialModuleAsFinalEClass = createEClass(FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_SET_TRIAL_MODULE_AS_FINAL);

		functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleEClass = createEClass(FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_REMOVE_INVALID_ITEMS_FROM_TRIAL_MODULE);

		componentCallEClass = createEClass(COMPONENT_CALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Requirements_textPackage theRequirements_textPackage = (Requirements_textPackage)EPackage.Registry.INSTANCE.getEPackage(Requirements_textPackage.eNS_URI);
		functionality_modulePackage thefunctionality_modulePackage = (functionality_modulePackage)EPackage.Registry.INSTANCE.getEPackage(functionality_modulePackage.eNS_URI);
		Output_data_structuresPackage theOutput_data_structuresPackage = (Output_data_structuresPackage)EPackage.Registry.INSTANCE.getEPackage(Output_data_structuresPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionalDomainBreakdownComponentCallEClass.getESuperTypes().add(this.getComponentCall());
		functionalDomainBreakdownComponentCall_CreateTrialVersionEClass.getESuperTypes().add(this.getFunctionalDomainBreakdownComponentCall());
		functionalDomainBreakdownComponentCall_SetTrialModuleAsFinalEClass.getESuperTypes().add(this.getFunctionalDomainBreakdownComponentCall());
		functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleEClass.getESuperTypes().add(this.getFunctionalDomainBreakdownComponentCall());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regulatoryTextComponentEClass, RegulatoryTextComponent.class, "RegulatoryTextComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegulatoryTextComponent_RegulatoryTextModules(), theRequirements_textPackage.getRequirementsModule(), null, "regulatoryTextModules", null, 0, 1, RegulatoryTextComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalDomainBreakdownComponentEClass, FunctionalDomainBreakdownComponent.class, "FunctionalDomainBreakdownComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalDomainBreakdownComponent_FunctionalityModuleModules(), thefunctionality_modulePackage.getFunctionalityModuleModule(), null, "functionalityModuleModules", null, 0, 1, FunctionalDomainBreakdownComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDomainBreakdownComponent_Component_calls(), this.getFunctionalDomainBreakdownComponentCall(), null, "component_calls", null, 0, -1, FunctionalDomainBreakdownComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalDomainBreakdownComponentCallEClass, FunctionalDomainBreakdownComponentCall.class, "FunctionalDomainBreakdownComponentCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalDomainBreakdownComponentCall_CreateTrialVersionEClass, FunctionalDomainBreakdownComponentCall_CreateTrialVersion.class, "FunctionalDomainBreakdownComponentCall_CreateTrialVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OldVersion(), thefunctionality_modulePackage.getFunctionalityModuleModule(), null, "oldVersion", null, 0, 1, FunctionalDomainBreakdownComponentCall_CreateTrialVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_DependantRequirementsVersion(), theRequirements_textPackage.getRequirementsModule(), null, "dependantRequirementsVersion", null, 0, 1, FunctionalDomainBreakdownComponentCall_CreateTrialVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OutputDataStructureModule(), theOutput_data_structuresPackage.getOutputDataStructureModule(), null, "outputDataStructureModule", null, 0, 1, FunctionalDomainBreakdownComponentCall_CreateTrialVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1, FunctionalDomainBreakdownComponentCall_CreateTrialVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalDomainBreakdownComponentCall_SetTrialModuleAsFinalEClass, FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal.class, "FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleEClass, FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule.class, "FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentCallEClass, ComponentCall.class, "ComponentCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponenentsPackageImpl
