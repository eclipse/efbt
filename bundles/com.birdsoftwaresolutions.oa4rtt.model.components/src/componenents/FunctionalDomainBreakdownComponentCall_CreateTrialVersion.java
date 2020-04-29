/**
 */
package componenents;

import functionality_module.FunctionalityModuleModule;

import output_data_structures.OutputDataStructureModule;
import requirements_text.RequirementsModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Domain Breakdown Component Call Create Trial Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getOldVersion <em>Old Version</em>}</li>
 *   <li>{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getDependantRequirementsVersion <em>Dependant Requirements Version</em>}</li>
 *   <li>{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getOutputDataStructureModule <em>Output Data Structure Module</em>}</li>
 *   <li>{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see componenents.ComponenentsPackage#getFunctionalDomainBreakdownComponentCall_CreateTrialVersion()
 * @model
 * @generated
 */
public interface FunctionalDomainBreakdownComponentCall_CreateTrialVersion extends FunctionalDomainBreakdownComponentCall {
	/**
	 * Returns the value of the '<em><b>Old Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Version</em>' reference.
	 * @see #setOldVersion(FunctionalityModuleModule)
	 * @see componenents.ComponenentsPackage#getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OldVersion()
	 * @model
	 * @generated
	 */
	FunctionalityModuleModule getOldVersion();

	/**
	 * Sets the value of the '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getOldVersion <em>Old Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Version</em>' reference.
	 * @see #getOldVersion()
	 * @generated
	 */
	void setOldVersion(FunctionalityModuleModule value);

	/**
	 * Returns the value of the '<em><b>Dependant Requirements Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependant Requirements Version</em>' reference.
	 * @see #setDependantRequirementsVersion(RequirementsModule)
	 * @see componenents.ComponenentsPackage#getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_DependantRequirementsVersion()
	 * @model
	 * @generated
	 */
	RequirementsModule getDependantRequirementsVersion();

	/**
	 * Sets the value of the '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getDependantRequirementsVersion <em>Dependant Requirements Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependant Requirements Version</em>' reference.
	 * @see #getDependantRequirementsVersion()
	 * @generated
	 */
	void setDependantRequirementsVersion(RequirementsModule value);

	/**
	 * Returns the value of the '<em><b>Output Data Structure Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data Structure Module</em>' reference.
	 * @see #setOutputDataStructureModule(OutputDataStructureModule)
	 * @see componenents.ComponenentsPackage#getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_OutputDataStructureModule()
	 * @model
	 * @generated
	 */
	OutputDataStructureModule getOutputDataStructureModule();

	/**
	 * Sets the value of the '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getOutputDataStructureModule <em>Output Data Structure Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Data Structure Module</em>' reference.
	 * @see #getOutputDataStructureModule()
	 * @generated
	 */
	void setOutputDataStructureModule(OutputDataStructureModule value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see componenents.ComponenentsPackage#getFunctionalDomainBreakdownComponentCall_CreateTrialVersion_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // FunctionalDomainBreakdownComponentCall_CreateTrialVersion
