/**
 */
package org.eclipse.efbt.chirp.chirp_program.impl;

import org.eclipse.efbt.chirp.chirp_program.Chirp_programFactory;
import org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage;
import org.eclipse.efbt.chirp.chirp_program.Program;
import org.eclipse.efbt.chirp.chirp_program.SMCubesReportResults;
import org.eclipse.efbt.chirp.chirp_program.SMCubesTestInputData;

import org.eclipse.efbt.common.model.module_management.Module_managementPackage;

import org.eclipse.efbt.data_structures.smcubes.model.core.CorePackage;

import org.eclipse.efbt.data_structures.smcubes.model.data_definition.Data_definitionPackage;

import org.eclipse.efbt.data_structures.smcubes.model.efbt_data_definition.Efbt_data_definitionPackage;

import org.eclipse.efbt.data_structures.smcubes.model.efbt_mapping.Efbt_mappingPackage;

import org.eclipse.efbt.data_structures.smcubes.model.efbt_vtl_transformation.Efbt_vtl_transformationPackage;

import org.eclipse.efbt.data_structures.smcubes.model.mapping.MappingPackage;

import org.eclipse.efbt.data_structures.smcubes.model.rendering.RenderingPackage;

import org.eclipse.efbt.data_structures.smcubes.model.reports.ReportsPackage;

import org.eclipse.efbt.data_structures.smcubes.model.smcubes_model.Smcubes_modelPackage;

import org.eclipse.efbt.data_structures.smcubes.model.vtl_transformation.Vtl_transformationPackage;

import org.eclipse.efbt.functional_design.core.model.functionality_module.Functionality_modulePackage;

import org.eclipse.efbt.functional_design.core.model.scenarios.ScenariosPackage;

import org.eclipse.efbt.input_data.smcubes.model.base_column_structured_data.Base_column_structured_dataPackage;

import org.eclipse.efbt.input_data.smcubes.model.column_structured_data.Column_structured_dataPackage;

import org.eclipse.efbt.requirements.core.model.requirements_text.Requirements_textPackage;

import org.eclipse.efbt.testing.common.model.test.TestPackage;

import org.eclipse.efbt.testing.common.model.test_definition.Test_definitionPackage;

import org.eclipse.efbt.testing.common.model.test_input_data.Test_input_dataPackage;

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
public class Chirp_programPackageImpl extends EPackageImpl implements Chirp_programPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

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
	 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Chirp_programPackageImpl()
	{
		super(eNS_URI, Chirp_programFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Chirp_programPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Chirp_programPackage init()
	{
		if (isInited) return (Chirp_programPackage)EPackage.Registry.INSTANCE.getEPackage(Chirp_programPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredChirp_programPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Chirp_programPackageImpl theChirp_programPackage = registeredChirp_programPackage instanceof Chirp_programPackageImpl ? (Chirp_programPackageImpl)registeredChirp_programPackage : new Chirp_programPackageImpl();

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
		theChirp_programPackage.createPackageContents();

		// Initialize created meta-data
		theChirp_programPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChirp_programPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Chirp_programPackage.eNS_URI, theChirp_programPackage);
		return theChirp_programPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgram()
	{
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_SmCubesModel()
	{
		return (EReference)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_Requirements()
	{
		return (EReference)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_TestDefinitions()
	{
		return (EReference)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_Tests()
	{
		return (EReference)programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_TestTemplates()
	{
		return (EReference)programEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_TestConstriants()
	{
		return (EReference)programEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_FunctionalityModules()
	{
		return (EReference)programEClass.getEStructuralFeatures().get(6);
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
	public Chirp_programFactory getChirp_programFactory()
	{
		return (Chirp_programFactory)getEFactoryInstance();
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
		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__SM_CUBES_MODEL);
		createEReference(programEClass, PROGRAM__REQUIREMENTS);
		createEReference(programEClass, PROGRAM__TEST_DEFINITIONS);
		createEReference(programEClass, PROGRAM__TESTS);
		createEReference(programEClass, PROGRAM__TEST_TEMPLATES);
		createEReference(programEClass, PROGRAM__TEST_CONSTRIANTS);
		createEReference(programEClass, PROGRAM__FUNCTIONALITY_MODULES);

		smCubesTestInputDataEClass = createEClass(SM_CUBES_TEST_INPUT_DATA);
		createEReference(smCubesTestInputDataEClass, SM_CUBES_TEST_INPUT_DATA__SMCUBES_INPUTDATA);

		smCubesReportResultsEClass = createEClass(SM_CUBES_REPORT_RESULTS);
		createEReference(smCubesReportResultsEClass, SM_CUBES_REPORT_RESULTS__REPORT_CELLS);
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
		TestPackage theTestPackage = (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		Functionality_modulePackage theFunctionality_modulePackage = (Functionality_modulePackage)EPackage.Registry.INSTANCE.getEPackage(Functionality_modulePackage.eNS_URI);
		Test_input_dataPackage theTest_input_dataPackage = (Test_input_dataPackage)EPackage.Registry.INSTANCE.getEPackage(Test_input_dataPackage.eNS_URI);
		Base_column_structured_dataPackage theBase_column_structured_dataPackage = (Base_column_structured_dataPackage)EPackage.Registry.INSTANCE.getEPackage(Base_column_structured_dataPackage.eNS_URI);
		ReportsPackage theReportsPackage = (ReportsPackage)EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smCubesTestInputDataEClass.getESuperTypes().add(theTest_input_dataPackage.getTestInputData());
		smCubesReportResultsEClass.getESuperTypes().add(theTestPackage.getResult());

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_SmCubesModel(), theSmcubes_modelPackage.getSmcubesModel(), null, "smCubesModel", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Requirements(), theRequirements_textPackage.getRequirementsModule(), null, "requirements", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_TestDefinitions(), theTest_definitionPackage.getTestDefinitionModule(), null, "testDefinitions", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Tests(), theTestPackage.getTestModule(), null, "tests", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_TestTemplates(), theTest_definitionPackage.getTestTemplateModule(), null, "testTemplates", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_TestConstriants(), theTest_definitionPackage.getTestContraints(), null, "testConstriants", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_FunctionalityModules(), theFunctionality_modulePackage.getFunctionalityModuleModule(), null, "functionalityModules", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smCubesTestInputDataEClass, SMCubesTestInputData.class, "SMCubesTestInputData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMCubesTestInputData_Smcubes_inputdata(), theBase_column_structured_dataPackage.getBaseColumnStructuredData(), null, "smcubes_inputdata", null, 0, -1, SMCubesTestInputData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smCubesReportResultsEClass, SMCubesReportResults.class, "SMCubesReportResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMCubesReportResults_ReportCells(), theReportsPackage.getReportCellValue(), null, "reportCells", null, 0, -1, SMCubesReportResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Chirp_programPackageImpl
