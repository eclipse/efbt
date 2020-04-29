package com.birdsoftwaresolutions.oa4rtt.refimp.component.execution_environments;


import execution_environments.TestExecutionEnvironmentModule;
import input_data_structures.InputDatastructureModule;
import java.util.List;


import org.eclipse.efbt.oa4rtt.component.execution_environments.java_interface.ExecutionEnvironment;




public class ExecutionEnvironmentRefImp implements ExecutionEnvironment{

/**	@Override
	public void createNewExecutionEnvironmentModule(InputDatastructureModule idsModule, OutputDataStructureModule odsModule,
			ExecutableLogicModule elModule, String version) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public TestExecutionEnvironmentModule getTestExecutionEnvironment(String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TestExecutionEnvironmentModule> getTestExecutionEnvironmentModules() {
		// TODO Auto-generated method stub
		return null;
	}

}
