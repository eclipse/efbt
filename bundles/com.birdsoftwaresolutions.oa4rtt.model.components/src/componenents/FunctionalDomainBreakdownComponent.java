/**
 */
package componenents;

import functionality_module.FunctionalityModuleModule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Domain Breakdown Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componenents.FunctionalDomainBreakdownComponent#getFunctionalityModuleModules <em>Functionality Module Modules</em>}</li>
 *   <li>{@link componenents.FunctionalDomainBreakdownComponent#getComponent_calls <em>Component calls</em>}</li>
 * </ul>
 *
 * @see componenents.ComponenentsPackage#getFunctionalDomainBreakdownComponent()
 * @model
 * @generated
 */
public interface FunctionalDomainBreakdownComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Functionality Module Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality Module Modules</em>' reference.
	 * @see #setFunctionalityModuleModules(FunctionalityModuleModule)
	 * @see componenents.ComponenentsPackage#getFunctionalDomainBreakdownComponent_FunctionalityModuleModules()
	 * @model
	 * @generated
	 */
	FunctionalityModuleModule getFunctionalityModuleModules();

	/**
	 * Sets the value of the '{@link componenents.FunctionalDomainBreakdownComponent#getFunctionalityModuleModules <em>Functionality Module Modules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionality Module Modules</em>' reference.
	 * @see #getFunctionalityModuleModules()
	 * @generated
	 */
	void setFunctionalityModuleModules(FunctionalityModuleModule value);

	/**
	 * Returns the value of the '<em><b>Component calls</b></em>' containment reference list.
	 * The list contents are of type {@link componenents.FunctionalDomainBreakdownComponentCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component calls</em>' containment reference list.
	 * @see componenents.ComponenentsPackage#getFunctionalDomainBreakdownComponent_Component_calls()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalDomainBreakdownComponentCall> getComponent_calls();

} // FunctionalDomainBreakdownComponent
