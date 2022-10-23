package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * The .equals() method checks if two strings are exactly the same with exact same case.
		 */
		
		String str = "Shah";
		String str2 = "Shah";
		String str3 = new String("Shah");
		
		if(str.equals("shah"))
		{
			System.out.println("I found it");
		}
		
		/*
		 * The .equalsIgnoreCase() method checks if two strings are exactly the same,
		 * but does not care about the case of letters.
		 */
		
		if(str.equalsIgnoreCase("shah"))
		{
			System.out.println("I found it with equalsIgnoreCase");
		}

	}

}
