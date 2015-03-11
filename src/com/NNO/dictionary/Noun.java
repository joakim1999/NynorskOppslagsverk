package com.NNO.dictionary;

public class Noun{
	String noun;
	String conjugate;
	
	public Noun(String n){
		noun = n.split(" ")[0];
		conjugate = n.split(" ")[1];
	}
}
