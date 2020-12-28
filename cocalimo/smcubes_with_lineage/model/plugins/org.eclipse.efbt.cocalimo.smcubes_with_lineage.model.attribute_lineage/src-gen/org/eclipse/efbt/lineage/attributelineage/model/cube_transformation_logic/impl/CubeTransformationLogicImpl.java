/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.impl;

import org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.CubeTransformationLogic;
import org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.Cube_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube;

import org.eclipse.efbt.lineage.common.model.column_transformation_logic.ColumnFunctionGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Transformation Logic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.impl.CubeTransformationLogicImpl#getColumnFunctionGroup <em>Column Function Group</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.impl.CubeTransformationLogicImpl#getRowCreationApproachForCube <em>Row Creation Approach For Cube</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.impl.CubeTransformationLogicImpl#isUsedInSubsets <em>Used In Subsets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubeTransformationLogicImpl extends MinimalEObjectImpl.Container implements CubeTransformationLogic
{
	/**
	 * The cached value of the '{@link #getColumnFunctionGroup() <em>Column Function Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnFunctionGroup()
	 * @generated
	 * @ordered
	 */
	protected ColumnFunctionGroup columnFunctionGroup;

	/**
	 * The cached value of the '{@link #getRowCreationApproachForCube() <em>Row Creation Approach For Cube</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowCreationApproachForCube()
	 * @generated
	 * @ordered
	 */
	protected RowCreationApproachForCube rowCreationApproachForCube;

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
	protected CubeTransformationLogicImpl()
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
		return Cube_transformation_logicPackage.Literals.CUBE_TRANSFORMATION_LOGIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnFunctionGroup getColumnFunctionGroup()
	{
		return columnFunctionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnFunctionGroup(ColumnFunctionGroup newColumnFunctionGroup, NotificationChain msgs)
	{
		ColumnFunctionGroup oldColumnFunctionGroup = columnFunctionGroup;
		columnFunctionGroup = newColumnFunctionGroup;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__COLUMN_FUNCTION_GROUP, oldColumnFunctionGroup, newColumnFunctionGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnFunctionGroup(ColumnFunctionGroup newColumnFunctionGroup)
	{
		if (newColumnFunctionGroup != columnFunctionGroup)
		{
			NotificationChain msgs = null;
			if (columnFunctionGroup != null)
				msgs = ((InternalEObject)columnFunctionGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__COLUMN_FUNCTION_GROUP, null, msgs);
			if (newColumnFunctionGroup != null)
				msgs = ((InternalEObject)newColumnFunctionGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__COLUMN_FUNCTION_GROUP, null, msgs);
			msgs = basicSetColumnFunctionGroup(newColumnFunctionGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__COLUMN_FUNCTION_GROUP, newColumnFunctionGroup, newColumnFunctionGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowCreationApproachForCube getRowCreationApproachForCube()
	{
		return rowCreationApproachForCube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRowCreationApproachForCube(RowCreationApproachForCube newRowCreationApproachForCube, NotificationChain msgs)
	{
		RowCreationApproachForCube oldRowCreationApproachForCube = rowCreationApproachForCube;
		rowCreationApproachForCube = newRowCreationApproachForCube;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__ROW_CREATION_APPROACH_FOR_CUBE, oldRowCreationApproachForCube, newRowCreationApproachForCube);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowCreationApproachForCube(RowCreationApproachForCube newRowCreationApproachForCube)
	{
		if (newRowCreationApproachForCube != rowCreationApproachForCube)
		{
			NotificationChain msgs = null;
			if (rowCreationApproachForCube != null)
				msgs = ((InternalEObject)rowCreationApproachForCube).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__ROW_CREATION_APPROACH_FOR_CUBE, null, msgs);
			if (newRowCreationApproachForCube != null)
				msgs = ((InternalEObject)newRowCreationApproachForCube).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__ROW_CREATION_APPROACH_FOR_CUBE, null, msgs);
			msgs = basicSetRowCreationApproachForCube(newRowCreationApproachForCube, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__ROW_CREATION_APPROACH_FOR_CUBE, newRowCreationApproachForCube, newRowCreationApproachForCube));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__USED_IN_SUBSETS, oldUsedInSubsets, usedInSubsets));
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
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__COLUMN_FUNCTION_GROUP:
				return basicSetColumnFunctionGroup(null, msgs);
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__ROW_CREATION_APPROACH_FOR_CUBE:
				return basicSetRowCreationApproachForCube(null, msgs);
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
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__COLUMN_FUNCTION_GROUP:
				return getColumnFunctionGroup();
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__ROW_CREATION_APPROACH_FOR_CUBE:
				return getRowCreationApproachForCube();
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__USED_IN_SUBSETS:
				return isUsedInSubsets();
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
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__COLUMN_FUNCTION_GROUP:
				setColumnFunctionGroup((ColumnFunctionGroup)newValue);
				return;
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__ROW_CREATION_APPROACH_FOR_CUBE:
				setRowCreationApproachForCube((RowCreationApproachForCube)newValue);
				return;
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__USED_IN_SUBSETS:
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
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__COLUMN_FUNCTION_GROUP:
				setColumnFunctionGroup((ColumnFunctionGroup)null);
				return;
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__ROW_CREATION_APPROACH_FOR_CUBE:
				setRowCreationApproachForCube((RowCreationApproachForCube)null);
				return;
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__USED_IN_SUBSETS:
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
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__COLUMN_FUNCTION_GROUP:
				return columnFunctionGroup != null;
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__ROW_CREATION_APPROACH_FOR_CUBE:
				return rowCreationApproachForCube != null;
			case Cube_transformation_logicPackage.CUBE_TRANSFORMATION_LOGIC__USED_IN_SUBSETS:
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

} //CubeTransformationLogicImpl
