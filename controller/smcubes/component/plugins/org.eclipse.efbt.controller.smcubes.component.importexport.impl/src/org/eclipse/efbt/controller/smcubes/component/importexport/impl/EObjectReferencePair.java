package org.eclipse.efbt.controller.smcubes.component.importexport.impl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EReferenceImpl;

public class EObjectReferencePair {
	
	public EObject object;
	public EReferenceImpl reference;
	
	public EObjectReferencePair(EObject object,EReferenceImpl reference)
	{
		this.object = object;
		this.reference = reference;
	}
	
	public boolean equals(Object o)
	{
		EObject theObject  = ((EObjectReferencePair) o).object;
		EReferenceImpl theReference =  ((EObjectReferencePair) o).reference;
		return (object.equals(theObject) && reference.equals(theReference));
	}
	
	public int hashCode()
	{
		return object.hashCode() + reference.hashCode();
	}
	
	
	

	
	

}
