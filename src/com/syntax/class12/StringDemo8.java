package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * The replace() method replaces a specific word with another word.
		 * The replaceAll() method replaces the entire string with another character/word.
		 */

		String str = "Batch 14 is good";
		System.out.println(str.replace("good","excellent"));
		System.out.println(str.replaceAll("[a-z]", "#"));
		

	}

}
