/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage;

import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.FreeBirdToolsCube;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Creation Approach For Cube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachForCubeImpl#getRowCreationApproach <em>Row Creation Approach</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachForCubeImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachForCubeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowCreationApproachForCubeImpl extends MinimalEObjectImpl.Container implements RowCreationApproachForCube
{
	/**
	 * The cached value of the '{@link #getRowCreationApproach() <em>Row Creation Approach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowCreationApproach()
	 * @generated
	 * @ordered
	 */
	protected RowCreationApproach rowCreationApproach;

	/**
	 * The cached value of the '{@link #getCube() <em>Cube</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected FreeBirdToolsCube cube;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowCreationApproachForCubeImpl()
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
		return Row_transformation_logicPackage.Literals.ROW_CREATION_APPROACH_FOR_CUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowCreationApproach getRowCreationApproach()
	{
		return rowCreationApproach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRowCreationApproach(RowCreationApproach newRowCreationApproach, NotificationChain msgs)
	{
		RowCreationApproach oldRowCreationApproach = rowCreationApproach;
		rowCreationApproach = newRowCreationApproach;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH, oldRowCreationApproach, newRowCreationApproach);
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
	public void setRowCreationApproach(RowCreationApproach newRowCreationApproach)
	{
		if (newRowCreationApproach != rowCreationApproach)
		{
			NotificationChain msgs = null;
			if (rowCreationApproach != null)
				msgs = ((InternalEObject)rowCreationApproach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH, null, msgs);
			if (newRowCreationApproach != null)
				msgs = ((InternalEObject)newRowCreationApproach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH, null, msgs);
			msgs = basicSetRowCreationApproach(newRowCreationApproach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH, newRowCreationApproach, newRowCreationApproach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeBirdToolsCube getCube()
	{
		if (cube != null && cube.eIsProxy())
		{
			InternalEObject oldCube = (InternalEObject)cube;
			cube = (FreeBirdToolsCube)eResolveProxy(oldCube);
			if (cube != oldCube)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__CUBE, oldCube, cube));
			}
		}
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeBirdToolsCube basicGetCube()
	{
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCube(FreeBirdToolsCube newCube)
	{
		FreeBirdToolsCube oldCube = cube;
		cube = newCube;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__CUBE, oldCube, cube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__NAME, oldName, name));
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH:
				return basicSetRowCreationApproach(null, msgs);
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH:
				return getRowCreationApproach();
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__CUBE:
				if (resolve) return getCube();
				return basicGetCube();
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__NAME:
				return getName();
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH:
				setRowCreationApproach((RowCreationApproach)newValue);
				return;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__CUBE:
				setCube((FreeBirdToolsCube)newValue);
				return;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__NAME:
				setName((String)newValue);
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH:
				setRowCreationApproach((RowCreationApproach)null);
				return;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__CUBE:
				setCube((FreeBirdToolsCube)null);
				return;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__NAME:
				setName(NAME_EDEFAULT);
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
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH:
				return rowCreationApproach != null;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__CUBE:
				return cube != null;
			case Row_transformation_logicPackage.ROW_CREATION_APPROACH_FOR_CUBE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RowCreationApproachForCubeImpl
