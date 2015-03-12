package com.NNO.dictionary;

public class Adjective {
	String adjective;
	String conjugate;
	
	public Adjective(String a){
		adjective = a.split(" ")[1];
		adjective = adjective.replaceAll("_", " ");
		conjugate = a.split(" ")[2];
		conjugate = conjugate.replaceAll("_", " ");
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + adjective + "\n"
			  + conjugate;
	}
}
