package com.birdsoftwaresolutions.oa4rtt.controller;


import com.birdsoftwaresolutions.oa4rtt.refimp.component.report_based_functional_domain_breakdown.ReportBasedFunctionalDomainBreakdownRefImp;
import components.ComponentCall;
import components.ReportBasedFunctionalDomainBreakdownComponentCall;
import components.ReportBasedFunctionalDomainBreakdownComponentCall_CreateTrialVersion;


public class Controller {
	
	public static void  makeCall(ComponentCall call) 
	{
		if(call instanceof ReportBasedFunctionalDomainBreakdownComponentCall)
		{
			makeFunctionalDomainBreakdownCall((ReportBasedFunctionalDomainBreakdownComponentCall )call);
		}
	}
	
	public static void  makeFunctionalDomainBreakdownCall(ReportBasedFunctionalDomainBreakdownComponentCall call) 
	{
		if(call instanceof ReportBasedFunctionalDomainBreakdownComponentCall_CreateTrialVersion)
		{
			ReportBasedFunctionalDomainBreakdownComponentCall_CreateTrialVersion castCall = (ReportBasedFunctionalDomainBreakdownComponentCall_CreateTrialVersion)call;
			ReportBasedFunctionalDomainBreakdownRefImp comp = new ReportBasedFunctionalDomainBreakdownRefImp();
		
			comp.createTrialVersion(castCall.getOldVersion(),
					castCall.getDependantRequirementsVersion(),
					castCall.getOutputDataStructureModule(),
					castCall.getVersion());
		}
	}

}
