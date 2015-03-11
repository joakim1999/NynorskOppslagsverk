package com.NNO.dictionary;

public class Adjective {
	String adjective;
	String conjugate;
	
	public Adjective(String a){
		adjective = a.split(" ")[0];
		conjugate = a.split(" ")[1];
	}
}
