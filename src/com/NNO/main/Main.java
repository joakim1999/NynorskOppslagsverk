package com.NNO.main;

import java.io.IOException;
import java.util.Scanner;

import com.NNO.dictionary.Dictionary;
import com.NNO.load.LoadDictionary;

public class Main {
	public static LoadDictionary load;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		load = new LoadDictionary();
		while(true){
			System.out.println("Skriv inn et nynorsk ord");
			String answer = sc.nextLine();
			
			Dictionary dict = load.loadDicitionary(answer.charAt(0));
			System.out.println(dict.search(answer));
		}
	}
}
