package com.NNO.dictionary;

public class Replacement {
	String original;
	String replacement;
	
	public Replacement(String r){
		original = r.split(" ")[1];
		original = original.replaceAll("_", " ");
		replacement = r.split(" ")[2];
		replacement = replacement.replaceAll("_", " ");
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + original + " -> " + replacement;
	}
}
