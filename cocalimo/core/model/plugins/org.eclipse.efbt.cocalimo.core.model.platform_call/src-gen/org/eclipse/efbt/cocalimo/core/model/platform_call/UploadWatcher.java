/**
 */
package org.eclipse.efbt.cocalimo.core.model.platform_call;

import org.eclipse.efbt.cocalimo.core.model.logical_transformations.LogicalTransformationModule;
import org.eclipse.emf.ecore.EPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upload Watcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.UploadWatcher#getInputDirectory <em>Input Directory</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.UploadWatcher#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.UploadWatcher#getLogicalTransformationModule <em>Logical Transformation Module</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.UploadWatcher#getData_model <em>Data model</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocalimo.core.model.platform_call.Platform_callPackage#getUploadWatcher()
 * @model
 * @generated
 */
public interface UploadWatcher extends PlatformCall {
	/**
	 * Returns the value of the '<em><b>Input Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Directory</em>' attribute.
	 * @see #setInputDirectory(String)
	 * @see org.eclipse.efbt.cocalimo.core.model.platform_call.Platform_callPackage#getUploadWatcher_InputDirectory()
	 * @model
	 * @generated
	 */
	String getInputDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocalimo.core.model.platform_call.UploadWatcher#getInputDirectory <em>Input Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Directory</em>' attribute.
	 * @see #getInputDirectory()
	 * @generated
	 */
	void setInputDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Output Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Directory</em>' attribute.
	 * @see #setOutputDirectory(String)
	 * @see org.eclipse.efbt.cocalimo.core.model.platform_call.Platform_callPackage#getUploadWatcher_OutputDirectory()
	 * @model
	 * @generated
	 */
	String getOutputDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocalimo.core.model.platform_call.UploadWatcher#getOutputDirectory <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Directory</em>' attribute.
	 * @see #getOutputDirectory()
	 * @generated
	 */
	void setOutputDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Logical Transformation Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Transformation Module</em>' reference.
	 * @see #setLogicalTransformationModule(LogicalTransformationModule)
	 * @see org.eclipse.efbt.cocalimo.core.model.platform_call.Platform_callPackage#getUploadWatcher_LogicalTransformationModule()
	 * @model
	 * @generated
	 */
	LogicalTransformationModule getLogicalTransformationModule();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocalimo.core.model.platform_call.UploadWatcher#getLogicalTransformationModule <em>Logical Transformation Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Transformation Module</em>' reference.
	 * @see #getLogicalTransformationModule()
	 * @generated
	 */
	void setLogicalTransformationModule(LogicalTransformationModule value);

	/**
	 * Returns the value of the '<em><b>Data model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data model</em>' reference.
	 * @see #setData_model(EPackage)
	 * @see org.eclipse.efbt.cocalimo.core.model.platform_call.Platform_callPackage#getUploadWatcher_Data_model()
	 * @model
	 * @generated
	 */
	EPackage getData_model();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocalimo.core.model.platform_call.UploadWatcher#getData_model <em>Data model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data model</em>' reference.
	 * @see #getData_model()
	 * @generated
	 */
	void setData_model(EPackage value);

} // UploadWatcher
