package com.NNO.dictionary;

public class Verb {
	String verb;
	String conjugate;
	
	public Verb(String v){
		verb = v.split(" ")[0];
		conjugate = v.split(" ")[1];
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + verb + "\n"
			  + conjugate + "\n";
	}
}
