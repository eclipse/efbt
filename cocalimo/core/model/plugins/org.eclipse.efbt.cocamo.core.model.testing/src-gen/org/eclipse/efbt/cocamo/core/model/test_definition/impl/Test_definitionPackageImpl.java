/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition.impl;

import org.eclipse.efbt.cocamo.core.model.module_management.Module_managementPackage;

import org.eclipse.efbt.cocamo.core.model.requirements_text.Requirements_textPackage;

import org.eclipse.efbt.cocamo.core.model.test.TestPackage;

import org.eclipse.efbt.cocamo.core.model.test.impl.TestPackageImpl;

import org.eclipse.efbt.cocamo.core.model.test_definition.Clause;
import org.eclipse.efbt.cocamo.core.model.test_definition.ClauseText;
import org.eclipse.efbt.cocamo.core.model.test_definition.CoverageGrid;
import org.eclipse.efbt.cocamo.core.model.test_definition.CoverageGridPoint;
import org.eclipse.efbt.cocamo.core.model.test_definition.E2ETestDefinition;
import org.eclipse.efbt.cocamo.core.model.test_definition.Given;
import org.eclipse.efbt.cocamo.core.model.test_definition.Param;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestConstraintsModule;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestContraints;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestDefinition;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestDefinitionModule;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestTemplate;
import org.eclipse.efbt.cocamo.core.model.test_definition.TestTemplateModule;
import org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionFactory;
import org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage;
import org.eclipse.efbt.cocamo.core.model.test_definition.Then;
import org.eclipse.efbt.cocamo.core.model.test_definition.UnitTestDefinition;
import org.eclipse.efbt.cocamo.core.model.test_definition.When;

import org.eclipse.efbt.cocamo.core.model.test_input_data.Test_input_dataPackage;

import org.eclipse.efbt.cocamo.core.model.test_input_data.impl.Test_input_dataPackageImpl;

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
public class Test_definitionPackageImpl extends EPackageImpl implements Test_definitionPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testContraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testTemplateModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testConstraintsModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e2ETestDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass givenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageGridPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testDefinitionModuleEClass = null;

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
	 * @see org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Test_definitionPackageImpl()
	{
		super(eNS_URI, Test_definitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Test_definitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Test_definitionPackage init()
	{
		if (isInited) return (Test_definitionPackage)EPackage.Registry.INSTANCE.getEPackage(Test_definitionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTest_definitionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Test_definitionPackageImpl theTest_definitionPackage = registeredTest_definitionPackage instanceof Test_definitionPackageImpl ? (Test_definitionPackageImpl)registeredTest_definitionPackage : new Test_definitionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Module_managementPackage.eINSTANCE.eClass();
		Requirements_textPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Test_input_dataPackage.eNS_URI);
		Test_input_dataPackageImpl theTest_input_dataPackage = (Test_input_dataPackageImpl)(registeredPackage instanceof Test_input_dataPackageImpl ? registeredPackage : Test_input_dataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		TestPackageImpl theTestPackage = (TestPackageImpl)(registeredPackage instanceof TestPackageImpl ? registeredPackage : TestPackage.eINSTANCE);

		// Create package meta-data objects
		theTest_definitionPackage.createPackageContents();
		theTest_input_dataPackage.createPackageContents();
		theTestPackage.createPackageContents();

		// Initialize created meta-data
		theTest_definitionPackage.initializePackageContents();
		theTest_input_dataPackage.initializePackageContents();
		theTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTest_definitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Test_definitionPackage.eNS_URI, theTest_definitionPackage);
		return theTest_definitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestContraints()
	{
		return testContraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestContraints_Template()
	{
		return (EReference)testContraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestContraints_Name()
	{
		return (EAttribute)testContraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestContraints_GivenParams()
	{
		return (EReference)testContraintsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestContraints_WhenParams()
	{
		return (EReference)testContraintsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestContraints_ThenParams()
	{
		return (EReference)testContraintsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestTemplateModule()
	{
		return testTemplateModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestTemplateModule_Templates()
	{
		return (EReference)testTemplateModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestTemplate()
	{
		return testTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestTemplate_Name()
	{
		return (EAttribute)testTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestTemplate_GivenText()
	{
		return (EReference)testTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestTemplate_WhenText()
	{
		return (EReference)testTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestTemplate_ThenText()
	{
		return (EReference)testTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestTemplate_GivenParams()
	{
		return (EReference)testTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestTemplate_WhenParams()
	{
		return (EReference)testTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestTemplate_ThenParams()
	{
		return (EReference)testTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestConstraintsModule()
	{
		return testConstraintsModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestConstraintsModule_CoverageTestSets()
	{
		return (EReference)testConstraintsModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestDefinition()
	{
		return testDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestDefinition_Name()
	{
		return (EAttribute)testDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestDefinition_TestContraints()
	{
		return (EReference)testDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestDefinition_Given()
	{
		return (EReference)testDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestDefinition_When()
	{
		return (EReference)testDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestDefinition_Then()
	{
		return (EReference)testDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getE2ETestDefinition()
	{
		return e2ETestDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitTestDefinition()
	{
		return unitTestDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClause()
	{
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClause_Text()
	{
		return (EReference)clauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClause_Params()
	{
		return (EReference)clauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClause_RegulatoryTextLinks()
	{
		return (EReference)clauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParam()
	{
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParam_Param()
	{
		return (EReference)paramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGiven()
	{
		return givenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhen()
	{
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThen()
	{
		return thenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClauseText()
	{
		return clauseTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClauseText_Name()
	{
		return (EAttribute)clauseTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoverageGrid()
	{
		return coverageGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoverageGrid_CoverageTestSet()
	{
		return (EReference)coverageGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoverageGrid_CoverageGridPoints()
	{
		return (EReference)coverageGridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoverageGrid_Name()
	{
		return (EAttribute)coverageGridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoverageGridPoint()
	{
		return coverageGridPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoverageGridPoint_Count()
	{
		return (EAttribute)coverageGridPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoverageGridPoint_Objects()
	{
		return (EReference)coverageGridPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestDefinitionModule()
	{
		return testDefinitionModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestDefinitionModule_TestDefinitions()
	{
		return (EReference)testDefinitionModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Test_definitionFactory getTest_definitionFactory()
	{
		return (Test_definitionFactory)getEFactoryInstance();
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
		testContraintsEClass = createEClass(TEST_CONTRAINTS);
		createEReference(testContraintsEClass, TEST_CONTRAINTS__TEMPLATE);
		createEAttribute(testContraintsEClass, TEST_CONTRAINTS__NAME);
		createEReference(testContraintsEClass, TEST_CONTRAINTS__GIVEN_PARAMS);
		createEReference(testContraintsEClass, TEST_CONTRAINTS__WHEN_PARAMS);
		createEReference(testContraintsEClass, TEST_CONTRAINTS__THEN_PARAMS);

		testTemplateModuleEClass = createEClass(TEST_TEMPLATE_MODULE);
		createEReference(testTemplateModuleEClass, TEST_TEMPLATE_MODULE__TEMPLATES);

		testTemplateEClass = createEClass(TEST_TEMPLATE);
		createEAttribute(testTemplateEClass, TEST_TEMPLATE__NAME);
		createEReference(testTemplateEClass, TEST_TEMPLATE__GIVEN_TEXT);
		createEReference(testTemplateEClass, TEST_TEMPLATE__WHEN_TEXT);
		createEReference(testTemplateEClass, TEST_TEMPLATE__THEN_TEXT);
		createEReference(testTemplateEClass, TEST_TEMPLATE__GIVEN_PARAMS);
		createEReference(testTemplateEClass, TEST_TEMPLATE__WHEN_PARAMS);
		createEReference(testTemplateEClass, TEST_TEMPLATE__THEN_PARAMS);

		testConstraintsModuleEClass = createEClass(TEST_CONSTRAINTS_MODULE);
		createEReference(testConstraintsModuleEClass, TEST_CONSTRAINTS_MODULE__COVERAGE_TEST_SETS);

		testDefinitionEClass = createEClass(TEST_DEFINITION);
		createEAttribute(testDefinitionEClass, TEST_DEFINITION__NAME);
		createEReference(testDefinitionEClass, TEST_DEFINITION__TEST_CONTRAINTS);
		createEReference(testDefinitionEClass, TEST_DEFINITION__GIVEN);
		createEReference(testDefinitionEClass, TEST_DEFINITION__WHEN);
		createEReference(testDefinitionEClass, TEST_DEFINITION__THEN);

		e2ETestDefinitionEClass = createEClass(E2E_TEST_DEFINITION);

		unitTestDefinitionEClass = createEClass(UNIT_TEST_DEFINITION);

		clauseEClass = createEClass(CLAUSE);
		createEReference(clauseEClass, CLAUSE__TEXT);
		createEReference(clauseEClass, CLAUSE__PARAMS);
		createEReference(clauseEClass, CLAUSE__REGULATORY_TEXT_LINKS);

		paramEClass = createEClass(PARAM);
		createEReference(paramEClass, PARAM__PARAM);

		givenEClass = createEClass(GIVEN);

		whenEClass = createEClass(WHEN);

		thenEClass = createEClass(THEN);

		clauseTextEClass = createEClass(CLAUSE_TEXT);
		createEAttribute(clauseTextEClass, CLAUSE_TEXT__NAME);

		coverageGridEClass = createEClass(COVERAGE_GRID);
		createEReference(coverageGridEClass, COVERAGE_GRID__COVERAGE_TEST_SET);
		createEReference(coverageGridEClass, COVERAGE_GRID__COVERAGE_GRID_POINTS);
		createEAttribute(coverageGridEClass, COVERAGE_GRID__NAME);

		coverageGridPointEClass = createEClass(COVERAGE_GRID_POINT);
		createEAttribute(coverageGridPointEClass, COVERAGE_GRID_POINT__COUNT);
		createEReference(coverageGridPointEClass, COVERAGE_GRID_POINT__OBJECTS);

		testDefinitionModuleEClass = createEClass(TEST_DEFINITION_MODULE);
		createEReference(testDefinitionModuleEClass, TEST_DEFINITION_MODULE__TEST_DEFINITIONS);
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
		Module_managementPackage theModule_managementPackage = (Module_managementPackage)EPackage.Registry.INSTANCE.getEPackage(Module_managementPackage.eNS_URI);
		Requirements_textPackage theRequirements_textPackage = (Requirements_textPackage)EPackage.Registry.INSTANCE.getEPackage(Requirements_textPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testTemplateModuleEClass.getESuperTypes().add(theModule_managementPackage.getModule());
		testConstraintsModuleEClass.getESuperTypes().add(theModule_managementPackage.getModule());
		e2ETestDefinitionEClass.getESuperTypes().add(this.getTestDefinition());
		unitTestDefinitionEClass.getESuperTypes().add(this.getTestDefinition());
		givenEClass.getESuperTypes().add(this.getClause());
		whenEClass.getESuperTypes().add(this.getClause());
		thenEClass.getESuperTypes().add(this.getClause());
		testDefinitionModuleEClass.getESuperTypes().add(theModule_managementPackage.getModule());

		// Initialize classes, features, and operations; add parameters
		initEClass(testContraintsEClass, TestContraints.class, "TestContraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestContraints_Template(), this.getTestTemplate(), null, "template", null, 0, 1, TestContraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestContraints_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestContraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestContraints_GivenParams(), this.getParam(), null, "givenParams", null, 0, -1, TestContraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestContraints_WhenParams(), this.getParam(), null, "whenParams", null, 0, -1, TestContraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestContraints_ThenParams(), this.getParam(), null, "thenParams", null, 0, -1, TestContraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testTemplateModuleEClass, TestTemplateModule.class, "TestTemplateModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestTemplateModule_Templates(), this.getTestTemplate(), null, "templates", null, 0, -1, TestTemplateModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testTemplateEClass, TestTemplate.class, "TestTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestTemplate_GivenText(), this.getClauseText(), null, "givenText", null, 0, 1, TestTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestTemplate_WhenText(), this.getClauseText(), null, "whenText", null, 0, 1, TestTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestTemplate_ThenText(), this.getClauseText(), null, "thenText", null, 0, 1, TestTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestTemplate_GivenParams(), this.getParam(), null, "givenParams", null, 0, -1, TestTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestTemplate_WhenParams(), this.getParam(), null, "whenParams", null, 0, -1, TestTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestTemplate_ThenParams(), this.getParam(), null, "thenParams", null, 0, -1, TestTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testConstraintsModuleEClass, TestConstraintsModule.class, "TestConstraintsModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestConstraintsModule_CoverageTestSets(), this.getTestContraints(), null, "coverageTestSets", null, 0, -1, TestConstraintsModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testDefinitionEClass, TestDefinition.class, "TestDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestDefinition_TestContraints(), this.getTestContraints(), null, "testContraints", null, 0, 1, TestDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestDefinition_Given(), this.getGiven(), null, "given", null, 0, 1, TestDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestDefinition_When(), this.getWhen(), null, "when", null, 0, 1, TestDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestDefinition_Then(), this.getThen(), null, "then", null, 0, 1, TestDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(e2ETestDefinitionEClass, E2ETestDefinition.class, "E2ETestDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitTestDefinitionEClass, UnitTestDefinition.class, "UnitTestDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClause_Text(), this.getClauseText(), null, "text", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClause_Params(), this.getParam(), null, "params", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClause_RegulatoryTextLinks(), theRequirements_textPackage.getTitledRequirementsSection(), null, "regulatoryTextLinks", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParam_Param(), ecorePackage.getEObject(), null, "param", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(givenEClass, Given.class, "Given", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenEClass, When.class, "When", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thenEClass, Then.class, "Then", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clauseTextEClass, ClauseText.class, "ClauseText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClauseText_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClauseText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coverageGridEClass, CoverageGrid.class, "CoverageGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoverageGrid_CoverageTestSet(), this.getTestContraints(), null, "coverageTestSet", null, 0, 1, CoverageGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverageGrid_CoverageGridPoints(), this.getCoverageGridPoint(), null, "coverageGridPoints", null, 0, 1, CoverageGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoverageGrid_Name(), ecorePackage.getEString(), "name", null, 0, 1, CoverageGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coverageGridPointEClass, CoverageGridPoint.class, "CoverageGridPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoverageGridPoint_Count(), ecorePackage.getEInt(), "count", null, 0, 1, CoverageGridPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoverageGridPoint_Objects(), ecorePackage.getEObject(), null, "objects", null, 0, -1, CoverageGridPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testDefinitionModuleEClass, TestDefinitionModule.class, "TestDefinitionModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestDefinitionModule_TestDefinitions(), this.getTestDefinition(), null, "testDefinitions", null, 0, -1, TestDefinitionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "license", "Copyright (c) 2019 Bird Software Solutions Ltd\n All rights reserved. This file and the accompanying materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v20.html\n\nSPDX-License-Identifier: EPL-2.0 \n\n Contributors:\n Neil Mackenzie - initial API and implementation\r"
		   });
	}

} //Test_definitionPackageImpl
