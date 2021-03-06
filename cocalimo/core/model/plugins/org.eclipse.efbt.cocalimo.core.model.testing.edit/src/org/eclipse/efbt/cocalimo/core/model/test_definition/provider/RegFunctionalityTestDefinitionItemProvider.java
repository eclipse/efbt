/**
 */
package org.eclipse.efbt.cocalimo.core.model.test_definition.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.efbt.cocalimo.core.model.test_definition.RegFunctionalityTestDefinition;
import org.eclipse.efbt.cocalimo.core.model.test_definition.Test_definitionPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.efbt.cocalimo.core.model.test_definition.RegFunctionalityTestDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegFunctionalityTestDefinitionItemProvider extends TestDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegFunctionalityTestDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInputModulesPropertyDescriptor(object);
			addProcessingModulesPropertyDescriptor(object);
			addReportCellCreationModulesPropertyDescriptor(object);
			addScenariosPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input Modules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputModulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegFunctionalityTestDefinition_inputModules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegFunctionalityTestDefinition_inputModules_feature", "_UI_RegFunctionalityTestDefinition_type"),
				 Test_definitionPackage.Literals.REG_FUNCTIONALITY_TEST_DEFINITION__INPUT_MODULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processing Modules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingModulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegFunctionalityTestDefinition_processingModules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegFunctionalityTestDefinition_processingModules_feature", "_UI_RegFunctionalityTestDefinition_type"),
				 Test_definitionPackage.Literals.REG_FUNCTIONALITY_TEST_DEFINITION__PROCESSING_MODULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Report Cell Creation Modules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReportCellCreationModulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegFunctionalityTestDefinition_reportCellCreationModules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegFunctionalityTestDefinition_reportCellCreationModules_feature", "_UI_RegFunctionalityTestDefinition_type"),
				 Test_definitionPackage.Literals.REG_FUNCTIONALITY_TEST_DEFINITION__REPORT_CELL_CREATION_MODULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scenarios feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenariosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegFunctionalityTestDefinition_scenarios_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegFunctionalityTestDefinition_scenarios_feature", "_UI_RegFunctionalityTestDefinition_type"),
				 Test_definitionPackage.Literals.REG_FUNCTIONALITY_TEST_DEFINITION__SCENARIOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns RegFunctionalityTestDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RegFunctionalityTestDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RegFunctionalityTestDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RegFunctionalityTestDefinition_type") :
			getString("_UI_RegFunctionalityTestDefinition_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
