package com.syntax.class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Today is Sunday";
		String str2 = new String("Today is Sunday");
		
		String day = str.substring(9);
		System.out.println(day);
		
		System.out.println(str.substring(6,8));
		char c = str.charAt(4); // Calling the method charAt on str object
		System.out.println(c);
		
		char[] charArr =  str.toCharArray();
		System.out.println(Arrays.toString(charArr));
		
		/*
		 * Since a String stores an array of characters in it, the charArr() method will print the entire String itself.
		 * Also, since the println keyword converts everything to a String, the charArr() method will return the entire String itself.
	 	 */
		
		System.out.println(charArr); 
		
		int index =  str.indexOf("a");
		System.out.println(index);
		System.out.println(str.indexOf("a",6));
		
	}

}
