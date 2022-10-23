package com.syntax.class13;

public class HW2_AlphaNumericCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a String that should be combination of letters, numbers and special characters. 
		 * Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
		 */
		
		String str1 = "ABCDE98765FGHIJ*&^%$#@!abcde43210fghij";
		String str2 = str1.replaceAll("[^A-Za-z0-9]","");
		System.out.println("There are " + str2.length() + 
		                   " Alphanumeric characters in the string ABCDE98765FGHIJ*&^%$#@!abcde43210fghij.");

	}

}
