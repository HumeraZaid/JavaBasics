package com.syntax.class13;

public class HW1_StringWithoutSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		 */
		
		String str1 = "Success is not final; failure is not fatal.";
		String str2 = str1.replaceAll(" ","");
		System.out.println(str2);

	}

}
