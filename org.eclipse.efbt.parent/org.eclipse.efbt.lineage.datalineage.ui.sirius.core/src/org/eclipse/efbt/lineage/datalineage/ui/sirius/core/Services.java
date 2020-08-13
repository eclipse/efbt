package org.eclipse.efbt.lineage.datalineage.ui.sirius.core;


import org.eclipse.efbt.common.model.functions.AggregateFunction;
import org.eclipse.efbt.common.model.functions.BasicFunction;
import org.eclipse.efbt.common.model.functions.Function;
import org.eclipse.efbt.lineage.common.modelquery.lineagefunctions.LineageFunctionsModelQuery;


/**
 * The services class used by VSM.
 */
public class Services {

	   public String getStringForFunction(Function self) {
	       
	    	
	    	return LineageFunctionsModelQuery.getStringForFunction( (BasicFunction) self); 
	     }
	    
	public String getStringForAggregateFunction(AggregateFunction self) {
	       
	    	
	    	return LineageFunctionsModelQuery.getStringForAggregateFunction(self); 
	     }
	
	/**   public String getBaseRowID(BaseRowData self) {

	       	
	    	return someModelQuery.getBaseRowID( self); 
	   }*/

}
