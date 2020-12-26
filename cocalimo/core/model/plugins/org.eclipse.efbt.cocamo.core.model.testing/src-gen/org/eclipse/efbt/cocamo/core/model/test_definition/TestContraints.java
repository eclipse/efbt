/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Contraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a set of  contraints upon the parameters described in an associated Test Template
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints#getGivenParams <em>Given Params</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints#getWhenParams <em>When Params</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints#getThenParams <em>Then Params</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestContraints()
 * @model
 * @generated
 */
public interface TestContraints extends EObject
{
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associated Test Template
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(TestTemplate)
	 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestContraints_Template()
	 * @model
	 * @generated
	 */
	TestTemplate getTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TestTemplate value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name, and unique ID, of the constraints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestContraints_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Given Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.core.model.test_definition.Param}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of constraints for the parameterization of the individual parameters of the given clause of a test template. 
	 * In a test definition which refers to this constraint, then for each parameter, only child elements of the objects chosen in this constraints information can be selected.
	 * This constrant is technically  enforce using scoping rules. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given Params</em>' containment reference list.
	 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestContraints_GivenParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getGivenParams();

	/**
	 * Returns the value of the '<em><b>When Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.core.model.test_definition.Param}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of constraints for the parameterization of the individual parameters of the when clause of a test template. 
	 * In a test definition which refers to this constraint, then for each parameter, only child elements of the objects chosen in this constraints information can be selected.
	 * This constrant is technically  enforce using scoping rules. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Params</em>' containment reference list.
	 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestContraints_WhenParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getWhenParams();

	/**
	 * Returns the value of the '<em><b>Then Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.core.model.test_definition.Param}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of constraints for the parameterization of the individual parameters of the then clause of a test template. 
	 * In a test definition which refers to this constraint, then for each parameter, only child elements of the objects chosen in this constraints information can be selected.
	 * This constrant is technically  enforce using scoping rules. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Then Params</em>' containment reference list.
	 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestContraints_ThenParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getThenParams();

} // TestContraints
