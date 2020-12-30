/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.util;

import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.*;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage
 * @generated
 */
public class Incremental_row_transformation_logicSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Incremental_row_transformation_logicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incremental_row_transformation_logicSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = Incremental_row_transformation_logicPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case Incremental_row_transformation_logicPackage.BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION:
			{
				BaseViewIncorporatingDeltasRowFunction baseViewIncorporatingDeltasRowFunction = (BaseViewIncorporatingDeltasRowFunction)theEObject;
				T result = caseBaseViewIncorporatingDeltasRowFunction(baseViewIncorporatingDeltasRowFunction);
				if (result == null) result = caseRowCreationApproach(baseViewIncorporatingDeltasRowFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Incremental_row_transformation_logicPackage.DELTA_ACCUMULATION_ROW_FUNCTION:
			{
				DeltaAccumulationRowFunction deltaAccumulationRowFunction = (DeltaAccumulationRowFunction)theEObject;
				T result = caseDeltaAccumulationRowFunction(deltaAccumulationRowFunction);
				if (result == null) result = caseRowCreationApproach(deltaAccumulationRowFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base View Incorporating Deltas Row Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base View Incorporating Deltas Row Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseViewIncorporatingDeltasRowFunction(BaseViewIncorporatingDeltasRowFunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta Accumulation Row Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta Accumulation Row Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeltaAccumulationRowFunction(DeltaAccumulationRowFunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Creation Approach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Creation Approach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowCreationApproach(RowCreationApproach object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //Incremental_row_transformation_logicSwitch
