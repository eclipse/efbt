/**
 */
package componenents.util;

import componenents.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see componenents.ComponenentsPackage
 * @generated
 */
public class ComponenentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponenentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponenentsSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponenentsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ComponenentsPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponenentsPackage.REGULATORY_TEXT_COMPONENT: {
				RegulatoryTextComponent regulatoryTextComponent = (RegulatoryTextComponent)theEObject;
				T result = caseRegulatoryTextComponent(regulatoryTextComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT: {
				FunctionalDomainBreakdownComponent functionalDomainBreakdownComponent = (FunctionalDomainBreakdownComponent)theEObject;
				T result = caseFunctionalDomainBreakdownComponent(functionalDomainBreakdownComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL: {
				FunctionalDomainBreakdownComponentCall functionalDomainBreakdownComponentCall = (FunctionalDomainBreakdownComponentCall)theEObject;
				T result = caseFunctionalDomainBreakdownComponentCall(functionalDomainBreakdownComponentCall);
				if (result == null) result = caseComponentCall(functionalDomainBreakdownComponentCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION: {
				FunctionalDomainBreakdownComponentCall_CreateTrialVersion functionalDomainBreakdownComponentCall_CreateTrialVersion = (FunctionalDomainBreakdownComponentCall_CreateTrialVersion)theEObject;
				T result = caseFunctionalDomainBreakdownComponentCall_CreateTrialVersion(functionalDomainBreakdownComponentCall_CreateTrialVersion);
				if (result == null) result = caseFunctionalDomainBreakdownComponentCall(functionalDomainBreakdownComponentCall_CreateTrialVersion);
				if (result == null) result = caseComponentCall(functionalDomainBreakdownComponentCall_CreateTrialVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_SET_TRIAL_MODULE_AS_FINAL: {
				FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal functionalDomainBreakdownComponentCall_SetTrialModuleAsFinal = (FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal)theEObject;
				T result = caseFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal(functionalDomainBreakdownComponentCall_SetTrialModuleAsFinal);
				if (result == null) result = caseFunctionalDomainBreakdownComponentCall(functionalDomainBreakdownComponentCall_SetTrialModuleAsFinal);
				if (result == null) result = caseComponentCall(functionalDomainBreakdownComponentCall_SetTrialModuleAsFinal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_REMOVE_INVALID_ITEMS_FROM_TRIAL_MODULE: {
				FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule = (FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule)theEObject;
				T result = caseFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule(functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule);
				if (result == null) result = caseFunctionalDomainBreakdownComponentCall(functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule);
				if (result == null) result = caseComponentCall(functionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponenentsPackage.COMPONENT_CALL: {
				ComponentCall componentCall = (ComponentCall)theEObject;
				T result = caseComponentCall(componentCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulatory Text Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulatory Text Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulatoryTextComponent(RegulatoryTextComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDomainBreakdownComponent(FunctionalDomainBreakdownComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDomainBreakdownComponentCall(FunctionalDomainBreakdownComponentCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component Call Create Trial Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component Call Create Trial Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDomainBreakdownComponentCall_CreateTrialVersion(FunctionalDomainBreakdownComponentCall_CreateTrialVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal(FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule(FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentCall(ComponentCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ComponenentsSwitch
