package com.birdsoftwaresolutions.oa4rtt.refimp.component.report_based_functional_domain_breakdown;

import java.util.List;

import org.eclipse.efbt.oa4rtt.component.report_based_functional_domain_breakdown.java_interface.ReportBasedFunctionalDomainBreakdown;

import functionality_module.FunctionalityModuleModule;
import report_based_report_based_functional_domain_breakdown.ReportBasedFunctionalityModuleModule;
import report_structures.RegReportModule;
import requirements_text.RequirementsModule;



public class ReportBasedFunctionalDomainBreakdownRefImp implements ReportBasedFunctionalDomainBreakdown{

	@Override
	public List<ReportBasedFunctionalityModuleModule> getModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportBasedFunctionalityModuleModule getModuleForVerion(String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createTrialVersion(ReportBasedFunctionalityModuleModule oldVersion,
			RequirementsModule dependantRequirementsVersion,
			RegReportModule dependantOutputStructuresVersion, String version) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTrialModuleAsFinal(String version) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeInvalidItemsFromTrialModule(String version) {
		// TODO Auto-generated method stub
		
	}

	

}
