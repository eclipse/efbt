/*******************************************************************************
 * Copyright (c) 2020 Bird Software Solutions Ltd
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Neil Mackenzie - initial API and implementation
 *******************************************************************************/
package org.eclipse.efbt.controller.trl.vtl_generator.platformcalls;

import java.io.File;

import org.eclipse.efbt.controller.core.model.platform_call.PlatformCall;
import org.eclipse.efbt.controller.core.model.platform_call.TranslateTRLToVTL;
import org.eclipse.efbt.controller.trl.vtl_generator.engine.GeneratorConfig;
import org.eclipse.efbt.controller.trl.vtl_generator.engine.GeneratorStandaloneSetup;
import org.eclipse.efbt.language.trl.model.transformation.Release;
import org.eclipse.emf.mwe.utils.DirectoryCleaner;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.xtext.generator.GeneratorComponent;
import org.eclipse.xtext.generator.GeneratorComponent.Outlet;
import org.eclipse.xtext.mwe.Reader;
import org.eclipse.xtext.mwe.ResourceLoadingSlotEntry;



/**
 * @author Neil Mackenzie
 *
 */
public class PlatformCalls {

  public static void executeCall(PlatformCall call) {

   
    
    if (call instanceof TranslateTRLToVTL) {

        Release release = ((TranslateTRLToVTL) call).getRelease();
        String outputPath = ((TranslateTRLToVTL) call).getOutputDirectory();
        deleteAllFilesFromOutputPath(outputPath);
        GeneratorStandaloneSetup setup = new GeneratorStandaloneSetup();
        GeneratorConfig config = new org.eclipse.efbt.controller.trl.vtl_generator.engine.GeneratorConfig();

       // config.setJavaGenPath(inputPath);
        setup.setConfig(config);

        setup.setDoInit(true);

        Reader reader = new Reader();

    //    reader.addPath(inputPath);
        reader.addRegister(setup);
        ResourceLoadingSlotEntry rlse = new ResourceLoadingSlotEntry();
        rlse.setSlot("model");
        reader.addLoadResource(rlse);

        GeneratorComponent gen = new GeneratorComponent();
        gen.setRegister(setup);
        gen.addSlot("model");
        Outlet out = new Outlet();

        out.setPath(outputPath);
        gen.addOutlet(out);

        IWorkflowContext ctx = new WorkflowContextImpl();
        DirectoryCleaner dc = new DirectoryCleaner();
        reader.invoke(ctx);
        dc.invoke(ctx);
        gen.invoke(ctx);
        
        

      }

    }

  private static void deleteAllFilesFromOutputPath(String outputPath) {
  	
  	File dir = new File(outputPath);
  	String[] files = dir.list(); 
  	for (int i = 0; i < files.length; i++) {
  		
  			File f= new File(outputPath + "\\" + files[i]);
  			f.delete();
  	
  	}
  	
  	
  }




}
