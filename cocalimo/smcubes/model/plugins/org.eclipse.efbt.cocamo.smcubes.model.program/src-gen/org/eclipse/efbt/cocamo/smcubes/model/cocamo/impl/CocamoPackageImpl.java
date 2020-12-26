/**
 */
package org.eclipse.efbt.cocamo.smcubes.model.cocamo.impl;

import org.eclipse.efbt.cocamo.core.model.functionality_module.Functionality_modulePackage;

import org.eclipse.efbt.cocamo.core.model.module_management.Module_managementPackage;

import org.eclipse.efbt.cocamo.core.model.requirements_text.Requirements_textPackage;

import org.eclipse.efbt.cocamo.core.model.scenarios.ScenariosPackage;

import org.eclipse.efbt.cocamo.core.model.test.TestPackage;

import org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage;

import org.eclipse.efbt.cocamo.core.model.test_input_data.Test_input_dataPackage;

import org.eclipse.efbt.cocamo.smcubes.model.base_column_structured_data.Base_column_structured_dataPackage;

import org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoFactory;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesReportResults;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesStaticModel;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesTest;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesTestInputData;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.SMCubesTestModule;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.StaticModel;

import org.eclipse.efbt.cocamo.smcubes.model.column_structured_data.Column_structured_dataPackage;

import org.eclipse.efbt.cocamo.smcubes.model.core.CorePackage;

import org.eclipse.efbt.cocamo.smcubes.model.data_definition.Data_definitionPackage;

import org.eclipse.efbt.cocamo.smcubes.model.efbt_data_definition.Efbt_data_definitionPackage;

import org.eclipse.efbt.cocamo.smcubes.model.efbt_mapping.Efbt_mappingPackage;

import org.eclipse.efbt.cocamo.smcubes.model.efbt_vtl_transformation.Efbt_vtl_transformationPackage;

import org.eclipse.efbt.cocamo.smcubes.model.mapping.MappingPackage;

import org.eclipse.efbt.cocamo.smcubes.model.rendering.RenderingPackage;

import org.eclipse.efbt.cocamo.smcubes.model.reports.ReportsPackage;

import org.eclipse.efbt.cocamo.smcubes.model.smcubes_model.Smcubes_modelPackage;

import org.eclipse.efbt.cocamo.smcubes.model.vtl_transformation.Vtl_transformationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CocamoPackageImpl extends EPackageImpl implements CocamoPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smCubesStaticModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smCubesTestInputDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smCubesReportResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smCubesTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smCubesTestModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CocamoPackageImpl()
	{
		super(eNS_URI, CocamoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CocamoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CocamoPackage init()
	{
		if (isInited) return (CocamoPackage)EPackage.Registry.INSTANCE.getEPackage(CocamoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCocamoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CocamoPackageImpl theCocamoPackage = registeredCocamoPackage instanceof CocamoPackageImpl ? (CocamoPackageImpl)registeredCocamoPackage : new CocamoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Functionality_modulePackage.eINSTANCE.eClass();
		ScenariosPackage.eINSTANCE.eClass();
		Module_managementPackage.eINSTANCE.eClass();
		Requirements_textPackage.eINSTANCE.eClass();
		Base_column_structured_dataPackage.eINSTANCE.eClass();
		Column_structured_dataPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		Data_definitionPackage.eINSTANCE.eClass();
		Efbt_data_definitionPackage.eINSTANCE.eClass();
		Efbt_mappingPackage.eINSTANCE.eClass();
		Efbt_vtl_transformationPackage.eINSTANCE.eClass();
		MappingPackage.eINSTANCE.eClass();
		RenderingPackage.eINSTANCE.eClass();
		ReportsPackage.eINSTANCE.eClass();
		Smcubes_modelPackage.eINSTANCE.eClass();
		Vtl_transformationPackage.eINSTANCE.eClass();
		Test_definitionPackage.eINSTANCE.eClass();
		Test_input_dataPackage.eINSTANCE.eClass();
		TestPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCocamoPackage.createPackageContents();

		// Initialize created meta-data
		theCocamoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCocamoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CocamoPackage.eNS_URI, theCocamoPackage);
		return theCocamoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSMCubesStaticModel()
	{
		return smCubesStaticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesStaticModel_SmCubesModel()
	{
		return (EReference)smCubesStaticModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesStaticModel_Requirements()
	{
		return (EReference)smCubesStaticModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesStaticModel_TestDefinitions()
	{
		return (EReference)smCubesStaticModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesStaticModel_Tests()
	{
		return (EReference)smCubesStaticModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesStaticModel_TestTemplates()
	{
		return (EReference)smCubesStaticModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesStaticModel_TestConstriants()
	{
		return (EReference)smCubesStaticModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesStaticModel_FunctionalityModules()
	{
		return (EReference)smCubesStaticModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSMCubesTestInputData()
	{
		return smCubesTestInputDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesTestInputData_Smcubes_inputdata()
	{
		return (EReference)smCubesTestInputDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSMCubesReportResults()
	{
		return smCubesReportResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesReportResults_ReportCells()
	{
		return (EReference)smCubesReportResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSMCubesTest()
	{
		return smCubesTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesTest_InputData()
	{
		return (EReference)smCubesTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesTest_ExpectedResults()
	{
		return (EReference)smCubesTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSMCubesTestModule()
	{
		return smCubesTestModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMCubesTestModule_Tests()
	{
		return (EReference)smCubesTestModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticModel()
	{
		return staticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaticModel_Name()
	{
		return (EAttribute)staticModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CocamoFactory getCocamoFactory()
	{
		return (CocamoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		smCubesStaticModelEClass = createEClass(SM_CUBES_STATIC_MODEL);
		createEReference(smCubesStaticModelEClass, SM_CUBES_STATIC_MODEL__SM_CUBES_MODEL);
		createEReference(smCubesStaticModelEClass, SM_CUBES_STATIC_MODEL__REQUIREMENTS);
		createEReference(smCubesStaticModelEClass, SM_CUBES_STATIC_MODEL__TEST_DEFINITIONS);
		createEReference(smCubesStaticModelEClass, SM_CUBES_STATIC_MODEL__TESTS);
		createEReference(smCubesStaticModelEClass, SM_CUBES_STATIC_MODEL__TEST_TEMPLATES);
		createEReference(smCubesStaticModelEClass, SM_CUBES_STATIC_MODEL__TEST_CONSTRIANTS);
		createEReference(smCubesStaticModelEClass, SM_CUBES_STATIC_MODEL__FUNCTIONALITY_MODULES);

		smCubesTestInputDataEClass = createEClass(SM_CUBES_TEST_INPUT_DATA);
		createEReference(smCubesTestInputDataEClass, SM_CUBES_TEST_INPUT_DATA__SMCUBES_INPUTDATA);

		smCubesReportResultsEClass = createEClass(SM_CUBES_REPORT_RESULTS);
		createEReference(smCubesReportResultsEClass, SM_CUBES_REPORT_RESULTS__REPORT_CELLS);

		smCubesTestEClass = createEClass(SM_CUBES_TEST);
		createEReference(smCubesTestEClass, SM_CUBES_TEST__INPUT_DATA);
		createEReference(smCubesTestEClass, SM_CUBES_TEST__EXPECTED_RESULTS);

		smCubesTestModuleEClass = createEClass(SM_CUBES_TEST_MODULE);
		createEReference(smCubesTestModuleEClass, SM_CUBES_TEST_MODULE__TESTS);

		staticModelEClass = createEClass(STATIC_MODEL);
		createEAttribute(staticModelEClass, STATIC_MODEL__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Smcubes_modelPackage theSmcubes_modelPackage = (Smcubes_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Smcubes_modelPackage.eNS_URI);
		Requirements_textPackage theRequirements_textPackage = (Requirements_textPackage)EPackage.Registry.INSTANCE.getEPackage(Requirements_textPackage.eNS_URI);
		Test_definitionPackage theTest_definitionPackage = (Test_definitionPackage)EPackage.Registry.INSTANCE.getEPackage(Test_definitionPackage.eNS_URI);
		Functionality_modulePackage theFunctionality_modulePackage = (Functionality_modulePackage)EPackage.Registry.INSTANCE.getEPackage(Functionality_modulePackage.eNS_URI);
		Test_input_dataPackage theTest_input_dataPackage = (Test_input_dataPackage)EPackage.Registry.INSTANCE.getEPackage(Test_input_dataPackage.eNS_URI);
		Base_column_structured_dataPackage theBase_column_structured_dataPackage = (Base_column_structured_dataPackage)EPackage.Registry.INSTANCE.getEPackage(Base_column_structured_dataPackage.eNS_URI);
		TestPackage theTestPackage = (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		ReportsPackage theReportsPackage = (ReportsPackage)EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smCubesStaticModelEClass.getESuperTypes().add(this.getStaticModel());
		smCubesTestInputDataEClass.getESuperTypes().add(theTest_input_dataPackage.getTestInputData());
		smCubesReportResultsEClass.getESuperTypes().add(theTestPackage.getResult());
		smCubesTestEClass.getESuperTypes().add(theTestPackage.getE2ETest());
		smCubesTestModuleEClass.getESuperTypes().add(theTestPackage.getTestModule());

		// Initialize classes, features, and operations; add parameters
		initEClass(smCubesStaticModelEClass, SMCubesStaticModel.class, "SMCubesStaticModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMCubesStaticModel_SmCubesModel(), theSmcubes_modelPackage.getSmcubesModel(), null, "smCubesModel", null, 0, 1, SMCubesStaticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMCubesStaticModel_Requirements(), theRequirements_textPackage.getRequirementsModule(), null, "requirements", null, 0, 1, SMCubesStaticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMCubesStaticModel_TestDefinitions(), theTest_definitionPackage.getTestDefinitionModule(), null, "testDefinitions", null, 0, 1, SMCubesStaticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMCubesStaticModel_Tests(), this.getSMCubesTestModule(), null, "tests", null, 0, 1, SMCubesStaticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMCubesStaticModel_TestTemplates(), theTest_definitionPackage.getTestTemplateModule(), null, "testTemplates", null, 0, 1, SMCubesStaticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMCubesStaticModel_TestConstriants(), theTest_definitionPackage.getTestContraints(), null, "testConstriants", null, 0, 1, SMCubesStaticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMCubesStaticModel_FunctionalityModules(), theFunctionality_modulePackage.getFunctionalityModuleModule(), null, "functionalityModules", null, 0, 1, SMCubesStaticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smCubesTestInputDataEClass, SMCubesTestInputData.class, "SMCubesTestInputData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMCubesTestInputData_Smcubes_inputdata(), theBase_column_structured_dataPackage.getBaseColumnStructuredData(), null, "smcubes_inputdata", null, 0, -1, SMCubesTestInputData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smCubesReportResultsEClass, SMCubesReportResults.class, "SMCubesReportResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMCubesReportResults_ReportCells(), theReportsPackage.getReportCellValue(), null, "reportCells", null, 0, -1, SMCubesReportResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smCubesTestEClass, SMCubesTest.class, "SMCubesTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMCubesTest_InputData(), this.getSMCubesTestInputData(), null, "inputData", null, 0, 1, SMCubesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMCubesTest_ExpectedResults(), this.getSMCubesReportResults(), null, "expectedResults", null, 0, 1, SMCubesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smCubesTestModuleEClass, SMCubesTestModule.class, "SMCubesTestModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMCubesTestModule_Tests(), this.getSMCubesTest(), null, "tests", null, 0, -1, SMCubesTestModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticModelEClass, StaticModel.class, "StaticModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, StaticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// license
		createLicenseAnnotations();
	}

	/**
	 * Initializes the annotations for <b>license</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLicenseAnnotations()
	{
		String source = "license";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "license", "Copyright (c) 2020 Bird Software Solutions Ltd\n All rights reserved. This file and the accompanying materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v20.html\n\nSPDX-License-Identifier: EPL-2.0 \n\n Contributors:\n Neil Mackenzie - initial API and implementation\r"
		   });
	}

} //CocamoPackageImpl
