/**
 */
package org.eclipse.efbt.language.dtm.model.dtm_views.impl;

import org.eclipse.efbt.language.dtm.model.dtm_views.*;

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
public class dtm_viewsFactoryImpl extends EFactoryImpl implements dtm_viewsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static dtm_viewsFactory init() {
		try {
			dtm_viewsFactory thedtm_viewsFactory = (dtm_viewsFactory)EPackage.Registry.INSTANCE.getEFactory(dtm_viewsPackage.eNS_URI);
			if (thedtm_viewsFactory != null) {
				return thedtm_viewsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new dtm_viewsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dtm_viewsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case dtm_viewsPackage.AGGREGATE_ENRICHMENT_VIEW: return createAggregateEnrichmentView();
			case dtm_viewsPackage.COPY_VIEW: return createCopyView();
			case dtm_viewsPackage.ENRICHMENT_VIEW: return createEnrichmentView();
			case dtm_viewsPackage.FILTER_BY_CONDITION_VIEW: return createFilterByConditionView();
			case dtm_viewsPackage.GENERIC_VIEW: return createGenericView();
			case dtm_viewsPackage.GROUP_BY_CLAUSE: return createGroupByClause();
			case dtm_viewsPackage.IGNORE_COLUMN: return createIgnoreColumn();
			case dtm_viewsPackage.JOIN_VIEW: return createJoinView();
			case dtm_viewsPackage.RENAME_AS: return createRenameAs();
			case dtm_viewsPackage.SELECT_CLAUSE: return createSelectClause();
			case dtm_viewsPackage.DTM_VIEW: return createDTMView();
			case dtm_viewsPackage.UNION_VIEW: return createUnionView();
			case dtm_viewsPackage.VERSIONED_DTM_VIEWS_MODULE: return createVersionedDTMViewsModule();
			case dtm_viewsPackage.WHERE_CLAUSE: return createWhereClause();
			case dtm_viewsPackage.BASE_VIEW_INCORPORATING_DELTAS: return createBaseViewIncorporatingDeltas();
			case dtm_viewsPackage.DELTA_ACCUMULATION: return createDeltaAccumulation();
			case dtm_viewsPackage.CAST_COLUMN_VIEW: return createCastColumnView();
			case dtm_viewsPackage.EXPLODE_ARRAY_OF_STRUCTS_VIEW: return createExplodeArrayOfStructsView();
			case dtm_viewsPackage.EXPLODE_STRUCT_VIEW: return createExplodeStructView();
			case dtm_viewsPackage.FILTER_BY_STRUCT_CLASS_COLUMN_VIEW: return createFilterByStructClassColumnView();
			case dtm_viewsPackage.MAKE_ARRAY_OF_STRUCTS_VIEW: return createMakeArrayOfStructsView();
			case dtm_viewsPackage.MAKE_STRUCT_VIEW: return createMakeStructView();
			case dtm_viewsPackage.AGGREGATE_ENRICHMENT_VIEW_AND_ORDER_BY: return createAggregateEnrichmentViewAndOrderBy();
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
	public AggregateEnrichmentView createAggregateEnrichmentView() {
		AggregateEnrichmentViewImpl aggregateEnrichmentView = new AggregateEnrichmentViewImpl();
		return aggregateEnrichmentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyView createCopyView() {
		CopyViewImpl copyView = new CopyViewImpl();
		return copyView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnrichmentView createEnrichmentView() {
		EnrichmentViewImpl enrichmentView = new EnrichmentViewImpl();
		return enrichmentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterByConditionView createFilterByConditionView() {
		FilterByConditionViewImpl filterByConditionView = new FilterByConditionViewImpl();
		return filterByConditionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericView createGenericView() {
		GenericViewImpl genericView = new GenericViewImpl();
		return genericView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupByClause createGroupByClause() {
		GroupByClauseImpl groupByClause = new GroupByClauseImpl();
		return groupByClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IgnoreColumn createIgnoreColumn() {
		IgnoreColumnImpl ignoreColumn = new IgnoreColumnImpl();
		return ignoreColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoinView createJoinView() {
		JoinViewImpl joinView = new JoinViewImpl();
		return joinView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenameAs createRenameAs() {
		RenameAsImpl renameAs = new RenameAsImpl();
		return renameAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectClause createSelectClause() {
		SelectClauseImpl selectClause = new SelectClauseImpl();
		return selectClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTMView createDTMView() {
		DTMViewImpl dtmView = new DTMViewImpl();
		return dtmView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnionView createUnionView() {
		UnionViewImpl unionView = new UnionViewImpl();
		return unionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionedDTMViewsModule createVersionedDTMViewsModule() {
		VersionedDTMViewsModuleImpl versionedDTMViewsModule = new VersionedDTMViewsModuleImpl();
		return versionedDTMViewsModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhereClause createWhereClause() {
		WhereClauseImpl whereClause = new WhereClauseImpl();
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseViewIncorporatingDeltas createBaseViewIncorporatingDeltas() {
		BaseViewIncorporatingDeltasImpl baseViewIncorporatingDeltas = new BaseViewIncorporatingDeltasImpl();
		return baseViewIncorporatingDeltas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaAccumulation createDeltaAccumulation() {
		DeltaAccumulationImpl deltaAccumulation = new DeltaAccumulationImpl();
		return deltaAccumulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CastColumnView createCastColumnView() {
		CastColumnViewImpl castColumnView = new CastColumnViewImpl();
		return castColumnView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplodeArrayOfStructsView createExplodeArrayOfStructsView() {
		ExplodeArrayOfStructsViewImpl explodeArrayOfStructsView = new ExplodeArrayOfStructsViewImpl();
		return explodeArrayOfStructsView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplodeStructView createExplodeStructView() {
		ExplodeStructViewImpl explodeStructView = new ExplodeStructViewImpl();
		return explodeStructView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterByStructClassColumnView createFilterByStructClassColumnView() {
		FilterByStructClassColumnViewImpl filterByStructClassColumnView = new FilterByStructClassColumnViewImpl();
		return filterByStructClassColumnView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MakeArrayOfStructsView createMakeArrayOfStructsView() {
		MakeArrayOfStructsViewImpl makeArrayOfStructsView = new MakeArrayOfStructsViewImpl();
		return makeArrayOfStructsView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MakeStructView createMakeStructView() {
		MakeStructViewImpl makeStructView = new MakeStructViewImpl();
		return makeStructView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregateEnrichmentViewAndOrderBy createAggregateEnrichmentViewAndOrderBy() {
		AggregateEnrichmentViewAndOrderByImpl aggregateEnrichmentViewAndOrderBy = new AggregateEnrichmentViewAndOrderByImpl();
		return aggregateEnrichmentViewAndOrderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dtm_viewsPackage getdtm_viewsPackage() {
		return (dtm_viewsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static dtm_viewsPackage getPackage() {
		return dtm_viewsPackage.eINSTANCE;
	}

} //dtm_viewsFactoryImpl