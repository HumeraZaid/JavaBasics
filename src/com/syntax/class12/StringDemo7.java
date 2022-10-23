package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * The indexOf() method returns the index of a particular character in the String.
		 */	
		
		String str = "I am always confused i was kidding";
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		/*
		 * The substring() method gives you smaller string from a String.
		 * We can start the starting part to this method and it will return the substring from that index.
		 */
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,11));
		 
		
		
	}

}
