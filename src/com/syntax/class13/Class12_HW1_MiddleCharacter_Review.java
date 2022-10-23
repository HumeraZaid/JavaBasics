package com.syntax.class13;

public class Class12_HW1_MiddleCharacter_Review {
	
	public static void main(String[] args) {
			
	/*
	 * Create a String and if the String is not empty perform the following:
	 * If the String has an odd number of characters and has 3 or more characters,
	 * print the character in the middle of the String.
	 * 
	 * 
	 */
	
	String str = "hello";
	int length = str.length();
	
	if(!str.isEmpty() && length%2!=0 && length>=3)
	{
		int middleIndex = length/2;
		System.out.println(str.charAt(middleIndex));
	}
}
}
