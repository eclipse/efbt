/**
 */
package org.eclipse.efbt.cocalimo.core.model.platform_call.impl;

import org.eclipse.efbt.cocalimo.core.model.logical_transformations.LogicalTransformationModule;
import org.eclipse.efbt.cocalimo.core.model.platform_call.Platform_callPackage;
import org.eclipse.efbt.cocalimo.core.model.platform_call.UploadWatcher;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Upload Watcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.impl.UploadWatcherImpl#getInputDirectory <em>Input Directory</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.impl.UploadWatcherImpl#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.impl.UploadWatcherImpl#getLogicalTransformationModule <em>Logical Transformation Module</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.impl.UploadWatcherImpl#getData_model <em>Data model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UploadWatcherImpl extends PlatformCallImpl implements UploadWatcher {
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
	 * The default value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDirectory()
	 * @generated
	 * @ordered
	 */
	protected String outputDirectory = OUTPUT_DIRECTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalTransformationModule() <em>Logical Transformation Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalTransformationModule()
	 * @generated
	 * @ordered
	 */
	protected LogicalTransformationModule logicalTransformationModule;

	/**
	 * The cached value of the '{@link #getData_model() <em>Data model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_model()
	 * @generated
	 * @ordered
	 */
	protected EPackage data_model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UploadWatcherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_callPackage.Literals.UPLOAD_WATCHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_callPackage.UPLOAD_WATCHER__INPUT_DIRECTORY, oldInputDirectory, inputDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputDirectory() {
		return outputDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputDirectory(String newOutputDirectory) {
		String oldOutputDirectory = outputDirectory;
		outputDirectory = newOutputDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_callPackage.UPLOAD_WATCHER__OUTPUT_DIRECTORY, oldOutputDirectory, outputDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalTransformationModule getLogicalTransformationModule() {
		if (logicalTransformationModule != null && logicalTransformationModule.eIsProxy()) {
			InternalEObject oldLogicalTransformationModule = (InternalEObject)logicalTransformationModule;
			logicalTransformationModule = (LogicalTransformationModule)eResolveProxy(oldLogicalTransformationModule);
			if (logicalTransformationModule != oldLogicalTransformationModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_callPackage.UPLOAD_WATCHER__LOGICAL_TRANSFORMATION_MODULE, oldLogicalTransformationModule, logicalTransformationModule));
			}
		}
		return logicalTransformationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTransformationModule basicGetLogicalTransformationModule() {
		return logicalTransformationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalTransformationModule(LogicalTransformationModule newLogicalTransformationModule) {
		LogicalTransformationModule oldLogicalTransformationModule = logicalTransformationModule;
		logicalTransformationModule = newLogicalTransformationModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_callPackage.UPLOAD_WATCHER__LOGICAL_TRANSFORMATION_MODULE, oldLogicalTransformationModule, logicalTransformationModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getData_model() {
		if (data_model != null && data_model.eIsProxy()) {
			InternalEObject oldData_model = (InternalEObject)data_model;
			data_model = (EPackage)eResolveProxy(oldData_model);
			if (data_model != oldData_model) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_callPackage.UPLOAD_WATCHER__DATA_MODEL, oldData_model, data_model));
			}
		}
		return data_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetData_model() {
		return data_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData_model(EPackage newData_model) {
		EPackage oldData_model = data_model;
		data_model = newData_model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_callPackage.UPLOAD_WATCHER__DATA_MODEL, oldData_model, data_model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Platform_callPackage.UPLOAD_WATCHER__INPUT_DIRECTORY:
				return getInputDirectory();
			case Platform_callPackage.UPLOAD_WATCHER__OUTPUT_DIRECTORY:
				return getOutputDirectory();
			case Platform_callPackage.UPLOAD_WATCHER__LOGICAL_TRANSFORMATION_MODULE:
				if (resolve) return getLogicalTransformationModule();
				return basicGetLogicalTransformationModule();
			case Platform_callPackage.UPLOAD_WATCHER__DATA_MODEL:
				if (resolve) return getData_model();
				return basicGetData_model();
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
			case Platform_callPackage.UPLOAD_WATCHER__INPUT_DIRECTORY:
				setInputDirectory((String)newValue);
				return;
			case Platform_callPackage.UPLOAD_WATCHER__OUTPUT_DIRECTORY:
				setOutputDirectory((String)newValue);
				return;
			case Platform_callPackage.UPLOAD_WATCHER__LOGICAL_TRANSFORMATION_MODULE:
				setLogicalTransformationModule((LogicalTransformationModule)newValue);
				return;
			case Platform_callPackage.UPLOAD_WATCHER__DATA_MODEL:
				setData_model((EPackage)newValue);
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
			case Platform_callPackage.UPLOAD_WATCHER__INPUT_DIRECTORY:
				setInputDirectory(INPUT_DIRECTORY_EDEFAULT);
				return;
			case Platform_callPackage.UPLOAD_WATCHER__OUTPUT_DIRECTORY:
				setOutputDirectory(OUTPUT_DIRECTORY_EDEFAULT);
				return;
			case Platform_callPackage.UPLOAD_WATCHER__LOGICAL_TRANSFORMATION_MODULE:
				setLogicalTransformationModule((LogicalTransformationModule)null);
				return;
			case Platform_callPackage.UPLOAD_WATCHER__DATA_MODEL:
				setData_model((EPackage)null);
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
			case Platform_callPackage.UPLOAD_WATCHER__INPUT_DIRECTORY:
				return INPUT_DIRECTORY_EDEFAULT == null ? inputDirectory != null : !INPUT_DIRECTORY_EDEFAULT.equals(inputDirectory);
			case Platform_callPackage.UPLOAD_WATCHER__OUTPUT_DIRECTORY:
				return OUTPUT_DIRECTORY_EDEFAULT == null ? outputDirectory != null : !OUTPUT_DIRECTORY_EDEFAULT.equals(outputDirectory);
			case Platform_callPackage.UPLOAD_WATCHER__LOGICAL_TRANSFORMATION_MODULE:
				return logicalTransformationModule != null;
			case Platform_callPackage.UPLOAD_WATCHER__DATA_MODEL:
				return data_model != null;
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
		result.append(", outputDirectory: ");
		result.append(outputDirectory);
		result.append(')');
		return result.toString();
	}

} //UploadWatcherImpl
