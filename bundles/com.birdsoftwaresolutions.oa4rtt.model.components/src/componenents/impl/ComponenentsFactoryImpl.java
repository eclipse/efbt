/**
 */
package componenents.impl;

import componenents.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponenentsFactoryImpl extends EFactoryImpl implements ComponenentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponenentsFactory init() {
		try {
			ComponenentsFactory theComponenentsFactory = (ComponenentsFactory)EPackage.Registry.INSTANCE.getEFactory(ComponenentsPackage.eNS_URI);
			if (theComponenentsFactory != null) {
				return theComponenentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponenentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponenentsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponenentsPackage.COMPONENT: return createComponent();
			case ComponenentsPackage.REGULATORY_TEXT_COMPONENT: return createRegulatoryTextComponent();
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT: return createFunctionalDomainBreakdownComponent();
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL: return createFunctionalDomainBreakdownComponentCall();
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION: return createFunctionalDomainBreakdownComponentCall_CreateTrialVersion();
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_SET_TRIAL_MODULE_AS_FINAL: return createFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal();
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_REMOVE_INVALID_ITEMS_FROM_TRIAL_MODULE: return createFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule();
			case ComponenentsPackage.COMPONENT_CALL: return createComponentCall();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegulatoryTextComponent createRegulatoryTextComponent() {
		RegulatoryTextComponentImpl regulatoryTextComponent = new RegulatoryTextComponentImpl();
		return regulatoryTextComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalDomainBreakdownComponent createFunctionalDomainBreakdownComponent() {
		FunctionalDomainBreakdownComponentImpl functionalDomainBreakdownComponent = new FunctionalDomainBreakdownComponentImpl();
		return functionalDomainBreakdownComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalDomainBreakdownComponentCall createFunctionalDomainBreakdownComponentCall() {
		FunctionalDomainBreakdownComponentCallImpl functionalDomainBreakdownComponentCall = new FunctionalDomainBreakdownComponentCallImpl();
		return functionalDomainBreakdownComponentCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalDomainBreakdownComponentCall_CreateTrialVersion createFunctionalDomainBreakdownComponentCall_CreateTrialVersion() {
		FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl functionalDomainBreakdownComponentCall_CreateTrialVersion = new FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl();
		return functionalDomainBreakdownComponentCall_CreateTrialVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal createFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal() {
		FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinalImpl functionalDomainBreakdownComponentCall_SetTrialModuleAsFinal = new FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinalImpl();
		return functionalDomainBreakdownComponentCall_SetTrialModuleAsFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule createFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule() {
		FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleImpl functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule = new FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleImpl();
		return functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCall createComponentCall() {
		ComponentCallImpl componentCall = new ComponentCallImpl();
		return componentCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponenentsPackage getComponenentsPackage() {
		return (ComponenentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponenentsPackage getPackage() {
		return ComponenentsPackage.eINSTANCE;
	}

} //ComponenentsFactoryImpl
