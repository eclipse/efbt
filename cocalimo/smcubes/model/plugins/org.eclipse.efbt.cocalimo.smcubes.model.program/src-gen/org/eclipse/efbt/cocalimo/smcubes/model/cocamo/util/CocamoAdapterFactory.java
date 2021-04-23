/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.cocamo.util;

import org.eclipse.efbt.cocalimo.core.model.test.BDDTest;
import org.eclipse.efbt.cocalimo.core.model.test.RegFunctionalityTest;
import org.eclipse.efbt.cocalimo.core.model.test.Result;
import org.eclipse.efbt.cocalimo.core.model.test.Test;
import org.eclipse.efbt.cocalimo.core.model.test.TestModule;

import org.eclipse.efbt.cocalimo.core.model.test_input_data.TestInputData;

import org.eclipse.efbt.cocalimo.smcubes.model.cocamo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.cocalimo.smcubes.model.cocamo.CocamoPackage
 * @generated
 */
public class CocamoAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CocamoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CocamoAdapterFactory()
	{
		if (modelPackage == null) {
			modelPackage = CocamoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CocamoSwitch<Adapter> modelSwitch =
		new CocamoSwitch<Adapter>() {
			@Override
			public Adapter caseSMCubesStaticModel(SMCubesStaticModel object) {
				return createSMCubesStaticModelAdapter();
			}
			@Override
			public Adapter caseSMCubesTestInputData(SMCubesTestInputData object) {
				return createSMCubesTestInputDataAdapter();
			}
			@Override
			public Adapter caseSMCubesReportResults(SMCubesReportResults object) {
				return createSMCubesReportResultsAdapter();
			}
			@Override
			public Adapter caseSMCubesBDDTest(SMCubesBDDTest object) {
				return createSMCubesBDDTestAdapter();
			}
			@Override
			public Adapter caseSMCubesBDDTestModule(SMCubesBDDTestModule object) {
				return createSMCubesBDDTestModuleAdapter();
			}
			@Override
			public Adapter caseStaticModel(StaticModel object) {
				return createStaticModelAdapter();
			}
			@Override
			public Adapter caseSMCubesRegFunctionalityTest(SMCubesRegFunctionalityTest object) {
				return createSMCubesRegFunctionalityTestAdapter();
			}
			@Override
			public Adapter caseSMCubesRegFunctionalityTestModule(SMCubesRegFunctionalityTestModule object) {
				return createSMCubesRegFunctionalityTestModuleAdapter();
			}
			@Override
			public Adapter caseTestInputData(TestInputData object) {
				return createTestInputDataAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseBDDTest(BDDTest object) {
				return createBDDTestAdapter();
			}
			@Override
			public Adapter caseModule(org.eclipse.efbt.cocalimo.core.model.module_management.Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseTestModule(TestModule object) {
				return createTestModuleAdapter();
			}
			@Override
			public Adapter caseRegFunctionalityTest(RegFunctionalityTest object) {
				return createRegFunctionalityTestAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesStaticModel <em>SM Cubes Static Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesStaticModel
	 * @generated
	 */
	public Adapter createSMCubesStaticModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesTestInputData <em>SM Cubes Test Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesTestInputData
	 * @generated
	 */
	public Adapter createSMCubesTestInputDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesReportResults <em>SM Cubes Report Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesReportResults
	 * @generated
	 */
	public Adapter createSMCubesReportResultsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesBDDTest <em>SM Cubes BDD Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesBDDTest
	 * @generated
	 */
	public Adapter createSMCubesBDDTestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesBDDTestModule <em>SM Cubes BDD Test Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesBDDTestModule
	 * @generated
	 */
	public Adapter createSMCubesBDDTestModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.smcubes.model.cocamo.StaticModel <em>Static Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.cocamo.StaticModel
	 * @generated
	 */
	public Adapter createStaticModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesRegFunctionalityTest <em>SM Cubes Reg Functionality Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesRegFunctionalityTest
	 * @generated
	 */
	public Adapter createSMCubesRegFunctionalityTestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesRegFunctionalityTestModule <em>SM Cubes Reg Functionality Test Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.smcubes.model.cocamo.SMCubesRegFunctionalityTestModule
	 * @generated
	 */
	public Adapter createSMCubesRegFunctionalityTestModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.core.model.test_input_data.TestInputData <em>Test Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.core.model.test_input_data.TestInputData
	 * @generated
	 */
	public Adapter createTestInputDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.core.model.test.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.core.model.test.Result
	 * @generated
	 */
	public Adapter createResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.core.model.test.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.core.model.test.Test
	 * @generated
	 */
	public Adapter createTestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.core.model.test.BDDTest <em>BDD Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.core.model.test.BDDTest
	 * @generated
	 */
	public Adapter createBDDTestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.core.model.module_management.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.core.model.module_management.Module
	 * @generated
	 */
	public Adapter createModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.core.model.test.TestModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.core.model.test.TestModule
	 * @generated
	 */
	public Adapter createTestModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.cocalimo.core.model.test.RegFunctionalityTest <em>Reg Functionality Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.cocalimo.core.model.test.RegFunctionalityTest
	 * @generated
	 */
	public Adapter createRegFunctionalityTestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //CocamoAdapterFactory