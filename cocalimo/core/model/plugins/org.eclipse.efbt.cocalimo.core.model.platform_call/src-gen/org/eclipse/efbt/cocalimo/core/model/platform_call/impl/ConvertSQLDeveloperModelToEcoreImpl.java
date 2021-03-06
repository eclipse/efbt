/**
 */
package org.eclipse.efbt.cocalimo.core.model.platform_call.impl;

import org.eclipse.efbt.cocalimo.core.model.platform_call.ConvertSQLDeveloperModelToEcore;
import org.eclipse.efbt.cocalimo.core.model.platform_call.Platform_callPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convert SQL Developer Model To Ecore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.impl.ConvertSQLDeveloperModelToEcoreImpl#getInputDirectory <em>Input Directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConvertSQLDeveloperModelToEcoreImpl extends PlatformCallImpl implements ConvertSQLDeveloperModelToEcore {
	/**
	 * The default value of the '{@link #getInputDirectory() <em>Input Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputDirectory() <em>Input Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDirectory()
	 * @generated
	 * @ordered
	 */
	protected String inputDirectory = INPUT_DIRECTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConvertSQLDeveloperModelToEcoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_callPackage.Literals.CONVERT_SQL_DEVELOPER_MODEL_TO_ECORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputDirectory() {
		return inputDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputDirectory(String newInputDirectory) {
		String oldInputDirectory = inputDirectory;
		inputDirectory = newInputDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_callPackage.CONVERT_SQL_DEVELOPER_MODEL_TO_ECORE__INPUT_DIRECTORY, oldInputDirectory, inputDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Platform_callPackage.CONVERT_SQL_DEVELOPER_MODEL_TO_ECORE__INPUT_DIRECTORY:
				return getInputDirectory();
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
			case Platform_callPackage.CONVERT_SQL_DEVELOPER_MODEL_TO_ECORE__INPUT_DIRECTORY:
				setInputDirectory((String)newValue);
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
			case Platform_callPackage.CONVERT_SQL_DEVELOPER_MODEL_TO_ECORE__INPUT_DIRECTORY:
				setInputDirectory(INPUT_DIRECTORY_EDEFAULT);
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
			case Platform_callPackage.CONVERT_SQL_DEVELOPER_MODEL_TO_ECORE__INPUT_DIRECTORY:
				return INPUT_DIRECTORY_EDEFAULT == null ? inputDirectory != null : !INPUT_DIRECTORY_EDEFAULT.equals(inputDirectory);
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
		result.append(" (inputDirectory: ");
		result.append(inputDirectory);
		result.append(')');
		return result.toString();
	}

} //ConvertSQLDeveloperModelToEcoreImpl
