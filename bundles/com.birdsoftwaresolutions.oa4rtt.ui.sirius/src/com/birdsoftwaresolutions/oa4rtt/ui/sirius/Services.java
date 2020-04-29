package com.birdsoftwaresolutions.oa4rtt.ui.sirius;

import org.eclipse.emf.ecore.EObject;

import com.birdsoftwaresolutions.oa4rtt.controller.Controller;

import components.ComponentCall; 

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
 public void executeComponentCall(ComponentCall self) {

    	Controller.makeCall(self);
    }
}
