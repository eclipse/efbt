/**
 */
package componenents.util;

import componenents.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see componenents.ComponenentsPackage
 * @generated
 */
public class ComponenentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponenentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponenentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponenentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponenentsSwitch<Adapter> modelSwitch =
		new ComponenentsSwitch<Adapter>() {
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseRegulatoryTextComponent(RegulatoryTextComponent object) {
				return createRegulatoryTextComponentAdapter();
			}
			@Override
			public Adapter caseFunctionalDomainBreakdownComponent(FunctionalDomainBreakdownComponent object) {
				return createFunctionalDomainBreakdownComponentAdapter();
			}
			@Override
			public Adapter caseFunctionalDomainBreakdownComponentCall(FunctionalDomainBreakdownComponentCall object) {
				return createFunctionalDomainBreakdownComponentCallAdapter();
			}
			@Override
			public Adapter caseFunctionalDomainBreakdownComponentCall_CreateTrialVersion(FunctionalDomainBreakdownComponentCall_CreateTrialVersion object) {
				return createFunctionalDomainBreakdownComponentCall_CreateTrialVersionAdapter();
			}
			@Override
			public Adapter caseFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal(FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal object) {
				return createFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinalAdapter();
			}
			@Override
			public Adapter caseFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule(FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule object) {
				return createFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleAdapter();
			}
			@Override
			public Adapter caseComponentCall(ComponentCall object) {
				return createComponentCallAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link componenents.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componenents.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componenents.RegulatoryTextComponent <em>Regulatory Text Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componenents.RegulatoryTextComponent
	 * @generated
	 */
	public Adapter createRegulatoryTextComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componenents.FunctionalDomainBreakdownComponent <em>Functional Domain Breakdown Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componenents.FunctionalDomainBreakdownComponent
	 * @generated
	 */
	public Adapter createFunctionalDomainBreakdownComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componenents.FunctionalDomainBreakdownComponentCall <em>Functional Domain Breakdown Component Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componenents.FunctionalDomainBreakdownComponentCall
	 * @generated
	 */
	public Adapter createFunctionalDomainBreakdownComponentCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion <em>Functional Domain Breakdown Component Call Create Trial Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_CreateTrialVersion
	 * @generated
	 */
	public Adapter createFunctionalDomainBreakdownComponentCall_CreateTrialVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componenents.FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal <em>Functional Domain Breakdown Component Call Set Trial Module As Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinal
	 * @generated
	 */
	public Adapter createFunctionalDomainBreakdownComponentCall_SetTrialModuleAsFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componenents.FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule <em>Functional Domain Breakdown Component Call Remove Invalid Items From Trial Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componenents.FunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModule
	 * @generated
	 */
	public Adapter createFunctionalDomainBreakdownComponentCall_RemoveInvalidItemsFromTrialModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componenents.ComponentCall <em>Component Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componenents.ComponentCall
	 * @generated
	 */
	public Adapter createComponentCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComponenentsAdapterFactory
