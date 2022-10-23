package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * The .length() method counts the number of characters in a String including spaces.
		 */

		String str = new String ("Java"); // Proper way of creating an object
		String name = "Asma Alfadhli The Great"; // Simpler and shorter way provided by Java Creators to make our life a little easier. Only works for String and Wrapper classes.
	
		System.out.println(str.length());
		System.out.println(name.length());
		
		if(name.length() > 15)
		{
			System.out.println("Name can't be more than 15 characters.");
		}
		
	}

}
