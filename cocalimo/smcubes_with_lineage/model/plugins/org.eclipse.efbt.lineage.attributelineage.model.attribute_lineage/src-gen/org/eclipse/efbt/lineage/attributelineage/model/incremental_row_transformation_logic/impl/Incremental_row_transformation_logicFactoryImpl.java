/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl;

import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.*;

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
public class Incremental_row_transformation_logicFactoryImpl extends EFactoryImpl implements Incremental_row_transformation_logicFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Incremental_row_transformation_logicFactory init()
	{
		try
		{
			Incremental_row_transformation_logicFactory theIncremental_row_transformation_logicFactory = (Incremental_row_transformation_logicFactory)EPackage.Registry.INSTANCE.getEFactory(Incremental_row_transformation_logicPackage.eNS_URI);
			if (theIncremental_row_transformation_logicFactory != null)
			{
				return theIncremental_row_transformation_logicFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Incremental_row_transformation_logicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incremental_row_transformation_logicFactoryImpl()
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
			case Incremental_row_transformation_logicPackage.BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION: return createBaseViewIncorporatingDeltasRowFunction();
			case Incremental_row_transformation_logicPackage.DELTA_ACCUMULATION_ROW_FUNCTION: return createDeltaAccumulationRowFunction();
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
	public BaseViewIncorporatingDeltasRowFunction createBaseViewIncorporatingDeltasRowFunction()
	{
		BaseViewIncorporatingDeltasRowFunctionImpl baseViewIncorporatingDeltasRowFunction = new BaseViewIncorporatingDeltasRowFunctionImpl();
		return baseViewIncorporatingDeltasRowFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaAccumulationRowFunction createDeltaAccumulationRowFunction()
	{
		DeltaAccumulationRowFunctionImpl deltaAccumulationRowFunction = new DeltaAccumulationRowFunctionImpl();
		return deltaAccumulationRowFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Incremental_row_transformation_logicPackage getIncremental_row_transformation_logicPackage()
	{
		return (Incremental_row_transformation_logicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Incremental_row_transformation_logicPackage getPackage()
	{
		return Incremental_row_transformation_logicPackage.eINSTANCE;
	}

} //Incremental_row_transformation_logicFactoryImpl
