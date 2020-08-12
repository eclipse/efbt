/**
 */
package org.eclipse.efbt.chirp.chirp_program;

import org.eclipse.efbt.testing.common.model.test.TestPackage;

import org.eclipse.efbt.testing.common.model.test_input_data.Test_input_dataPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.chirp.chirp_program.Chirp_programFactory
 * @model kind="package"
 * @generated
 */
public interface Chirp_programPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chirp_program";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/chirp_program";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chirp_program";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Chirp_programPackage eINSTANCE = org.eclipse.efbt.chirp.chirp_program.impl.Chirp_programPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl
	 * @see org.eclipse.efbt.chirp.chirp_program.impl.Chirp_programPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Sm Cubes Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SM_CUBES_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__REQUIREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Test Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TEST_DEFINITIONS = 2;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TESTS = 3;

	/**
	 * The feature id for the '<em><b>Test Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TEST_TEMPLATES = 4;

	/**
	 * The feature id for the '<em><b>Test Constriants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TEST_CONSTRIANTS = 5;

	/**
	 * The feature id for the '<em><b>Functionality Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FUNCTIONALITY_MODULES = 6;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.chirp.chirp_program.impl.SMCubesTestInputDataImpl <em>SM Cubes Test Input Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.chirp.chirp_program.impl.SMCubesTestInputDataImpl
	 * @see org.eclipse.efbt.chirp.chirp_program.impl.Chirp_programPackageImpl#getSMCubesTestInputData()
	 * @generated
	 */
	int SM_CUBES_TEST_INPUT_DATA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CUBES_TEST_INPUT_DATA__NAME = Test_input_dataPackage.TEST_INPUT_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Smcubes inputdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CUBES_TEST_INPUT_DATA__SMCUBES_INPUTDATA = Test_input_dataPackage.TEST_INPUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SM Cubes Test Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CUBES_TEST_INPUT_DATA_FEATURE_COUNT = Test_input_dataPackage.TEST_INPUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SM Cubes Test Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CUBES_TEST_INPUT_DATA_OPERATION_COUNT = Test_input_dataPackage.TEST_INPUT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.chirp.chirp_program.impl.SMCubesReportResultsImpl <em>SM Cubes Report Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.chirp.chirp_program.impl.SMCubesReportResultsImpl
	 * @see org.eclipse.efbt.chirp.chirp_program.impl.Chirp_programPackageImpl#getSMCubesReportResults()
	 * @generated
	 */
	int SM_CUBES_REPORT_RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Report Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CUBES_REPORT_RESULTS__REPORT_CELLS = TestPackage.RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SM Cubes Report Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CUBES_REPORT_RESULTS_FEATURE_COUNT = TestPackage.RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SM Cubes Report Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_CUBES_REPORT_RESULTS_OPERATION_COUNT = TestPackage.RESULT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.chirp.chirp_program.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.chirp.chirp_program.Program#getSmCubesModel <em>Sm Cubes Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sm Cubes Model</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.Program#getSmCubesModel()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_SmCubesModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.chirp.chirp_program.Program#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.Program#getRequirements()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.chirp.chirp_program.Program#getTestDefinitions <em>Test Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Definitions</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.Program#getTestDefinitions()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_TestDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.chirp.chirp_program.Program#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tests</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.Program#getTests()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Tests();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.chirp.chirp_program.Program#getTestTemplates <em>Test Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Templates</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.Program#getTestTemplates()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_TestTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.chirp.chirp_program.Program#getTestConstriants <em>Test Constriants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Constriants</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.Program#getTestConstriants()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_TestConstriants();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.chirp.chirp_program.Program#getFunctionalityModules <em>Functionality Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functionality Modules</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.Program#getFunctionalityModules()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_FunctionalityModules();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.chirp.chirp_program.SMCubesTestInputData <em>SM Cubes Test Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Cubes Test Input Data</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.SMCubesTestInputData
	 * @generated
	 */
	EClass getSMCubesTestInputData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.chirp.chirp_program.SMCubesTestInputData#getSmcubes_inputdata <em>Smcubes inputdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smcubes inputdata</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.SMCubesTestInputData#getSmcubes_inputdata()
	 * @see #getSMCubesTestInputData()
	 * @generated
	 */
	EReference getSMCubesTestInputData_Smcubes_inputdata();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.chirp.chirp_program.SMCubesReportResults <em>SM Cubes Report Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM Cubes Report Results</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.SMCubesReportResults
	 * @generated
	 */
	EClass getSMCubesReportResults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.chirp.chirp_program.SMCubesReportResults#getReportCells <em>Report Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report Cells</em>'.
	 * @see org.eclipse.efbt.chirp.chirp_program.SMCubesReportResults#getReportCells()
	 * @see #getSMCubesReportResults()
	 * @generated
	 */
	EReference getSMCubesReportResults_ReportCells();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Chirp_programFactory getChirp_programFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.chirp.chirp_program.impl.ProgramImpl
		 * @see org.eclipse.efbt.chirp.chirp_program.impl.Chirp_programPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Sm Cubes Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SM_CUBES_MODEL = eINSTANCE.getProgram_SmCubesModel();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__REQUIREMENTS = eINSTANCE.getProgram_Requirements();

		/**
		 * The meta object literal for the '<em><b>Test Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__TEST_DEFINITIONS = eINSTANCE.getProgram_TestDefinitions();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__TESTS = eINSTANCE.getProgram_Tests();

		/**
		 * The meta object literal for the '<em><b>Test Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__TEST_TEMPLATES = eINSTANCE.getProgram_TestTemplates();

		/**
		 * The meta object literal for the '<em><b>Test Constriants</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__TEST_CONSTRIANTS = eINSTANCE.getProgram_TestConstriants();

		/**
		 * The meta object literal for the '<em><b>Functionality Modules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FUNCTIONALITY_MODULES = eINSTANCE.getProgram_FunctionalityModules();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.chirp.chirp_program.impl.SMCubesTestInputDataImpl <em>SM Cubes Test Input Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.chirp.chirp_program.impl.SMCubesTestInputDataImpl
		 * @see org.eclipse.efbt.chirp.chirp_program.impl.Chirp_programPackageImpl#getSMCubesTestInputData()
		 * @generated
		 */
		EClass SM_CUBES_TEST_INPUT_DATA = eINSTANCE.getSMCubesTestInputData();

		/**
		 * The meta object literal for the '<em><b>Smcubes inputdata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CUBES_TEST_INPUT_DATA__SMCUBES_INPUTDATA = eINSTANCE.getSMCubesTestInputData_Smcubes_inputdata();

		/**
		 * The meta object literal for the '{@link org.eclipse.efbt.chirp.chirp_program.impl.SMCubesReportResultsImpl <em>SM Cubes Report Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.efbt.chirp.chirp_program.impl.SMCubesReportResultsImpl
		 * @see org.eclipse.efbt.chirp.chirp_program.impl.Chirp_programPackageImpl#getSMCubesReportResults()
		 * @generated
		 */
		EClass SM_CUBES_REPORT_RESULTS = eINSTANCE.getSMCubesReportResults();

		/**
		 * The meta object literal for the '<em><b>Report Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM_CUBES_REPORT_RESULTS__REPORT_CELLS = eINSTANCE.getSMCubesReportResults_ReportCells();

	}

} //Chirp_programPackage
