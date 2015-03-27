package com.NNO.dictionary;

public class Adjective {
	String adjective;
	StringBuilder conjugate;
	
	public Adjective(String a){
		conjugate = new StringBuilder();
		adjective = a.split(" ")[1];
		adjective = adjective.replaceAll("_", " ");
		conjugate.append(adjective + ",");
		conjugate.append(a.substring(13 + adjective.length()));
		final String conjugateString = conjugate.toString();
		conjugate = new StringBuilder();
		conjugate.append(conjugateString.replaceAll("_", " ").replaceAll(",", ", "));
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + adjective + "\n"
			  + conjugate;
	}
}
