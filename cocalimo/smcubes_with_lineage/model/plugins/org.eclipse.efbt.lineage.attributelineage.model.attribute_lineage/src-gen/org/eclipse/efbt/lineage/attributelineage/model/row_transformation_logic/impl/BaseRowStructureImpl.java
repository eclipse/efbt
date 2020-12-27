/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl;

import java.util.Collection;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage;

import org.eclipse.efbt.lineage.common.model.column_transformation_logic.CubeColumn;

import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.BaseCube;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Row Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.BaseRowStructureImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.BaseRowStructureImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.BaseRowStructureImpl#isUsedInSubsets <em>Used In Subsets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseRowStructureImpl extends MinimalEObjectImpl.Container implements BaseRowStructure
{
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeColumn> columns;

	/**
	 * The cached value of the '{@link #getCube() <em>Cube</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected BaseCube cube;

	/**
	 * The default value of the '{@link #isUsedInSubsets() <em>Used In Subsets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsedInSubsets()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USED_IN_SUBSETS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsedInSubsets() <em>Used In Subsets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsedInSubsets()
	 * @generated
	 * @ordered
	 */
	protected boolean usedInSubsets = USED_IN_SUBSETS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseRowStructureImpl()
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
		return Row_transformation_logicPackage.Literals.BASE_ROW_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CubeColumn> getColumns()
	{
		if (columns == null)
		{
			columns = new EObjectContainmentEList<CubeColumn>(CubeColumn.class, this, Row_transformation_logicPackage.BASE_ROW_STRUCTURE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseCube getCube()
	{
		if (cube != null && cube.eIsProxy())
		{
			InternalEObject oldCube = (InternalEObject)cube;
			cube = (BaseCube)eResolveProxy(oldCube);
			if (cube != oldCube)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Row_transformation_logicPackage.BASE_ROW_STRUCTURE__CUBE, oldCube, cube));
			}
		}
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseCube basicGetCube()
	{
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCube(BaseCube newCube)
	{
		BaseCube oldCube = cube;
		cube = newCube;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Row_transformation_logicPackage.BASE_ROW_STRUCTURE__CUBE, oldCube, cube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsedInSubsets()
	{
		return usedInSubsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedInSubsets(boolean newUsedInSubsets)
	{
		boolean oldUsedInSubsets = usedInSubsets;
		usedInSubsets = newUsedInSubsets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Row_transformation_logicPackage.BASE_ROW_STRUCTURE__USED_IN_SUBSETS, oldUsedInSubsets, usedInSubsets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__COLUMNS:
				return getColumns();
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__CUBE:
				if (resolve) return getCube();
				return basicGetCube();
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__USED_IN_SUBSETS:
				return isUsedInSubsets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends CubeColumn>)newValue);
				return;
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__CUBE:
				setCube((BaseCube)newValue);
				return;
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__USED_IN_SUBSETS:
				setUsedInSubsets((Boolean)newValue);
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
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__COLUMNS:
				getColumns().clear();
				return;
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__CUBE:
				setCube((BaseCube)null);
				return;
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__USED_IN_SUBSETS:
				setUsedInSubsets(USED_IN_SUBSETS_EDEFAULT);
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
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__CUBE:
				return cube != null;
			case Row_transformation_logicPackage.BASE_ROW_STRUCTURE__USED_IN_SUBSETS:
				return usedInSubsets != USED_IN_SUBSETS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (usedInSubsets: ");
		result.append(usedInSubsets);
		result.append(')');
		return result.toString();
	}

} //BaseRowStructureImpl
