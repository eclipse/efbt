/**
 */
package org.eclipse.efbt.cocalimo.core.model.test_definition.impl;

import java.util.Collection;

import org.eclipse.efbt.cocalimo.core.model.functionality_module.FunctionalityModule;
import org.eclipse.efbt.cocalimo.core.model.functionality_module.ReadDataSourceFunctionalityModule;
import org.eclipse.efbt.cocalimo.core.model.functionality_module.ReportCellCreationFunctionalityModule;

import org.eclipse.efbt.cocalimo.core.model.scenarios.Scenario;

import org.eclipse.efbt.cocalimo.core.model.test_definition.RegFunctionalityTestDefinition;
import org.eclipse.efbt.cocalimo.core.model.test_definition.Test_definitionPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reg Functionality Test Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.test_definition.impl.RegFunctionalityTestDefinitionImpl#getInputModules <em>Input Modules</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.test_definition.impl.RegFunctionalityTestDefinitionImpl#getProcessingModules <em>Processing Modules</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.test_definition.impl.RegFunctionalityTestDefinitionImpl#getReportCellCreationModules <em>Report Cell Creation Modules</em>}</li>
 *   <li>{@link org.eclipse.efbt.cocalimo.core.model.test_definition.impl.RegFunctionalityTestDefinitionImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegFunctionalityTestDefinitionImpl extends TestDefinitionImpl implements RegFunctionalityTestDefinition
{
	/**
	 * The cached value of the '{@link #getInputModules() <em>Input Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadDataSourceFunctionalityModule> inputModules;

	/**
	 * The cached value of the '{@link #getProcessingModules() <em>Processing Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingModules()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalityModule> processingModules;

	/**
	 * The cached value of the '{@link #getReportCellCreationModules() <em>Report Cell Creation Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportCellCreationModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportCellCreationFunctionalityModule> reportCellCreationModules;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegFunctionalityTestDefinitionImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Test_definitionPackage.Literals.REG_FUNCTIONALITY_TEST_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReadDataSourceFunctionalityModule> getInputModules()
	{
		if (inputModules == null) {
			inputModules = new EObjectResolvingEList<ReadDataSourceFunctionalityModule>(ReadDataSourceFunctionalityModule.class, this, Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__INPUT_MODULES);
		}
		return inputModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalityModule> getProcessingModules()
	{
		if (processingModules == null) {
			processingModules = new EObjectResolvingEList<FunctionalityModule>(FunctionalityModule.class, this, Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__PROCESSING_MODULES);
		}
		return processingModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReportCellCreationFunctionalityModule> getReportCellCreationModules()
	{
		if (reportCellCreationModules == null) {
			reportCellCreationModules = new EObjectResolvingEList<ReportCellCreationFunctionalityModule>(ReportCellCreationFunctionalityModule.class, this, Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__REPORT_CELL_CREATION_MODULES);
		}
		return reportCellCreationModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenarios()
	{
		if (scenarios == null) {
			scenarios = new EObjectResolvingEList<Scenario>(Scenario.class, this, Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__INPUT_MODULES:
				return getInputModules();
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__PROCESSING_MODULES:
				return getProcessingModules();
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__REPORT_CELL_CREATION_MODULES:
				return getReportCellCreationModules();
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__SCENARIOS:
				return getScenarios();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__INPUT_MODULES:
				getInputModules().clear();
				getInputModules().addAll((Collection<? extends ReadDataSourceFunctionalityModule>)newValue);
				return;
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__PROCESSING_MODULES:
				getProcessingModules().clear();
				getProcessingModules().addAll((Collection<? extends FunctionalityModule>)newValue);
				return;
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__REPORT_CELL_CREATION_MODULES:
				getReportCellCreationModules().clear();
				getReportCellCreationModules().addAll((Collection<? extends ReportCellCreationFunctionalityModule>)newValue);
				return;
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__INPUT_MODULES:
				getInputModules().clear();
				return;
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__PROCESSING_MODULES:
				getProcessingModules().clear();
				return;
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__REPORT_CELL_CREATION_MODULES:
				getReportCellCreationModules().clear();
				return;
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__SCENARIOS:
				getScenarios().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__INPUT_MODULES:
				return inputModules != null && !inputModules.isEmpty();
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__PROCESSING_MODULES:
				return processingModules != null && !processingModules.isEmpty();
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__REPORT_CELL_CREATION_MODULES:
				return reportCellCreationModules != null && !reportCellCreationModules.isEmpty();
			case Test_definitionPackage.REG_FUNCTIONALITY_TEST_DEFINITION__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegFunctionalityTestDefinitionImpl
