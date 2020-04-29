/**
 */
package componenents.impl;

import componenents.ComponenentsPackage;
import componenents.RegulatoryTextComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import requirements_text.RequirementsModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulatory Text Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componenents.impl.RegulatoryTextComponentImpl#getRegulatoryTextModules <em>Regulatory Text Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatoryTextComponentImpl extends MinimalEObjectImpl.Container implements RegulatoryTextComponent {
	/**
	 * The cached value of the '{@link #getRegulatoryTextModules() <em>Regulatory Text Modules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryTextModules()
	 * @generated
	 * @ordered
	 */
	protected RequirementsModule regulatoryTextModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatoryTextComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponenentsPackage.Literals.REGULATORY_TEXT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsModule getRegulatoryTextModules() {
		if (regulatoryTextModules != null && regulatoryTextModules.eIsProxy()) {
			InternalEObject oldRegulatoryTextModules = (InternalEObject)regulatoryTextModules;
			regulatoryTextModules = (RequirementsModule)eResolveProxy(oldRegulatoryTextModules);
			if (regulatoryTextModules != oldRegulatoryTextModules) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponenentsPackage.REGULATORY_TEXT_COMPONENT__REGULATORY_TEXT_MODULES, oldRegulatoryTextModules, regulatoryTextModules));
			}
		}
		return regulatoryTextModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsModule basicGetRegulatoryTextModules() {
		return regulatoryTextModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulatoryTextModules(RequirementsModule newRegulatoryTextModules) {
		RequirementsModule oldRegulatoryTextModules = regulatoryTextModules;
		regulatoryTextModules = newRegulatoryTextModules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponenentsPackage.REGULATORY_TEXT_COMPONENT__REGULATORY_TEXT_MODULES, oldRegulatoryTextModules, regulatoryTextModules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponenentsPackage.REGULATORY_TEXT_COMPONENT__REGULATORY_TEXT_MODULES:
				if (resolve) return getRegulatoryTextModules();
				return basicGetRegulatoryTextModules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponenentsPackage.REGULATORY_TEXT_COMPONENT__REGULATORY_TEXT_MODULES:
				setRegulatoryTextModules((RequirementsModule)newValue);
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
			case ComponenentsPackage.REGULATORY_TEXT_COMPONENT__REGULATORY_TEXT_MODULES:
				setRegulatoryTextModules((RequirementsModule)null);
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
			case ComponenentsPackage.REGULATORY_TEXT_COMPONENT__REGULATORY_TEXT_MODULES:
				return regulatoryTextModules != null;
		}
		return super.eIsSet(featureID);
	}

} //RegulatoryTextComponentImpl
