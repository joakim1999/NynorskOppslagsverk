package com.NNO.dictionary;

public class Noun{
	String noun;
	String conjugate;
	
	public Noun(String n){
		noun = n.split(" ")[1];
		noun = noun.replaceAll("_", " ");
		conjugate = n.split(" ")[2];
		conjugate = conjugate.replaceAll("_", " ");
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + noun + "\n"
			  + conjugate;
	}
}
