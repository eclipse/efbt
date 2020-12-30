/**
 */
package org.eclipse.efbt.cocamo.core.model.test_definition.impl;

import org.eclipse.efbt.cocamo.core.model.test_definition.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Test_definitionFactoryImpl extends EFactoryImpl implements Test_definitionFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test_definitionFactory init()
	{
		try
		{
			Test_definitionFactory theTest_definitionFactory = (Test_definitionFactory)EPackage.Registry.INSTANCE.getEFactory(Test_definitionPackage.eNS_URI);
			if (theTest_definitionFactory != null)
			{
				return theTest_definitionFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Test_definitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test_definitionFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case Test_definitionPackage.TEST_CONTRAINTS: return createTestContraints();
			case Test_definitionPackage.TEST_TEMPLATE_MODULE: return createTestTemplateModule();
			case Test_definitionPackage.TEST_TEMPLATE: return createTestTemplate();
			case Test_definitionPackage.TEST_CONSTRAINTS_MODULE: return createTestConstraintsModule();
			case Test_definitionPackage.TEST_DEFINITION: return createTestDefinition();
			case Test_definitionPackage.E2E_TEST_DEFINITION: return createE2ETestDefinition();
			case Test_definitionPackage.UNIT_TEST_DEFINITION: return createUnitTestDefinition();
			case Test_definitionPackage.CLAUSE: return createClause();
			case Test_definitionPackage.PARAM: return createParam();
			case Test_definitionPackage.GIVEN: return createGiven();
			case Test_definitionPackage.WHEN: return createWhen();
			case Test_definitionPackage.THEN: return createThen();
			case Test_definitionPackage.CLAUSE_TEXT: return createClauseText();
			case Test_definitionPackage.COVERAGE_GRID: return createCoverageGrid();
			case Test_definitionPackage.COVERAGE_GRID_POINT: return createCoverageGridPoint();
			case Test_definitionPackage.TEST_DEFINITION_MODULE: return createTestDefinitionModule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestContraints createTestContraints()
	{
		TestContraintsImpl testContraints = new TestContraintsImpl();
		return testContraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestTemplateModule createTestTemplateModule()
	{
		TestTemplateModuleImpl testTemplateModule = new TestTemplateModuleImpl();
		return testTemplateModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestTemplate createTestTemplate()
	{
		TestTemplateImpl testTemplate = new TestTemplateImpl();
		return testTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestConstraintsModule createTestConstraintsModule()
	{
		TestConstraintsModuleImpl testConstraintsModule = new TestConstraintsModuleImpl();
		return testConstraintsModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestDefinition createTestDefinition()
	{
		TestDefinitionImpl testDefinition = new TestDefinitionImpl();
		return testDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E2ETestDefinition createE2ETestDefinition()
	{
		E2ETestDefinitionImpl e2ETestDefinition = new E2ETestDefinitionImpl();
		return e2ETestDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitTestDefinition createUnitTestDefinition()
	{
		UnitTestDefinitionImpl unitTestDefinition = new UnitTestDefinitionImpl();
		return unitTestDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clause createClause()
	{
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Param createParam()
	{
		ParamImpl param = new ParamImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Given createGiven()
	{
		GivenImpl given = new GivenImpl();
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When createWhen()
	{
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Then createThen()
	{
		ThenImpl then = new ThenImpl();
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClauseText createClauseText()
	{
		ClauseTextImpl clauseText = new ClauseTextImpl();
		return clauseText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageGrid createCoverageGrid()
	{
		CoverageGridImpl coverageGrid = new CoverageGridImpl();
		return coverageGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageGridPoint createCoverageGridPoint()
	{
		CoverageGridPointImpl coverageGridPoint = new CoverageGridPointImpl();
		return coverageGridPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestDefinitionModule createTestDefinitionModule()
	{
		TestDefinitionModuleImpl testDefinitionModule = new TestDefinitionModuleImpl();
		return testDefinitionModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Test_definitionPackage getTest_definitionPackage()
	{
		return (Test_definitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Test_definitionPackage getPackage()
	{
		return Test_definitionPackage.eINSTANCE;
	}

} //Test_definitionFactoryImpl
