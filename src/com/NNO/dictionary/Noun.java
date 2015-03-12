package com.NNO.dictionary;

public class Noun{
	String article;
	String noun;
	String conjugate;
	
	public Noun(String n){
		article = n.split(" ")[1];
		noun = n.split(" ")[2];
		noun = noun.replaceAll("_", " ");
		conjugate = article + " " + noun + ", " + n.split(" ")[3];
		conjugate = conjugate.replaceAll("_", " ");
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + article + " " + noun + "\n"
			  + conjugate;
	}
}
