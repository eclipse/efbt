/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.util;

import org.eclipse.efbt.input_data.smcubes.model.column_structured_data.Cell;
import org.eclipse.efbt.input_data.smcubes.model.column_structured_data.ColumnStructuredData;
import org.eclipse.efbt.input_data.smcubes.model.column_structured_data.RowData;

import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.*;

import org.eclipse.efbt.requirements.core.model.requirements_text.Tag;

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
 * @see org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.Cell_transformation_logicPackage
 * @generated
 */
public class Cell_transformation_logicSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cell_transformation_logicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell_transformation_logicSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = Cell_transformation_logicPackage.eINSTANCE;
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
			case Cell_transformation_logicPackage.FORMULA_CELL:
			{
				FormulaCell formulaCell = (FormulaCell)theEObject;
				T result = caseFormulaCell(formulaCell);
				if (result == null) result = caseCell(formulaCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA:
			{
				DerivedColumnStructuredData derivedColumnStructuredData = (DerivedColumnStructuredData)theEObject;
				T result = caseDerivedColumnStructuredData(derivedColumnStructuredData);
				if (result == null) result = caseColumnStructuredData(derivedColumnStructuredData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cell_transformation_logicPackage.DERIVED_ROW_DATA:
			{
				DerivedRowData derivedRowData = (DerivedRowData)theEObject;
				T result = caseDerivedRowData(derivedRowData);
				if (result == null) result = caseRowData(derivedRowData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cell_transformation_logicPackage.FUNCTION_TAG:
			{
				FunctionTag functionTag = (FunctionTag)theEObject;
				T result = caseFunctionTag(functionTag);
				if (result == null) result = caseTag(functionTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cell_transformation_logicPackage.FORMULA_CELL_TAG:
			{
				FormulaCellTag formulaCellTag = (FormulaCellTag)theEObject;
				T result = caseFormulaCellTag(formulaCellTag);
				if (result == null) result = caseTag(formulaCellTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cell_transformation_logicPackage.COLUMN_STRUCTURED_DATA_TAG:
			{
				ColumnStructuredDataTag columnStructuredDataTag = (ColumnStructuredDataTag)theEObject;
				T result = caseColumnStructuredDataTag(columnStructuredDataTag);
				if (result == null) result = caseTag(columnStructuredDataTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulaCell(FormulaCell object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Column Structured Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Column Structured Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedColumnStructuredData(DerivedColumnStructuredData object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Row Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Row Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedRowData(DerivedRowData object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionTag(FunctionTag object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Cell Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Cell Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulaCellTag(FormulaCellTag object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Structured Data Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Structured Data Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnStructuredDataTag(ColumnStructuredDataTag object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Structured Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Structured Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnStructuredData(ColumnStructuredData object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowData(RowData object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object)
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

} //Cell_transformation_logicSwitch
