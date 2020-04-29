/**
 */
package componenents.impl;

import componenents.ComponenentsPackage;
import componenents.FunctionalDomainBreakdownComponent;
import componenents.FunctionalDomainBreakdownComponentCall;

import functionality_module.FunctionalityModuleModule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Domain Breakdown Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componenents.impl.FunctionalDomainBreakdownComponentImpl#getFunctionalityModuleModules <em>Functionality Module Modules</em>}</li>
 *   <li>{@link componenents.impl.FunctionalDomainBreakdownComponentImpl#getComponent_calls <em>Component calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalDomainBreakdownComponentImpl extends MinimalEObjectImpl.Container implements FunctionalDomainBreakdownComponent {
	/**
	 * The cached value of the '{@link #getFunctionalityModuleModules() <em>Functionality Module Modules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalityModuleModules()
	 * @generated
	 * @ordered
	 */
	protected FunctionalityModuleModule functionalityModuleModules;

	/**
	 * The cached value of the '{@link #getComponent_calls() <em>Component calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent_calls()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalDomainBreakdownComponentCall> component_calls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalDomainBreakdownComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponenentsPackage.Literals.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalityModuleModule getFunctionalityModuleModules() {
		if (functionalityModuleModules != null && functionalityModuleModules.eIsProxy()) {
			InternalEObject oldFunctionalityModuleModules = (InternalEObject)functionalityModuleModules;
			functionalityModuleModules = (FunctionalityModuleModule)eResolveProxy(oldFunctionalityModuleModules);
			if (functionalityModuleModules != oldFunctionalityModuleModules) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__FUNCTIONALITY_MODULE_MODULES, oldFunctionalityModuleModules, functionalityModuleModules));
			}
		}
		return functionalityModuleModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalityModuleModule basicGetFunctionalityModuleModules() {
		return functionalityModuleModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionalityModuleModules(FunctionalityModuleModule newFunctionalityModuleModules) {
		FunctionalityModuleModule oldFunctionalityModuleModules = functionalityModuleModules;
		functionalityModuleModules = newFunctionalityModuleModules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__FUNCTIONALITY_MODULE_MODULES, oldFunctionalityModuleModules, functionalityModuleModules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalDomainBreakdownComponentCall> getComponent_calls() {
		if (component_calls == null) {
			component_calls = new EObjectContainmentEList<FunctionalDomainBreakdownComponentCall>(FunctionalDomainBreakdownComponentCall.class, this, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__COMPONENT_CALLS);
		}
		return component_calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__COMPONENT_CALLS:
				return ((InternalEList<?>)getComponent_calls()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__FUNCTIONALITY_MODULE_MODULES:
				if (resolve) return getFunctionalityModuleModules();
				return basicGetFunctionalityModuleModules();
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__COMPONENT_CALLS:
				return getComponent_calls();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__FUNCTIONALITY_MODULE_MODULES:
				setFunctionalityModuleModules((FunctionalityModuleModule)newValue);
				return;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__COMPONENT_CALLS:
				getComponent_calls().clear();
				getComponent_calls().addAll((Collection<? extends FunctionalDomainBreakdownComponentCall>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__FUNCTIONALITY_MODULE_MODULES:
				setFunctionalityModuleModules((FunctionalityModuleModule)null);
				return;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__COMPONENT_CALLS:
				getComponent_calls().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__FUNCTIONALITY_MODULE_MODULES:
				return functionalityModuleModules != null;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT__COMPONENT_CALLS:
				return component_calls != null && !component_calls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalDomainBreakdownComponentImpl
