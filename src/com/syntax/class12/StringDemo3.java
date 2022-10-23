package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * The .trim() method removes the spaces before and after the String, but not the ones which are present in between.
		 */

		String str = " i love java ";
		
		System.out.println(str);
		System.out.println(str.trim());
		
		
		/*
		 * The .startsWith() method checks if a String starts with a specific letter or word.
		 * The .endsWith() method checks if a String ends with a specific letter or word.
		 * The .contains() method checks if a String contains a specific letter or word.
		 */
		
		String str2 = "Java is Very easy";
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("y"));
		
		/*
		 * Method chaining helps us call multiple methods on a single line, one method after another.
		 */
		
		System.out.println(str2.toLowerCase().contains("very"));	
	}

}
