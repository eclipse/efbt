/**
 */
package org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.Incremental_row_transformation_logicPackage
 * @generated
 */
public interface Incremental_row_transformation_logicFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Incremental_row_transformation_logicFactory eINSTANCE = org.eclipse.efbt.lineage.attributelineage.model.incremental_row_transformation_logic.impl.Incremental_row_transformation_logicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Base View Incorporating Deltas Row Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base View Incorporating Deltas Row Function</em>'.
	 * @generated
	 */
	BaseViewIncorporatingDeltasRowFunction createBaseViewIncorporatingDeltasRowFunction();

	/**
	 * Returns a new object of class '<em>Delta Accumulation Row Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delta Accumulation Row Function</em>'.
	 * @generated
	 */
	DeltaAccumulationRowFunction createDeltaAccumulationRowFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Incremental_row_transformation_logicPackage getIncremental_row_transformation_logicPackage();

} //Incremental_row_transformation_logicFactory
