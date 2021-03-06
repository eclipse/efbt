/**
 */
package org.eclipse.efbt.cocalimo.smcubes.model.reports.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.efbt.cocalimo.smcubes.model.reports.util.ReportsAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportsItemProviderAdapterFactory extends ReportsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.AxisModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisModuleItemProvider axisModuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.AxisModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAxisModuleAdapter() {
		if (axisModuleItemProvider == null) {
			axisModuleItemProvider = new AxisModuleItemProvider(this);
		}

		return axisModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.AxisOrdinateModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisOrdinateModuleItemProvider axisOrdinateModuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.AxisOrdinateModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAxisOrdinateModuleAdapter() {
		if (axisOrdinateModuleItemProvider == null) {
			axisOrdinateModuleItemProvider = new AxisOrdinateModuleItemProvider(this);
		}

		return axisOrdinateModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.CellPositionModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellPositionModuleItemProvider cellPositionModuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.CellPositionModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCellPositionModuleAdapter() {
		if (cellPositionModuleItemProvider == null) {
			cellPositionModuleItemProvider = new CellPositionModuleItemProvider(this);
		}

		return cellPositionModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.OrdinateItemModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdinateItemModuleItemProvider ordinateItemModuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.OrdinateItemModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrdinateItemModuleAdapter() {
		if (ordinateItemModuleItemProvider == null) {
			ordinateItemModuleItemProvider = new OrdinateItemModuleItemProvider(this);
		}

		return ordinateItemModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.PopulatedReport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulatedReportItemProvider populatedReportItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.PopulatedReport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPopulatedReportAdapter() {
		if (populatedReportItemProvider == null) {
			populatedReportItemProvider = new PopulatedReportItemProvider(this);
		}

		return populatedReportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.ReportCell} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportCellItemProvider reportCellItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.ReportCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReportCellAdapter() {
		if (reportCellItemProvider == null) {
			reportCellItemProvider = new ReportCellItemProvider(this);
		}

		return reportCellItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.ReportCellValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportCellValueItemProvider reportCellValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.ReportCellValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReportCellValueAdapter() {
		if (reportCellValueItemProvider == null) {
			reportCellValueItemProvider = new ReportCellValueItemProvider(this);
		}

		return reportCellValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.ReportTableModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportTableModuleItemProvider reportTableModuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.ReportTableModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReportTableModuleAdapter() {
		if (reportTableModuleItemProvider == null) {
			reportTableModuleItemProvider = new ReportTableModuleItemProvider(this);
		}

		return reportTableModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.TableCellModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCellModuleItemProvider tableCellModuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.efbt.cocalimo.smcubes.model.reports.TableCellModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableCellModuleAdapter() {
		if (tableCellModuleItemProvider == null) {
			tableCellModuleItemProvider = new TableCellModuleItemProvider(this);
		}

		return tableCellModuleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (axisModuleItemProvider != null) axisModuleItemProvider.dispose();
		if (axisOrdinateModuleItemProvider != null) axisOrdinateModuleItemProvider.dispose();
		if (cellPositionModuleItemProvider != null) cellPositionModuleItemProvider.dispose();
		if (ordinateItemModuleItemProvider != null) ordinateItemModuleItemProvider.dispose();
		if (populatedReportItemProvider != null) populatedReportItemProvider.dispose();
		if (reportCellItemProvider != null) reportCellItemProvider.dispose();
		if (reportCellValueItemProvider != null) reportCellValueItemProvider.dispose();
		if (reportTableModuleItemProvider != null) reportTableModuleItemProvider.dispose();
		if (tableCellModuleItemProvider != null) tableCellModuleItemProvider.dispose();
	}

}
