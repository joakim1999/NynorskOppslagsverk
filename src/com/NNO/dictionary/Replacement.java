package com.NNO.dictionary;

public class Replacement {
	String original;
	String replacement;
	
	public Replacement(String r){
		original = r.split(" ")[0];
		replacement = r.split(" ")[1];
	}
}
