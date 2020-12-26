/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Template Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Module with a set of TestTemplates
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocamo.core.model.test_definition.TestTemplateModule#getTemplates <em>Templates</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestTemplateModule()
 * @model
 * @generated
 */
public interface TestTemplateModule extends org.eclipse.efbt.cocamo.core.model.module_management.Module
{
	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.cocamo.core.model.test_definition.TestTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The templates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#getTestTemplateModule_Templates()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestTemplate> getTemplates();

} // TestTemplateModule
