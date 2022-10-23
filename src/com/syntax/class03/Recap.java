package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String concatenation helps us combine a String with any primitive dataType 
		 */
		
		
		String firstName="Mina";
		String lastName="Henen";
		String fullName=firstName + " " +lastName;
		System.out.println(fullName);

		
		int houseNo=15;
		int apartmentNo=5;
		String streetName="That street";
		String city="New York";
		String country="USA";
		String fullAddress=houseNo+ " " +apartmentNo+ " " +streetName+ " "+city+ " " +country;
		System.out.println(fullAddress);
		
		String incompleteAddress=houseNo+city;
		
		String step1="If we subtract 10 from 5, we get " +10; // Results in a String
		System.out.println(step1);
		/* It is not defined. Java does not understand what to do when we ask her to subtract
		 *  a String from a number, it complains
		 */
		// String step2=step1-5;
		
	
		System.out.println("If we subtract 10 from 5, we get " +(10-5));
		
		
	}

}
