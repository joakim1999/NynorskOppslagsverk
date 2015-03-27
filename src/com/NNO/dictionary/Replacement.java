package com.NNO.dictionary;

public class Replacement {
	String original;
	StringBuilder replacement;
	
	public Replacement(String r){
		replacement = new StringBuilder();
		original = r.split(" ")[1];
		original = original.replaceAll("_", " ");
		replacement.append(original + ",");
		replacement.append(r.substring(15 + original.length()));
		final String replacementString = replacement.toString();
		replacement = new StringBuilder();
		replacement.append(replacementString.replaceAll("_", " ").replaceAll(",", ", "));
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + original + " -> " + replacement;
	}
}
