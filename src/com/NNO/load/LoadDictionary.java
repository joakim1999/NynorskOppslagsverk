package com.NNO.load;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.NNO.dictionary.*;

public class LoadDictionary {
	public LoadDictionary(){
		
	}
	
	public Dictionary loadDicitionary(char dictionaryId) throws IOException{
		Dictionary dictionary = new Dictionary(dictionaryId);
		BufferedReader reader = new BufferedReader(new FileReader("dictionaries/" + dictionaryId));
		String line;
		while((line = reader.readLine()) != null){
			String[] args = line.split(" ");
			switch(args[0]){
				case "[verb]" :{
					dictionary.addVerb(new Verb(line));
					break;
				}
				case "[adjective]":{
					dictionary.addAdjective(new Adjective(line));
					break;
				}
				case "[noun]":{
					dictionary.addNoun(new Noun(line));
					break;
				}
				case "[replacement]":{
					dictionary.addReplacement(new Replacement(line));
				}
			}
		}
		return dictionary;
	}
}
