/**
 */
package org.eclipse.efbt.regdna.model.regdna;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Column Member As</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.regdna.model.regdna.SelectColumnMemberAs#getMemberAsConstant <em>Member As Constant</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.regdna.model.regdna.regdnaPackage#getSelectColumnMemberAs()
 * @model
 * @generated
 */
public interface SelectColumnMemberAs extends SelectColumn {
	/**
	 * Returns the value of the '<em><b>Member As Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member As Constant</em>' reference.
	 * @see #setMemberAsConstant(ELEnumLiteral)
	 * @see org.eclipse.efbt.regdna.model.regdna.regdnaPackage#getSelectColumnMemberAs_MemberAsConstant()
	 * @model
	 * @generated
	 */
	ELEnumLiteral getMemberAsConstant();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.regdna.model.regdna.SelectColumnMemberAs#getMemberAsConstant <em>Member As Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member As Constant</em>' reference.
	 * @see #getMemberAsConstant()
	 * @generated
	 */
	void setMemberAsConstant(ELEnumLiteral value);

} // SelectColumnMemberAs
