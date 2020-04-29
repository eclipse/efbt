/**
 */
package componenents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see componenents.ComponenentsPackage
 * @generated
 */
public interface ComponenentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponenentsFactory eINSTANCE = componenents.impl.ComponenentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Regulatory Text Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulatory Text Component</em>'.
	 * @generated
	 */
	RegulatoryTextComponent createRegulatoryTextComponent();

	/**
	 * Returns a new object of class '<em>Functional Domain Breakdown Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Domain Breakdown Component</em>'.
	 * @generated
	 */
	FunctionalDomainBreakdownComponent createFunctionalDomainBreakdownComponent();

	/**
	 * Returns a new object of class '<em>Functional Domain Breakdown Component Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Domain Breakdown Component Call</em>'.
	 * @generated
	 */
	FunctionalDomainBreakdownComponentCall createFunctionalDomainBreakdownComponentCall();

	/**
	 * Returns a new object of class '<em>Functional Domain Breakdown Component Call Create Trial Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Domain Breakdown Component Call Create Trial Version</em>'.
	 * @generated
	 */
	FunctionalDomainBreakdownComponentCall_CreateTrialVersion createFunctionalDomainBreakdownComponentCall_CreateTrialVersion();

	/**
	 * Returns a new object of class '<em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>'.
	 * @generated
	 */
	FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal createFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal();

	/**
	 * Returns a new object of class '<em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>'.
	 * @generated
	 */
	FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule createFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule();

	/**
	 * Returns a new object of class '<em>Component Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Call</em>'.
	 * @generated
	 */
	ComponentCall createComponentCall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponenentsPackage getComponenentsPackage();

} //ComponenentsFactory
