/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl;

import org.eclipse.efbt.cocalimo.core.model.module_management.Module_managementPackage;

import org.eclipse.efbt.cocamo.functions.model.functions.FunctionsPackage;

import org.eclipse.efbt.cocamo.smcubes.model.core.CorePackage;

import org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.Advanced_row_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.impl.Advanced_row_transformation_logicPackageImpl;

import org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.Attribute_lineagePackage;

import org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.impl.Attribute_lineagePackageImpl;

import org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.Cube_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.impl.Cube_transformation_logicPackageImpl;

import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.Incremental_row_transformation_logicPackageImpl;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.BaseRowStructure;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.CustomRowCreationApproach;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterAndGroupToOneRowCreationApproach;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.FilterRowCreationApproach;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.GroupByRowCreationApproach;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.OneToOneRowCreationApproach;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproach;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowCreationApproachForCube;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.RowJoinFunction;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicFactory;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.UnionRowCreationApproach;

import org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.Advanced_variable_lineagefunctionsPackage;

import org.eclipse.efbt.lineage.common.model.column_transformation_logic.Column_transformation_logicPackage;

import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.CubesPackage;

import org.eclipse.efbt.lineage.common.model.lineagecubes.efbt_advanced_data_definition.Efbt_advanced_data_definitionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Row_transformation_logicPackageImpl extends EPackageImpl implements Row_transformation_logicPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseRowStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customRowCreationApproachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterAndGroupToOneRowCreationApproachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowCreationApproachForCubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToOneRowCreationApproachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterRowCreationApproachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowCreationApproachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupByRowCreationApproachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowJoinFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionRowCreationApproachEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Row_transformation_logicPackageImpl()
	{
		super(eNS_URI, Row_transformation_logicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Row_transformation_logicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Row_transformation_logicPackage init()
	{
		if (isInited) return (Row_transformation_logicPackage)EPackage.Registry.INSTANCE.getEPackage(Row_transformation_logicPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRow_transformation_logicPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Row_transformation_logicPackageImpl theRow_transformation_logicPackage = registeredRow_transformation_logicPackage instanceof Row_transformation_logicPackageImpl ? (Row_transformation_logicPackageImpl)registeredRow_transformation_logicPackage : new Row_transformation_logicPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		FunctionsPackage.eINSTANCE.eClass();
		CubesPackage.eINSTANCE.eClass();
		Column_transformation_logicPackage.eINSTANCE.eClass();
		Module_managementPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		Advanced_variable_lineagefunctionsPackage.eINSTANCE.eClass();
		Efbt_advanced_data_definitionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Attribute_lineagePackage.eNS_URI);
		Attribute_lineagePackageImpl theAttribute_lineagePackage = (Attribute_lineagePackageImpl)(registeredPackage instanceof Attribute_lineagePackageImpl ? registeredPackage : Attribute_lineagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Cube_transformation_logicPackage.eNS_URI);
		Cube_transformation_logicPackageImpl theCube_transformation_logicPackage = (Cube_transformation_logicPackageImpl)(registeredPackage instanceof Cube_transformation_logicPackageImpl ? registeredPackage : Cube_transformation_logicPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Incremental_row_transformation_logicPackage.eNS_URI);
		Incremental_row_transformation_logicPackageImpl theIncremental_row_transformation_logicPackage = (Incremental_row_transformation_logicPackageImpl)(registeredPackage instanceof Incremental_row_transformation_logicPackageImpl ? registeredPackage : Incremental_row_transformation_logicPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Advanced_row_transformation_logicPackage.eNS_URI);
		Advanced_row_transformation_logicPackageImpl theAdvanced_row_transformation_logicPackage = (Advanced_row_transformation_logicPackageImpl)(registeredPackage instanceof Advanced_row_transformation_logicPackageImpl ? registeredPackage : Advanced_row_transformation_logicPackage.eINSTANCE);

		// Create package meta-data objects
		theRow_transformation_logicPackage.createPackageContents();
		theAttribute_lineagePackage.createPackageContents();
		theCube_transformation_logicPackage.createPackageContents();
		theIncremental_row_transformation_logicPackage.createPackageContents();
		theAdvanced_row_transformation_logicPackage.createPackageContents();

		// Initialize created meta-data
		theRow_transformation_logicPackage.initializePackageContents();
		theAttribute_lineagePackage.initializePackageContents();
		theCube_transformation_logicPackage.initializePackageContents();
		theIncremental_row_transformation_logicPackage.initializePackageContents();
		theAdvanced_row_transformation_logicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRow_transformation_logicPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Row_transformation_logicPackage.eNS_URI, theRow_transformation_logicPackage);
		return theRow_transformation_logicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseRowStructure()
	{
		return baseRowStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseRowStructure_Columns()
	{
		return (EReference)baseRowStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseRowStructure_Cube()
	{
		return (EReference)baseRowStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseRowStructure_UsedInSubsets()
	{
		return (EAttribute)baseRowStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomRowCreationApproach()
	{
		return customRowCreationApproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomRowCreationApproach_DependantVariables()
	{
		return (EReference)customRowCreationApproachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterAndGroupToOneRowCreationApproach()
	{
		return filterAndGroupToOneRowCreationApproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterAndGroupToOneRowCreationApproach_FilterFunction()
	{
		return (EReference)filterAndGroupToOneRowCreationApproachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterAndGroupToOneRowCreationApproach_GroupByVariables()
	{
		return (EReference)filterAndGroupToOneRowCreationApproachEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRowCreationApproachForCube()
	{
		return rowCreationApproachForCubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRowCreationApproachForCube_RowCreationApproach()
	{
		return (EReference)rowCreationApproachForCubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRowCreationApproachForCube_Cube()
	{
		return (EReference)rowCreationApproachForCubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRowCreationApproachForCube_Name()
	{
		return (EAttribute)rowCreationApproachForCubeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneToOneRowCreationApproach()
	{
		return oneToOneRowCreationApproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterRowCreationApproach()
	{
		return filterRowCreationApproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterRowCreationApproach_FilterFunction()
	{
		return (EReference)filterRowCreationApproachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRowCreationApproach()
	{
		return rowCreationApproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRowCreationApproach_DependantCubeColumns()
	{
		return (EReference)rowCreationApproachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRowCreationApproach_CreatedCubeColumns()
	{
		return (EReference)rowCreationApproachEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRowCreationApproach_DependantStructItemColumns()
	{
		return (EReference)rowCreationApproachEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupByRowCreationApproach()
	{
		return groupByRowCreationApproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroupByRowCreationApproach_GroupByColumns()
	{
		return (EReference)groupByRowCreationApproachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroupByRowCreationApproach_GroupByCubeColumns()
	{
		return (EReference)groupByRowCreationApproachEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRowJoinFunction()
	{
		return rowJoinFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRowJoinFunction_JoinFunction()
	{
		return (EReference)rowJoinFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnionRowCreationApproach()
	{
		return unionRowCreationApproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Row_transformation_logicFactory getRow_transformation_logicFactory()
	{
		return (Row_transformation_logicFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		baseRowStructureEClass = createEClass(BASE_ROW_STRUCTURE);
		createEReference(baseRowStructureEClass, BASE_ROW_STRUCTURE__COLUMNS);
		createEReference(baseRowStructureEClass, BASE_ROW_STRUCTURE__CUBE);
		createEAttribute(baseRowStructureEClass, BASE_ROW_STRUCTURE__USED_IN_SUBSETS);

		customRowCreationApproachEClass = createEClass(CUSTOM_ROW_CREATION_APPROACH);
		createEReference(customRowCreationApproachEClass, CUSTOM_ROW_CREATION_APPROACH__DEPENDANT_VARIABLES);

		filterAndGroupToOneRowCreationApproachEClass = createEClass(FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH);
		createEReference(filterAndGroupToOneRowCreationApproachEClass, FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH__FILTER_FUNCTION);
		createEReference(filterAndGroupToOneRowCreationApproachEClass, FILTER_AND_GROUP_TO_ONE_ROW_CREATION_APPROACH__GROUP_BY_VARIABLES);

		rowCreationApproachForCubeEClass = createEClass(ROW_CREATION_APPROACH_FOR_CUBE);
		createEReference(rowCreationApproachForCubeEClass, ROW_CREATION_APPROACH_FOR_CUBE__ROW_CREATION_APPROACH);
		createEReference(rowCreationApproachForCubeEClass, ROW_CREATION_APPROACH_FOR_CUBE__CUBE);
		createEAttribute(rowCreationApproachForCubeEClass, ROW_CREATION_APPROACH_FOR_CUBE__NAME);

		oneToOneRowCreationApproachEClass = createEClass(ONE_TO_ONE_ROW_CREATION_APPROACH);

		filterRowCreationApproachEClass = createEClass(FILTER_ROW_CREATION_APPROACH);
		createEReference(filterRowCreationApproachEClass, FILTER_ROW_CREATION_APPROACH__FILTER_FUNCTION);

		rowCreationApproachEClass = createEClass(ROW_CREATION_APPROACH);
		createEReference(rowCreationApproachEClass, ROW_CREATION_APPROACH__DEPENDANT_CUBE_COLUMNS);
		createEReference(rowCreationApproachEClass, ROW_CREATION_APPROACH__CREATED_CUBE_COLUMNS);
		createEReference(rowCreationApproachEClass, ROW_CREATION_APPROACH__DEPENDANT_STRUCT_ITEM_COLUMNS);

		groupByRowCreationApproachEClass = createEClass(GROUP_BY_ROW_CREATION_APPROACH);
		createEReference(groupByRowCreationApproachEClass, GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_COLUMNS);
		createEReference(groupByRowCreationApproachEClass, GROUP_BY_ROW_CREATION_APPROACH__GROUP_BY_CUBE_COLUMNS);

		rowJoinFunctionEClass = createEClass(ROW_JOIN_FUNCTION);
		createEReference(rowJoinFunctionEClass, ROW_JOIN_FUNCTION__JOIN_FUNCTION);

		unionRowCreationApproachEClass = createEClass(UNION_ROW_CREATION_APPROACH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Column_transformation_logicPackage theColumn_transformation_logicPackage = (Column_transformation_logicPackage)EPackage.Registry.INSTANCE.getEPackage(Column_transformation_logicPackage.eNS_URI);
		CubesPackage theCubesPackage = (CubesPackage)EPackage.Registry.INSTANCE.getEPackage(CubesPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		Advanced_variable_lineagefunctionsPackage theAdvanced_variable_lineagefunctionsPackage = (Advanced_variable_lineagefunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(Advanced_variable_lineagefunctionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		customRowCreationApproachEClass.getESuperTypes().add(this.getRowCreationApproach());
		filterAndGroupToOneRowCreationApproachEClass.getESuperTypes().add(this.getRowCreationApproach());
		oneToOneRowCreationApproachEClass.getESuperTypes().add(this.getRowCreationApproach());
		filterRowCreationApproachEClass.getESuperTypes().add(this.getRowCreationApproach());
		groupByRowCreationApproachEClass.getESuperTypes().add(this.getRowCreationApproach());
		rowJoinFunctionEClass.getESuperTypes().add(this.getRowCreationApproach());
		unionRowCreationApproachEClass.getESuperTypes().add(this.getRowCreationApproach());

		// Initialize classes, features, and operations; add parameters
		initEClass(baseRowStructureEClass, BaseRowStructure.class, "BaseRowStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseRowStructure_Columns(), theColumn_transformation_logicPackage.getCubeColumn(), null, "columns", null, 0, -1, BaseRowStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseRowStructure_Cube(), theCubesPackage.getBaseCube(), null, "cube", null, 0, 1, BaseRowStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseRowStructure_UsedInSubsets(), ecorePackage.getEBoolean(), "usedInSubsets", null, 0, 1, BaseRowStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customRowCreationApproachEClass, CustomRowCreationApproach.class, "CustomRowCreationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomRowCreationApproach_DependantVariables(), theCorePackage.getVARIABLE(), null, "dependantVariables", null, 0, -1, CustomRowCreationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterAndGroupToOneRowCreationApproachEClass, FilterAndGroupToOneRowCreationApproach.class, "FilterAndGroupToOneRowCreationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterAndGroupToOneRowCreationApproach_FilterFunction(), theFunctionsPackage.getBooleanFunction(), null, "filterFunction", null, 0, 1, FilterAndGroupToOneRowCreationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterAndGroupToOneRowCreationApproach_GroupByVariables(), theCorePackage.getVARIABLE(), null, "groupByVariables", null, 0, -1, FilterAndGroupToOneRowCreationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowCreationApproachForCubeEClass, RowCreationApproachForCube.class, "RowCreationApproachForCube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRowCreationApproachForCube_RowCreationApproach(), this.getRowCreationApproach(), null, "rowCreationApproach", null, 0, 1, RowCreationApproachForCube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRowCreationApproachForCube_Cube(), theCubesPackage.getFreeBirdToolsCube(), null, "cube", null, 0, 1, RowCreationApproachForCube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowCreationApproachForCube_Name(), ecorePackage.getEString(), "name", null, 0, 1, RowCreationApproachForCube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToOneRowCreationApproachEClass, OneToOneRowCreationApproach.class, "OneToOneRowCreationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterRowCreationApproachEClass, FilterRowCreationApproach.class, "FilterRowCreationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterRowCreationApproach_FilterFunction(), theFunctionsPackage.getBooleanFunction(), null, "filterFunction", null, 0, 1, FilterRowCreationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowCreationApproachEClass, RowCreationApproach.class, "RowCreationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRowCreationApproach_DependantCubeColumns(), theColumn_transformation_logicPackage.getResolvedCubeColumnParameter(), null, "dependantCubeColumns", null, 0, -1, RowCreationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRowCreationApproach_CreatedCubeColumns(), theColumn_transformation_logicPackage.getCubeColumn(), null, "createdCubeColumns", null, 0, -1, RowCreationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRowCreationApproach_DependantStructItemColumns(), theAdvanced_variable_lineagefunctionsPackage.getResolvedStructColumnParameter(), null, "dependantStructItemColumns", null, 0, -1, RowCreationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupByRowCreationApproachEClass, GroupByRowCreationApproach.class, "GroupByRowCreationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupByRowCreationApproach_GroupByColumns(), theCorePackage.getVARIABLE(), null, "groupByColumns", null, 0, -1, GroupByRowCreationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupByRowCreationApproach_GroupByCubeColumns(), theColumn_transformation_logicPackage.getCubeColumn(), null, "groupByCubeColumns", null, 0, -1, GroupByRowCreationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowJoinFunctionEClass, RowJoinFunction.class, "RowJoinFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRowJoinFunction_JoinFunction(), theFunctionsPackage.getBooleanFunction(), null, "joinFunction", null, 0, 1, RowJoinFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionRowCreationApproachEClass, UnionRowCreationApproach.class, "UnionRowCreationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// license
		createLicenseAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>license</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLicenseAnnotations()
	{
		String source = "license";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "license", "Copyright (c) 2020 Bird Software Solutions Ltd\n All rights reserved. This file and the accompanying materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v20.html\n\nSPDX-License-Identifier: EPL-2.0 \n\n Contributors:\n Neil Mackenzie - initial API and implementation\r"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations()
	{
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (baseRowStructureEClass,
		   source,
		   new String[]
		   {
			   "name", "BaseRowStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBaseRowStructure_Columns(),
		   source,
		   new String[]
		   {
			   "kind", "element",
			   "name", "columns"
		   });
		addAnnotation
		  (getBaseRowStructure_Cube(),
		   source,
		   new String[]
		   {
			   "kind", "attribute",
			   "name", "cube"
		   });
		addAnnotation
		  (getBaseRowStructure_UsedInSubsets(),
		   source,
		   new String[]
		   {
			   "kind", "attribute",
			   "name", "usedInSubsets"
		   });
		addAnnotation
		  (customRowCreationApproachEClass,
		   source,
		   new String[]
		   {
			   "name", "CustomRowCreationApproach",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomRowCreationApproach_DependantVariables(),
		   source,
		   new String[]
		   {
			   "kind", "attribute",
			   "name", "dependantVariables"
		   });
		addAnnotation
		  (filterAndGroupToOneRowCreationApproachEClass,
		   source,
		   new String[]
		   {
			   "name", "FilterAndGroupToOneRowCreationApproach",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFilterAndGroupToOneRowCreationApproach_FilterFunction(),
		   source,
		   new String[]
		   {
			   "kind", "element",
			   "name", "filterFunction"
		   });
		addAnnotation
		  (getFilterAndGroupToOneRowCreationApproach_GroupByVariables(),
		   source,
		   new String[]
		   {
			   "kind", "attribute",
			   "name", "groupByVariables"
		   });
		addAnnotation
		  (rowCreationApproachForCubeEClass,
		   source,
		   new String[]
		   {
			   "name", "RowCreationApproachForCube",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRowCreationApproachForCube_RowCreationApproach(),
		   source,
		   new String[]
		   {
			   "kind", "element",
			   "name", "rowCreationApproach"
		   });
		addAnnotation
		  (getRowCreationApproachForCube_Cube(),
		   source,
		   new String[]
		   {
			   "kind", "attribute",
			   "name", "cube"
		   });
		addAnnotation
		  (getRowCreationApproachForCube_Name(),
		   source,
		   new String[]
		   {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (oneToOneRowCreationApproachEClass,
		   source,
		   new String[]
		   {
			   "name", "OneToOneRowCreationApproach",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (filterRowCreationApproachEClass,
		   source,
		   new String[]
		   {
			   "name", "FilterRowCreationApproach",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFilterRowCreationApproach_FilterFunction(),
		   source,
		   new String[]
		   {
			   "kind", "element",
			   "name", "filterFunction"
		   });
		addAnnotation
		  (rowCreationApproachEClass,
		   source,
		   new String[]
		   {
			   "name", "RowCreationApproach",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRowCreationApproach_DependantCubeColumns(),
		   source,
		   new String[]
		   {
			   "kind", "element",
			   "name", "dependantCubeColumns"
		   });
		addAnnotation
		  (getRowCreationApproach_CreatedCubeColumns(),
		   source,
		   new String[]
		   {
			   "kind", "element",
			   "name", "createdCubeColumns"
		   });
		addAnnotation
		  (getRowCreationApproach_DependantStructItemColumns(),
		   source,
		   new String[]
		   {
			   "kind", "element",
			   "name", "dependantCubeColumns"
		   });
		addAnnotation
		  (groupByRowCreationApproachEClass,
		   source,
		   new String[]
		   {
			   "name", "GroupByRowCreationApproach",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGroupByRowCreationApproach_GroupByColumns(),
		   source,
		   new String[]
		   {
			   "kind", "attribute",
			   "name", "groupByColumns"
		   });
		addAnnotation
		  (getGroupByRowCreationApproach_GroupByCubeColumns(),
		   source,
		   new String[]
		   {
			   "kind", "attribute",
			   "name", "groupByCubeColumns"
		   });
		addAnnotation
		  (rowJoinFunctionEClass,
		   source,
		   new String[]
		   {
			   "name", "RowJoinFunction",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRowJoinFunction_JoinFunction(),
		   source,
		   new String[]
		   {
			   "kind", "element",
			   "name", "joinFunction"
		   });
		addAnnotation
		  (unionRowCreationApproachEClass,
		   source,
		   new String[]
		   {
			   "name", "UnionRowCreationApproach",
			   "kind", "elementOnly"
		   });
	}

} //Row_transformation_logicPackageImpl
