package com.NNO.dictionary;

public class Noun{
	String article;
	String noun;
	StringBuilder conjugate;
	
	public Noun(String n){
		conjugate = new StringBuilder();
		article = n.split(" ")[1];
		noun = n.split(" ")[2];
		noun = noun.replaceAll("_", " ");
		conjugate.append(article + " " + noun + ",");
		conjugate.append(n.substring(8 + article.length() + 1 + noun.length()));
		final String conjugateString = conjugate.toString();
		conjugate = new StringBuilder();
		conjugate.append(conjugateString.replaceAll("_", " ").replaceAll(",", ", "));
	}
	
	public String toString(){
		return this.getClass().getSimpleName().toUpperCase() + "\n"
			  + article + " " + noun + "\n"
			  + conjugate;
	}
}
