/**
 */
package componenents;

import org.eclipse.emf.ecore.EObject;

import requirements_text.RequirementsModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulatory Text Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componenents.RegulatoryTextComponent#getRegulatoryTextModules <em>Regulatory Text Modules</em>}</li>
 * </ul>
 *
 * @see componenents.ComponenentsPackage#getRegulatoryTextComponent()
 * @model
 * @generated
 */
public interface RegulatoryTextComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Regulatory Text Modules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatory Text Modules</em>' reference.
	 * @see #setRegulatoryTextModules(RequirementsModule)
	 * @see componenents.ComponenentsPackage#getRegulatoryTextComponent_RegulatoryTextModules()
	 * @model
	 * @generated
	 */
	RequirementsModule getRegulatoryTextModules();

	/**
	 * Sets the value of the '{@link componenents.RegulatoryTextComponent#getRegulatoryTextModules <em>Regulatory Text Modules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulatory Text Modules</em>' reference.
	 * @see #getRegulatoryTextModules()
	 * @generated
	 */
	void setRegulatoryTextModules(RequirementsModule value);

} // RegulatoryTextComponent
