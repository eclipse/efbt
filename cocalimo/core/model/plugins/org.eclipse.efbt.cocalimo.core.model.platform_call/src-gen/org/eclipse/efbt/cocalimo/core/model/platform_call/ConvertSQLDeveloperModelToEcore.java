/**
 */
package org.eclipse.efbt.cocalimo.core.model.platform_call;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Convert SQL Developer Model To Ecore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.platform_call.ConvertSQLDeveloperModelToEcore#getInputDirectory <em>Input Directory</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocalimo.core.model.platform_call.Platform_callPackage#getConvertSQLDeveloperModelToEcore()
 * @model
 * @generated
 */
public interface ConvertSQLDeveloperModelToEcore extends PlatformCall {
	/**
	 * Returns the value of the '<em><b>Input Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Directory</em>' attribute.
	 * @see #setInputDirectory(String)
	 * @see org.eclipse.efbt.cocalimo.core.model.platform_call.Platform_callPackage#getConvertSQLDeveloperModelToEcore_InputDirectory()
	 * @model
	 * @generated
	 */
	String getInputDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocalimo.core.model.platform_call.ConvertSQLDeveloperModelToEcore#getInputDirectory <em>Input Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Directory</em>' attribute.
	 * @see #getInputDirectory()
	 * @generated
	 */
	void setInputDirectory(String value);

} // ConvertSQLDeveloperModelToEcore
