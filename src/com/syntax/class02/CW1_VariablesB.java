package com.syntax.class02;

public class CW1_VariablesB {

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
		String city ="Chicago";
		String state="Illinois";
		String phonenumber="(123)-456-7890";
		
		city="Mumbai";
		state="Maharashtra";
		phonenumber="(098)-765-4321";
		grade='B';
		
		System.out.println("My name is " +name+ " " +midname +" " +lastname+ " and I moved to " +city+ ", " +state+ ".");
		System.out.println("My new phone number is " +phonenumber+ "." );
			
		
		
	}

}
