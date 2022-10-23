package com.syntax.class04;

import java.util.Scanner;

public class HW1_Dilpoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Write a program to store a Boolean value of whether user has a diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree.
		 * Then if user has a degree, program should check a GPA score.
		 * If GPA score is higher or equals to 3.5, output should say “You are eligible for scholarship”,
		 * otherwise, “You should have studied harder”.
		 */

		Scanner value=new Scanner(System.in);
		System.out.println("Do you have a Diploma? Please enter True or False.");
		boolean diploma=value.nextBoolean();

		
		if(diploma)
		{
			System.out.println("Congratulations!!");
			System.out.println("What is your GPA Score?");
			double gpaScore=value.nextDouble();
		
			
			if(gpaScore>=3.5)
			{
				System.out.println("You are eligible for a Scholarship.");
			}
			else
			{
				System.out.println("Sorry, you should have studied harder.");
			}
		}
		else
		{
			System.out.println("Please get a Diploma.");
		}
		
	}

}
