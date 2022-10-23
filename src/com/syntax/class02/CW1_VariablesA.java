package com.syntax.class02;

public class CW1_VariablesA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Create a Java program and name it Variables
		 * In your program create different type of variables to store student’s 
		 * information(name, last name, grade, city, state, phone number) and then print value
		 * of those variables in the format:
		 *  a)   My name is _ and my  last name is __
		 *  I am A/B student 
		 *  I live in city__ and state_
		 *  And my phone number is …..
		 *  b)   Change student’s city, state, phone number and grade.
		 *  And print those updated values:
		 *  Example:
		 *  My name is _ and I moved to new city_ and new state_. My new phone number is __
		 */

		String name="Humera";
		String midname="Zaid";
		String lastname="Shelia";
		char grade='A';
		String city="Chicago";
		String state="Illinois";
		String phonenumber="(123)-456-7809";
		
		System.out.println("My name is " +name +" " +midname +" " +lastname +".");
		System.out.println("I am " +grade +" student.");	
		System.out.println("I live in " +city +", " +state +".");
		System.out.println("And my phone number is " +phonenumber +".");
		
	}

}
