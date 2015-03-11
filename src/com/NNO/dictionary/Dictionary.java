package com.NNO.dictionary;

import java.util.ArrayList;

public class Dictionary {
	char dictionaryId;
	ArrayList<Verb> verbs;
	ArrayList<Noun> nouns;
	ArrayList<Adjective> adjectives;
	ArrayList<Replacement> replacements;
	
	public Dictionary(char dictionaryId){
		this.dictionaryId = dictionaryId;
		verbs = new ArrayList<Verb>();
		nouns = new ArrayList<Noun>();
		adjectives = new ArrayList<Adjective>();
		replacements = new ArrayList<Replacement>();
	}
	
	public void addVerb(Verb v){
		this.verbs.add(v);
	}
	
	public void addNoun(Noun n){
		this.nouns.add(n);
	}
	
	public void addAdjective(Adjective a){
		this.adjectives.add(a);
	}
	
	public void addReplacement(Replacement r){
		this.replacements.add(r);
	}
	
	public String search(String word){
		searchForVerb(word);
		searchForNoun(word);
		searchForAdjective(word);
		searchForReplacement(word);
	}
	
	public Verb searchForVerb(String verb){
		for(Verb v : verbs){
			if(v.verb.equals(verb)){
				return v;
			}
		}
		return null;
	}
	
	public Noun searchForNoun(String noun){
		for(Noun n : nouns){
			if(n.noun.equals(noun)){
				return n;
			}
		}
		return null;
	}
	
	public Adjective searchForAdjective(String adjective){
		for(Adjective a : adjectives){
			if(a.adjective.equals(adjective)){
				return a;
			}
		}
		return null;
	}
	
	public Replacement searchForReplacement(String original){
		for(Replacement r : replacements){
			if(r.original.equals(original)){
				return r;
			}
		}
		return null;
	}
}
