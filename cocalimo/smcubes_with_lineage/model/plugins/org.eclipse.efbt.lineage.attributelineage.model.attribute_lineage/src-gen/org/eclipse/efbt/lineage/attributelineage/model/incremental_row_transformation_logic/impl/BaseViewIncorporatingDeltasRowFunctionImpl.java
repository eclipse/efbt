/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl;

import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction;
import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl;

import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.BaseCube;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base View Incorporating Deltas Row Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.BaseViewIncorporatingDeltasRowFunctionImpl#getUltimateCubeSource <em>Ultimate Cube Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseViewIncorporatingDeltasRowFunctionImpl extends RowCreationApproachImpl implements BaseViewIncorporatingDeltasRowFunction
{
	/**
	 * The cached value of the '{@link #getUltimateCubeSource() <em>Ultimate Cube Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateCubeSource()
	 * @generated
	 * @ordered
	 */
	protected BaseCube ultimateCubeSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseViewIncorporatingDeltasRowFunctionImpl()
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
		return Incremental_row_transformation_logicPackage.Literals.BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseCube getUltimateCubeSource()
	{
		if (ultimateCubeSource != null && ultimateCubeSource.eIsProxy())
		{
			InternalEObject oldUltimateCubeSource = (InternalEObject)ultimateCubeSource;
			ultimateCubeSource = (BaseCube)eResolveProxy(oldUltimateCubeSource);
			if (ultimateCubeSource != oldUltimateCubeSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Incremental_row_transformation_logicPackage.BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE, oldUltimateCubeSource, ultimateCubeSource));
			}
		}
		return ultimateCubeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseCube basicGetUltimateCubeSource()
	{
		return ultimateCubeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUltimateCubeSource(BaseCube newUltimateCubeSource)
	{
		BaseCube oldUltimateCubeSource = ultimateCubeSource;
		ultimateCubeSource = newUltimateCubeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Incremental_row_transformation_logicPackage.BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE, oldUltimateCubeSource, ultimateCubeSource));
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
			case Incremental_row_transformation_logicPackage.BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE:
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
			case Incremental_row_transformation_logicPackage.BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE:
				setUltimateCubeSource((BaseCube)newValue);
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
			case Incremental_row_transformation_logicPackage.BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE:
				setUltimateCubeSource((BaseCube)null);
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
			case Incremental_row_transformation_logicPackage.BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE:
				return ultimateCubeSource != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseViewIncorporatingDeltasRowFunctionImpl
