/**
 */
package org.eclipse.efbt.data_structures.smcubes.model.reports.impl;

import org.eclipse.efbt.data_structures.smcubes.model.data_definition.COMBINATION;

import org.eclipse.efbt.data_structures.smcubes.model.reports.ReportCell;
import org.eclipse.efbt.data_structures.smcubes.model.reports.ReportsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.data_structures.smcubes.model.reports.impl.ReportCellImpl#getCombination <em>Combination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportCellImpl extends MinimalEObjectImpl.Container implements ReportCell
{
	/**
	 * The cached value of the '{@link #getCombination() <em>Combination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombination()
	 * @generated
	 * @ordered
	 */
	protected COMBINATION combination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportCellImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ReportsPackage.Literals.REPORT_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public COMBINATION getCombination()
	{
		if (combination != null && combination.eIsProxy())
		{
			InternalEObject oldCombination = (InternalEObject)combination;
			combination = (COMBINATION)eResolveProxy(oldCombination);
			if (combination != oldCombination)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportsPackage.REPORT_CELL__COMBINATION, oldCombination, combination));
			}
		}
		return combination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMBINATION basicGetCombination()
	{
		return combination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCombination(COMBINATION newCombination)
	{
		COMBINATION oldCombination = combination;
		combination = newCombination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.REPORT_CELL__COMBINATION, oldCombination, combination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ReportsPackage.REPORT_CELL__COMBINATION:
				if (resolve) return getCombination();
				return basicGetCombination();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ReportsPackage.REPORT_CELL__COMBINATION:
				setCombination((COMBINATION)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ReportsPackage.REPORT_CELL__COMBINATION:
				setCombination((COMBINATION)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ReportsPackage.REPORT_CELL__COMBINATION:
				return combination != null;
		}
		return super.eIsSet(featureID);
	}

} //ReportCellImpl
