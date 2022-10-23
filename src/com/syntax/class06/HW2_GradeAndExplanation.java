package com.syntax.class06;

import java.util.Scanner;

public class HW2_GradeAndExplanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end, your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your grade.");
		char grade=scanner.next().charAt(0);
		String explanation;
		
		switch(grade)
		{
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			break;
		case 'F':
			explanation="Fail";
			break;
		default:
			explanation="Not Acceptable";
			break;
		}
		
		System.out.println("Your grade is " +grade+ ", which means " +explanation+ "!");	
			
		}
		
	}

