package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * The .concat() method joins two strings.
		 */
		
		String firstName = "Olena";
		String lastName = "Dudka";
		
		System.out.println(firstName + lastName); // Mostly this is used
		System.out.println(firstName.concat(" ").concat(lastName));
		
		/*
		 * The isEmpty() method returns true if a String is empty and will return false if you have a space in the String.
		 * However, the isBlank() method does not count the spaces.
		 */		
		
		String str = " ";
		System.out.println(str.isEmpty()); 
		// System.out.println(str.isBlank());
	}

}
