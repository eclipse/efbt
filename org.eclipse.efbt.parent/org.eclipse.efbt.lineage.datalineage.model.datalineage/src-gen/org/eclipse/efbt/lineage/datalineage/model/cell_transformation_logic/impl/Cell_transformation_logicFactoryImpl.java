/**
 */
package org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.impl;

import org.eclipse.efbt.lineage.datalineage.model.cell_transformation_logic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cell_transformation_logicFactoryImpl extends EFactoryImpl implements Cell_transformation_logicFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cell_transformation_logicFactory init()
	{
		try
		{
			Cell_transformation_logicFactory theCell_transformation_logicFactory = (Cell_transformation_logicFactory)EPackage.Registry.INSTANCE.getEFactory(Cell_transformation_logicPackage.eNS_URI);
			if (theCell_transformation_logicFactory != null)
			{
				return theCell_transformation_logicFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cell_transformation_logicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell_transformation_logicFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case Cell_transformation_logicPackage.FORMULA_CELL: return createFormulaCell();
			case Cell_transformation_logicPackage.DERIVED_COLUMN_STRUCTURED_DATA: return createDerivedColumnStructuredData();
			case Cell_transformation_logicPackage.DERIVED_ROW_DATA: return createDerivedRowData();
			case Cell_transformation_logicPackage.FUNCTION_TAG: return createFunctionTag();
			case Cell_transformation_logicPackage.FORMULA_CELL_TAG: return createFormulaCellTag();
			case Cell_transformation_logicPackage.COLUMN_STRUCTURED_DATA_TAG: return createColumnStructuredDataTag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulaCell createFormulaCell()
	{
		FormulaCellImpl formulaCell = new FormulaCellImpl();
		return formulaCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedColumnStructuredData createDerivedColumnStructuredData()
	{
		DerivedColumnStructuredDataImpl derivedColumnStructuredData = new DerivedColumnStructuredDataImpl();
		return derivedColumnStructuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedRowData createDerivedRowData()
	{
		DerivedRowDataImpl derivedRowData = new DerivedRowDataImpl();
		return derivedRowData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionTag createFunctionTag()
	{
		FunctionTagImpl functionTag = new FunctionTagImpl();
		return functionTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulaCellTag createFormulaCellTag()
	{
		FormulaCellTagImpl formulaCellTag = new FormulaCellTagImpl();
		return formulaCellTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnStructuredDataTag createColumnStructuredDataTag()
	{
		ColumnStructuredDataTagImpl columnStructuredDataTag = new ColumnStructuredDataTagImpl();
		return columnStructuredDataTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cell_transformation_logicPackage getCell_transformation_logicPackage()
	{
		return (Cell_transformation_logicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cell_transformation_logicPackage getPackage()
	{
		return Cell_transformation_logicPackage.eINSTANCE;
	}

} //Cell_transformation_logicFactoryImpl
