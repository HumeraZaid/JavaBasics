package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		/*
		 *  Scanner is a class that helps us take an input from the keyboard.
		 * It  contains many different smaller modules called methods.
		 * Methods can help us take strings, booleans, basically all types of data from the keyboard.
	     */
		
		System.out.println("Please enter your name."); 
		// A message will be displayed on the console for the user to enter his/her name.	
		
		String name=input.next();
		// Activates the Java program to take the input from the keyboard and store it inside the name variable.
	
		System.out.println("Hello " +name+ ", welcome to learning the Scanner class.");
		// Prints whatever name the user enters on the keyboard on the console.

	}

}
