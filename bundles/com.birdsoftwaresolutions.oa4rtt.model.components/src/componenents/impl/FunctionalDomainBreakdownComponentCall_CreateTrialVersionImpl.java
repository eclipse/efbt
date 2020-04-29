/**
 */
package componenents.impl;

import componenents.ComponenentsPackage;
import componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion;

import functionality_module.FunctionalityModuleModule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import output_data_structures.OutputDataStructureModule;
import requirements_text.RequirementsModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Domain Breakdown Component Call Create Trial Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componenents.impl.FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl#getOldVersion <em>Old Version</em>}</li>
 *   <li>{@link componenents.impl.FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl#getDependantRequirementsVersion <em>Dependant Requirements Version</em>}</li>
 *   <li>{@link componenents.impl.FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl#getOutputDataStructureModule <em>Output Data Structure Module</em>}</li>
 *   <li>{@link componenents.impl.FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl extends FunctionalDomainBreakdownComponentCallImpl implements FunctionalDomainBreakdownComponentCall_CreateTrialVersion {
	/**
	 * The cached value of the '{@link #getOldVersion() <em>Old Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldVersion()
	 * @generated
	 * @ordered
	 */
	protected FunctionalityModuleModule oldVersion;

	/**
	 * The cached value of the '{@link #getDependantRequirementsVersion() <em>Dependant Requirements Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependantRequirementsVersion()
	 * @generated
	 * @ordered
	 */
	protected RequirementsModule dependantRequirementsVersion;

	/**
	 * The cached value of the '{@link #getOutputDataStructureModule() <em>Output Data Structure Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataStructureModule()
	 * @generated
	 * @ordered
	 */
	protected OutputDataStructureModule outputDataStructureModule;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponenentsPackage.Literals.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalityModuleModule getOldVersion() {
		if (oldVersion != null && oldVersion.eIsProxy()) {
			InternalEObject oldOldVersion = (InternalEObject)oldVersion;
			oldVersion = (FunctionalityModuleModule)eResolveProxy(oldOldVersion);
			if (oldVersion != oldOldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OLD_VERSION, oldOldVersion, oldVersion));
			}
		}
		return oldVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalityModuleModule basicGetOldVersion() {
		return oldVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldVersion(FunctionalityModuleModule newOldVersion) {
		FunctionalityModuleModule oldOldVersion = oldVersion;
		oldVersion = newOldVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OLD_VERSION, oldOldVersion, oldVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsModule getDependantRequirementsVersion() {
		if (dependantRequirementsVersion != null && dependantRequirementsVersion.eIsProxy()) {
			InternalEObject oldDependantRequirementsVersion = (InternalEObject)dependantRequirementsVersion;
			dependantRequirementsVersion = (RequirementsModule)eResolveProxy(oldDependantRequirementsVersion);
			if (dependantRequirementsVersion != oldDependantRequirementsVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__DEPENDANT_REQUIREMENTS_VERSION, oldDependantRequirementsVersion, dependantRequirementsVersion));
			}
		}
		return dependantRequirementsVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsModule basicGetDependantRequirementsVersion() {
		return dependantRequirementsVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependantRequirementsVersion(RequirementsModule newDependantRequirementsVersion) {
		RequirementsModule oldDependantRequirementsVersion = dependantRequirementsVersion;
		dependantRequirementsVersion = newDependantRequirementsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__DEPENDANT_REQUIREMENTS_VERSION, oldDependantRequirementsVersion, dependantRequirementsVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputDataStructureModule getOutputDataStructureModule() {
		if (outputDataStructureModule != null && outputDataStructureModule.eIsProxy()) {
			InternalEObject oldOutputDataStructureModule = (InternalEObject)outputDataStructureModule;
			outputDataStructureModule = (OutputDataStructureModule)eResolveProxy(oldOutputDataStructureModule);
			if (outputDataStructureModule != oldOutputDataStructureModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OUTPUT_DATA_STRUCTURE_MODULE, oldOutputDataStructureModule, outputDataStructureModule));
			}
		}
		return outputDataStructureModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataStructureModule basicGetOutputDataStructureModule() {
		return outputDataStructureModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputDataStructureModule(OutputDataStructureModule newOutputDataStructureModule) {
		OutputDataStructureModule oldOutputDataStructureModule = outputDataStructureModule;
		outputDataStructureModule = newOutputDataStructureModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OUTPUT_DATA_STRUCTURE_MODULE, oldOutputDataStructureModule, outputDataStructureModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OLD_VERSION:
				if (resolve) return getOldVersion();
				return basicGetOldVersion();
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__DEPENDANT_REQUIREMENTS_VERSION:
				if (resolve) return getDependantRequirementsVersion();
				return basicGetDependantRequirementsVersion();
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OUTPUT_DATA_STRUCTURE_MODULE:
				if (resolve) return getOutputDataStructureModule();
				return basicGetOutputDataStructureModule();
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__VERSION:
				return getVersion();
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
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OLD_VERSION:
				setOldVersion((FunctionalityModuleModule)newValue);
				return;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__DEPENDANT_REQUIREMENTS_VERSION:
				setDependantRequirementsVersion((RequirementsModule)newValue);
				return;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OUTPUT_DATA_STRUCTURE_MODULE:
				setOutputDataStructureModule((OutputDataStructureModule)newValue);
				return;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__VERSION:
				setVersion((String)newValue);
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
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OLD_VERSION:
				setOldVersion((FunctionalityModuleModule)null);
				return;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__DEPENDANT_REQUIREMENTS_VERSION:
				setDependantRequirementsVersion((RequirementsModule)null);
				return;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OUTPUT_DATA_STRUCTURE_MODULE:
				setOutputDataStructureModule((OutputDataStructureModule)null);
				return;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OLD_VERSION:
				return oldVersion != null;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__DEPENDANT_REQUIREMENTS_VERSION:
				return dependantRequirementsVersion != null;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__OUTPUT_DATA_STRUCTURE_MODULE:
				return outputDataStructureModule != null;
			case ComponenentsPackage.FUNCTIONAL_DOMAIN_BREAKDOWN_COMPONENT_CALL_CREATE_TRIAL_VERSION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //FunctionalDomainBreakdownComponentCall_CreateTrialVersionImpl
