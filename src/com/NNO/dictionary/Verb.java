package com.NNO.dictionary;

public class Verb {
	String verb;
	String conjugate;
	
	public Verb(String v){
		verb = v.split(" ")[1];
		verb = verb.replaceAll("_", " ");
		conjugate = verb + ", " + v.split(" ")[2];
		conjugate = conjugate.replaceAll("_", " ");
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + verb + "\n"
			  + conjugate;
	}
}
