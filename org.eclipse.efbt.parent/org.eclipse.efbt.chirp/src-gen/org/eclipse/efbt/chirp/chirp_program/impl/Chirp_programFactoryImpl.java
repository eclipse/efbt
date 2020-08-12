/**
 */
package org.eclipse.efbt.chirp.chirp_program.impl;

import org.eclipse.efbt.chirp.chirp_program.*;

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
public class Chirp_programFactoryImpl extends EFactoryImpl implements Chirp_programFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Chirp_programFactory init()
	{
		try
		{
			Chirp_programFactory theChirp_programFactory = (Chirp_programFactory)EPackage.Registry.INSTANCE.getEFactory(Chirp_programPackage.eNS_URI);
			if (theChirp_programFactory != null)
			{
				return theChirp_programFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Chirp_programFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chirp_programFactoryImpl()
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
			case Chirp_programPackage.PROGRAM: return createProgram();
			case Chirp_programPackage.SM_CUBES_TEST_INPUT_DATA: return createSMCubesTestInputData();
			case Chirp_programPackage.SM_CUBES_REPORT_RESULTS: return createSMCubesReportResults();
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
	public Program createProgram()
	{
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SMCubesTestInputData createSMCubesTestInputData()
	{
		SMCubesTestInputDataImpl smCubesTestInputData = new SMCubesTestInputDataImpl();
		return smCubesTestInputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SMCubesReportResults createSMCubesReportResults()
	{
		SMCubesReportResultsImpl smCubesReportResults = new SMCubesReportResultsImpl();
		return smCubesReportResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Chirp_programPackage getChirp_programPackage()
	{
		return (Chirp_programPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Chirp_programPackage getPackage()
	{
		return Chirp_programPackage.eINSTANCE;
	}

} //Chirp_programFactoryImpl
