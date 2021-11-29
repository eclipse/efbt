package org.eclipse.efbt.controller.smcubes.component.importexport.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

public class EClassStringPair {

	public EClassifier eClass;
	public String str;
	
	public EClassStringPair(EClassifier eClass,String str )
	{
		this.eClass = eClass;
		this.str = str;
	}
	
	public boolean equals(Object o)
	{
		EClassifier theClass  = ((EClassStringPair) o).eClass;
		String theString =  ((EClassStringPair) o).str;
		return (eClass.equals(theClass) && str.equals(theString));
	}
	
	public int hashCode()
	{
		return eClass.hashCode() + str.hashCode();
	}
}
