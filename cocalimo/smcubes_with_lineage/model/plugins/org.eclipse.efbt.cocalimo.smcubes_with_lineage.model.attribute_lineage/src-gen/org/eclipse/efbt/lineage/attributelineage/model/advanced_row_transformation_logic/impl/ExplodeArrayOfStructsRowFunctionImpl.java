/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.impl;

import org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.Advanced_row_transformation_logicPackage;
import org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.ExplodeArrayOfStructsRowFunction;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.RowCreationApproachImpl;

import org.eclipse.efbt.lineage.common.model.lineagecubes.efbt_advanced_data_definition.ArrayTypedVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explode Array Of Structs Row Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.impl.ExplodeArrayOfStructsRowFunctionImpl#getArraySourceVariable <em>Array Source Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplodeArrayOfStructsRowFunctionImpl extends RowCreationApproachImpl implements ExplodeArrayOfStructsRowFunction
{
	/**
	 * The cached value of the '{@link #getArraySourceVariable() <em>Array Source Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySourceVariable()
	 * @generated
	 * @ordered
	 */
	protected ArrayTypedVariable arraySourceVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplodeArrayOfStructsRowFunctionImpl()
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
		return Advanced_row_transformation_logicPackage.Literals.EXPLODE_ARRAY_OF_STRUCTS_ROW_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayTypedVariable getArraySourceVariable()
	{
		if (arraySourceVariable != null && arraySourceVariable.eIsProxy())
		{
			InternalEObject oldArraySourceVariable = (InternalEObject)arraySourceVariable;
			arraySourceVariable = (ArrayTypedVariable)eResolveProxy(oldArraySourceVariable);
			if (arraySourceVariable != oldArraySourceVariable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Advanced_row_transformation_logicPackage.EXPLODE_ARRAY_OF_STRUCTS_ROW_FUNCTION__ARRAY_SOURCE_VARIABLE, oldArraySourceVariable, arraySourceVariable));
			}
		}
		return arraySourceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypedVariable basicGetArraySourceVariable()
	{
		return arraySourceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArraySourceVariable(ArrayTypedVariable newArraySourceVariable)
	{
		ArrayTypedVariable oldArraySourceVariable = arraySourceVariable;
		arraySourceVariable = newArraySourceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Advanced_row_transformation_logicPackage.EXPLODE_ARRAY_OF_STRUCTS_ROW_FUNCTION__ARRAY_SOURCE_VARIABLE, oldArraySourceVariable, arraySourceVariable));
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
			case Advanced_row_transformation_logicPackage.EXPLODE_ARRAY_OF_STRUCTS_ROW_FUNCTION__ARRAY_SOURCE_VARIABLE:
				if (resolve) return getArraySourceVariable();
				return basicGetArraySourceVariable();
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
			case Advanced_row_transformation_logicPackage.EXPLODE_ARRAY_OF_STRUCTS_ROW_FUNCTION__ARRAY_SOURCE_VARIABLE:
				setArraySourceVariable((ArrayTypedVariable)newValue);
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
			case Advanced_row_transformation_logicPackage.EXPLODE_ARRAY_OF_STRUCTS_ROW_FUNCTION__ARRAY_SOURCE_VARIABLE:
				setArraySourceVariable((ArrayTypedVariable)null);
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
			case Advanced_row_transformation_logicPackage.EXPLODE_ARRAY_OF_STRUCTS_ROW_FUNCTION__ARRAY_SOURCE_VARIABLE:
				return arraySourceVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplodeArrayOfStructsRowFunctionImpl
