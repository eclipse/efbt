/**
 */
package org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations;

import org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.Attribute;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Scenario
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Scenario#isInvisible <em>Invisible</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Scenario#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Scenario#getRequiredAttributes <em>Required Attributes</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Scenario#getData_constraints <em>Data constraints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Logical_transformationsPackage#getScenario()
 * @model extendedMetaData="name='Scenario' kind='empty'"
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the Scenario
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Logical_transformationsPackage#getScenario_Name()
	 * @model id="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invisible</em>' attribute.
	 * @see #setInvisible(boolean)
	 * @see org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Logical_transformationsPackage#getScenario_Invisible()
	 * @model
	 * @generated
	 */
	boolean isInvisible();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Scenario#isInvisible <em>Invisible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invisible</em>' attribute.
	 * @see #isInvisible()
	 * @generated
	 */
	void setInvisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the Scenario
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Logical_transformationsPackage#getScenario_Description()
	 * @model extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Scenario#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Required Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocalimo.smcubes.model.data_meta_model.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Attributes</em>' reference list.
	 * @see org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Logical_transformationsPackage#getScenario_RequiredAttributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getRequiredAttributes();

	/**
	 * Returns the value of the '<em><b>Data constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data constraints</em>' containment reference.
	 * @see #setData_constraints(DataConstraint)
	 * @see org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Logical_transformationsPackage#getScenario_Data_constraints()
	 * @model containment="true"
	 * @generated
	 */
	DataConstraint getData_constraints();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.cocalimo.logical_transformations.model.logical_transformations.Scenario#getData_constraints <em>Data constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data constraints</em>' containment reference.
	 * @see #getData_constraints()
	 * @generated
	 */
	void setData_constraints(DataConstraint value);

} // Scenario