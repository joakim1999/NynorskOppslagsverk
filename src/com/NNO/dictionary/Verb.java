package com.NNO.dictionary;

public class Verb {
	String verb;
	StringBuilder conjugate;
	
	public Verb(String v){
		conjugate = new StringBuilder();
		verb = v.split(" ")[1];
		verb = verb.replaceAll("_", " ");
		conjugate.append("å " + verb + ",");
		conjugate.append(v.substring(8 + verb.length()));
		final String conjugateString = conjugate.toString();
		conjugate = new StringBuilder();
		conjugate.append(conjugateString.replaceAll("_", " ").replaceAll(",", ", "));
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + verb + "\n"
			  + conjugate;
	}
}
