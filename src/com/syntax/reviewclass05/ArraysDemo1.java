package com.syntax.reviewclass05;

public class ArraysDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Huma";
		String name1="Janel";
		String name2="Anna";
		
		// Not used in the real life most of the times
		
		String[] names=new String[]{"Huma", "Janel", "Anna"}; // One of the ways to create an array
		
		System.out.println(name1);
		System.out.println(names);
				
		System.out.println(names[-5]); // ArraIndexOutOfBoundsException
	}

}
