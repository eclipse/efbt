/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl;

import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction;
import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl;

import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.FreeBirdToolsCube;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Accumulation Row Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.DeltaAccumulationRowFunctionImpl#getUltimateCubeSource <em>Ultimate Cube Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaAccumulationRowFunctionImpl extends RowCreationApproachImpl implements DeltaAccumulationRowFunction
{
	/**
	 * The cached value of the '{@link #getUltimateCubeSource() <em>Ultimate Cube Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateCubeSource()
	 * @generated
	 * @ordered
	 */
	protected FreeBirdToolsCube ultimateCubeSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaAccumulationRowFunctionImpl()
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
		return Incremental_row_transformation_logicPackage.Literals.DELTA_ACCUMULATION_ROW_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeBirdToolsCube getUltimateCubeSource()
	{
		if (ultimateCubeSource != null && ultimateCubeSource.eIsProxy())
		{
			InternalEObject oldUltimateCubeSource = (InternalEObject)ultimateCubeSource;
			ultimateCubeSource = (FreeBirdToolsCube)eResolveProxy(oldUltimateCubeSource);
			if (ultimateCubeSource != oldUltimateCubeSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Incremental_row_transformation_logicPackage.DELTA_ACCUMULATION_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE, oldUltimateCubeSource, ultimateCubeSource));
			}
		}
		return ultimateCubeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeBirdToolsCube basicGetUltimateCubeSource()
	{
		return ultimateCubeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUltimateCubeSource(FreeBirdToolsCube newUltimateCubeSource)
	{
		FreeBirdToolsCube oldUltimateCubeSource = ultimateCubeSource;
		ultimateCubeSource = newUltimateCubeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Incremental_row_transformation_logicPackage.DELTA_ACCUMULATION_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE, oldUltimateCubeSource, ultimateCubeSource));
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
			case Incremental_row_transformation_logicPackage.DELTA_ACCUMULATION_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE:
				if (resolve) return getUltimateCubeSource();
				return basicGetUltimateCubeSource();
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
			case Incremental_row_transformation_logicPackage.DELTA_ACCUMULATION_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE:
				setUltimateCubeSource((FreeBirdToolsCube)newValue);
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
			case Incremental_row_transformation_logicPackage.DELTA_ACCUMULATION_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE:
				setUltimateCubeSource((FreeBirdToolsCube)null);
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
			case Incremental_row_transformation_logicPackage.DELTA_ACCUMULATION_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE:
				return ultimateCubeSource != null;
		}
		return super.eIsSet(featureID);
	}

} //DeltaAccumulationRowFunctionImpl
