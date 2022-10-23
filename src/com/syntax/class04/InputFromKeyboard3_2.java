package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		/* 
		 * Just using Scanner to confuse Asma
		 */
		
		System.out.println("Please enter your name.");
		String name=scanner.nextLine();  
		// Takes a String type input from the keyboard and stores it in the name variable.
		
		System.out.println("Please enter your age.");
		int age=scanner.nextInt(); 
		// Takes an in type input from the keyboard and stores it in the age variable.
		
		System.out.println("Hi " +name+ ", you are " +age+ " years old.");
	}

}
