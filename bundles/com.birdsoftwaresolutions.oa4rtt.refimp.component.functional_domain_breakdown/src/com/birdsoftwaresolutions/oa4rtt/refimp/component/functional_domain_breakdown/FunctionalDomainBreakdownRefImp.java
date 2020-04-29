package com.birdsoftwaresolutions.oa4rtt.refimp.component.functional_domain_breakdown;

import java.util.List;

import org.eclipse.efbt.oa4rtt.component.functional_domain_breakdown.java_interface.FunctionalDomainBreakdown;

import functionality_module.FunctionalityModuleModule;
import output_data_structures.OutputDataStructureModule;
import requirements_text.RequirementsModule;


public class FunctionalDomainBreakdownRefImp implements FunctionalDomainBreakdown {

	@Override
	public List<FunctionalityModuleModule> getModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FunctionalityModuleModule getModuleForVerion(String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  void createTrialVersion(FunctionalityModuleModule oldVersion,
			RequirementsModule dependantRequirementsVersion, OutputDataStructureModule dependantOutputStructuresVersion,
			String version) {

			//go up from the call, get the set of modules, get the one with the correct oldversion
			// create a new FunctionalityModuleModule with new version by copying the old version
		   // check which are invalid in the newly created version becuase they refer to things no longer existing 
		  // in the suplied version of requirments
		// consider if we need to actaully change to  items in the new requiremnts module, or if it makes sense to keep with old items
		//since perhaps they are the same items (with same ids)
		
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
