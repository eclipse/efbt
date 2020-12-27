/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl;

import org.eclipse.efbt.cocamo.core.model.module_management.Module_managementPackage;

import org.eclipse.efbt.cocamo.functions.model.functions.FunctionsPackage;

import org.eclipse.efbt.cocamo.smcubes.model.core.CorePackage;

import org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.Advanced_row_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.advanced_row_transformation_logic.impl.Advanced_row_transformation_logicPackageImpl;

import org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.Attribute_lineagePackage;

import org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.impl.Attribute_lineagePackageImpl;

import org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.Cube_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.impl.Cube_transformation_logicPackageImpl;

import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.BaseViewIncorporatingDeltasRowFunction;
import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.DeltaAccumulationRowFunction;
import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicFactory;
import org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage;

import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.impl.Row_transformation_logicPackageImpl;

import org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.Advanced_variable_lineagefunctionsPackage;

import org.eclipse.efbt.lineage.common.model.column_transformation_logic.Column_transformation_logicPackage;

import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.CubesPackage;

import org.eclipse.efbt.lineage.common.model.lineagecubes.efbt_advanced_data_definition.Efbt_advanced_data_definitionPackage;

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
public class Incremental_row_transformation_logicPackageImpl extends EPackageImpl implements Incremental_row_transformation_logicPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseViewIncorporatingDeltasRowFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deltaAccumulationRowFunctionEClass = null;

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
	 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Incremental_row_transformation_logicPackageImpl()
	{
		super(eNS_URI, Incremental_row_transformation_logicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Incremental_row_transformation_logicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Incremental_row_transformation_logicPackage init()
	{
		if (isInited) return (Incremental_row_transformation_logicPackage)EPackage.Registry.INSTANCE.getEPackage(Incremental_row_transformation_logicPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIncremental_row_transformation_logicPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Incremental_row_transformation_logicPackageImpl theIncremental_row_transformation_logicPackage = registeredIncremental_row_transformation_logicPackage instanceof Incremental_row_transformation_logicPackageImpl ? (Incremental_row_transformation_logicPackageImpl)registeredIncremental_row_transformation_logicPackage : new Incremental_row_transformation_logicPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Row_transformation_logicPackage.eNS_URI);
		Row_transformation_logicPackageImpl theRow_transformation_logicPackage = (Row_transformation_logicPackageImpl)(registeredPackage instanceof Row_transformation_logicPackageImpl ? registeredPackage : Row_transformation_logicPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Advanced_row_transformation_logicPackage.eNS_URI);
		Advanced_row_transformation_logicPackageImpl theAdvanced_row_transformation_logicPackage = (Advanced_row_transformation_logicPackageImpl)(registeredPackage instanceof Advanced_row_transformation_logicPackageImpl ? registeredPackage : Advanced_row_transformation_logicPackage.eINSTANCE);

		// Create package meta-data objects
		theIncremental_row_transformation_logicPackage.createPackageContents();
		theAttribute_lineagePackage.createPackageContents();
		theCube_transformation_logicPackage.createPackageContents();
		theRow_transformation_logicPackage.createPackageContents();
		theAdvanced_row_transformation_logicPackage.createPackageContents();

		// Initialize created meta-data
		theIncremental_row_transformation_logicPackage.initializePackageContents();
		theAttribute_lineagePackage.initializePackageContents();
		theCube_transformation_logicPackage.initializePackageContents();
		theRow_transformation_logicPackage.initializePackageContents();
		theAdvanced_row_transformation_logicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIncremental_row_transformation_logicPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Incremental_row_transformation_logicPackage.eNS_URI, theIncremental_row_transformation_logicPackage);
		return theIncremental_row_transformation_logicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseViewIncorporatingDeltasRowFunction()
	{
		return baseViewIncorporatingDeltasRowFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseViewIncorporatingDeltasRowFunction_UltimateCubeSource()
	{
		return (EReference)baseViewIncorporatingDeltasRowFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeltaAccumulationRowFunction()
	{
		return deltaAccumulationRowFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeltaAccumulationRowFunction_UltimateCubeSource()
	{
		return (EReference)deltaAccumulationRowFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Incremental_row_transformation_logicFactory getIncremental_row_transformation_logicFactory()
	{
		return (Incremental_row_transformation_logicFactory)getEFactoryInstance();
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
		baseViewIncorporatingDeltasRowFunctionEClass = createEClass(BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION);
		createEReference(baseViewIncorporatingDeltasRowFunctionEClass, BASE_VIEW_INCORPORATING_DELTAS_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE);

		deltaAccumulationRowFunctionEClass = createEClass(DELTA_ACCUMULATION_ROW_FUNCTION);
		createEReference(deltaAccumulationRowFunctionEClass, DELTA_ACCUMULATION_ROW_FUNCTION__ULTIMATE_CUBE_SOURCE);
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
		Row_transformation_logicPackage theRow_transformation_logicPackage = (Row_transformation_logicPackage)EPackage.Registry.INSTANCE.getEPackage(Row_transformation_logicPackage.eNS_URI);
		CubesPackage theCubesPackage = (CubesPackage)EPackage.Registry.INSTANCE.getEPackage(CubesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		baseViewIncorporatingDeltasRowFunctionEClass.getESuperTypes().add(theRow_transformation_logicPackage.getRowCreationApproach());
		deltaAccumulationRowFunctionEClass.getESuperTypes().add(theRow_transformation_logicPackage.getRowCreationApproach());

		// Initialize classes, features, and operations; add parameters
		initEClass(baseViewIncorporatingDeltasRowFunctionEClass, BaseViewIncorporatingDeltasRowFunction.class, "BaseViewIncorporatingDeltasRowFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseViewIncorporatingDeltasRowFunction_UltimateCubeSource(), theCubesPackage.getBaseCube(), null, "ultimateCubeSource", null, 0, 1, BaseViewIncorporatingDeltasRowFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deltaAccumulationRowFunctionEClass, DeltaAccumulationRowFunction.class, "DeltaAccumulationRowFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeltaAccumulationRowFunction_UltimateCubeSource(), theCubesPackage.getFreeBirdToolsCube(), null, "ultimateCubeSource", null, 0, 1, DeltaAccumulationRowFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// license
		createLicenseAnnotations();
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

} //Incremental_row_transformation_logicPackageImpl
