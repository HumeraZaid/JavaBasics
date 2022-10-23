package com.syntax.class12;

public class StringDemo5 {
	
	public static void main(String[] args) {
	
	/*
	 * The charAt() method returns the character at a specific index.
	 */
	
	String str = "I love java programming";
	System.out.println(str.charAt(3));
	
	for(int i=0; i<str.length() ; i++)
	{
		if(!(str.charAt(i)==' '))
		{
			System.out.println(str.charAt(i));
		}
	}
	
	}

}
