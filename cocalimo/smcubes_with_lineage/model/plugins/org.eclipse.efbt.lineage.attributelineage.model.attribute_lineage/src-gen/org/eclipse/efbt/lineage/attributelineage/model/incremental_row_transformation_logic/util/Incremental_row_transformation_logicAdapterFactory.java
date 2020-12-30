/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.util;

import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.*;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage
 * @generated
 */
public class Incremental_row_transformation_logicAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Incremental_row_transformation_logicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incremental_row_transformation_logicAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = Incremental_row_transformation_logicPackage.eINSTANCE;
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
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
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
	protected Incremental_row_transformation_logicSwitch<Adapter> modelSwitch =
		new Incremental_row_transformation_logicSwitch<Adapter>()
		{
			@Override
			public Adapter caseBaseViewIncorporatingDeltasRowFunction(BaseViewIncorporatingDeltasRowFunction object)
			{
				return createBaseViewIncorporatingDeltasRowFunctionAdapter();
			}
			@Override
			public Adapter caseDeltaAccumulationRowFunction(DeltaAccumulationRowFunction object)
			{
				return createDeltaAccumulationRowFunctionAdapter();
			}
			@Override
			public Adapter caseRowCreationApproach(RowCreationApproach object)
			{
				return createRowCreationApproachAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction <em>Base View Incorporating Deltas Row Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction
	 * @generated
	 */
	public Adapter createBaseViewIncorporatingDeltasRowFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction <em>Delta Accumulation Row Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction
	 * @generated
	 */
	public Adapter createDeltaAccumulationRowFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach <em>Row Creation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach
	 * @generated
	 */
	public Adapter createRowCreationApproachAdapter()
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

} //Incremental_row_transformation_logicAdapterFactory
