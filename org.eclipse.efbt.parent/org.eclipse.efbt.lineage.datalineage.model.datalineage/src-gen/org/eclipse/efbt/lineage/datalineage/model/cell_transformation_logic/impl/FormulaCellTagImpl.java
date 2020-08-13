/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl;

import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage;
import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.FormulaCell;
import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.FormulaCellTag;

import org.eclipse.efbt.requirements.core.model.requirements_text.impl.TagImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Cell Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl.FormulaCellTagImpl#getFormulaCell <em>Formula Cell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaCellTagImpl extends TagImpl implements FormulaCellTag
{
	/**
	 * The cached value of the '{@link #getFormulaCell() <em>Formula Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulaCell()
	 * @generated
	 * @ordered
	 */
	protected FormulaCell formulaCell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaCellTagImpl()
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
		return Cell_transformation_logicPackage.Literals.FORMULA_CELL_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulaCell getFormulaCell()
	{
		if (formulaCell != null && formulaCell.eIsProxy())
		{
			InternalEObject oldFormulaCell = (InternalEObject)formulaCell;
			formulaCell = (FormulaCell)eResolveProxy(oldFormulaCell);
			if (formulaCell != oldFormulaCell)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cell_transformation_logicPackage.FORMULA_CELL_TAG__FORMULA_CELL, oldFormulaCell, formulaCell));
			}
		}
		return formulaCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaCell basicGetFormulaCell()
	{
		return formulaCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormulaCell(FormulaCell newFormulaCell)
	{
		FormulaCell oldFormulaCell = formulaCell;
		formulaCell = newFormulaCell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cell_transformation_logicPackage.FORMULA_CELL_TAG__FORMULA_CELL, oldFormulaCell, formulaCell));
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
			case Cell_transformation_logicPackage.FORMULA_CELL_TAG__FORMULA_CELL:
				if (resolve) return getFormulaCell();
				return basicGetFormulaCell();
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
			case Cell_transformation_logicPackage.FORMULA_CELL_TAG__FORMULA_CELL:
				setFormulaCell((FormulaCell)newValue);
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
			case Cell_transformation_logicPackage.FORMULA_CELL_TAG__FORMULA_CELL:
				setFormulaCell((FormulaCell)null);
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
			case Cell_transformation_logicPackage.FORMULA_CELL_TAG__FORMULA_CELL:
				return formulaCell != null;
		}
		return super.eIsSet(featureID);
	}

} //FormulaCellTagImpl
