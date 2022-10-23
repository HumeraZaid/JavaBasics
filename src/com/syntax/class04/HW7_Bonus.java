package com.syntax.class04;

import java.util.Scanner;

public class HW7_Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary.
		 * If user worked for more or equals to 5 years, then user is eligible for the bonus, otherwise he is not.
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus = 3000. 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many years you worked for?");
		double years=input.nextDouble();
		
		if(years>=5)
		{
			System.out.println("Congatulations, you are eligible for a bonus!");			
		
			System.out.println("How much is your annual salary?");
			double sal=input.nextDouble();
			if (sal>50000)
				{
					System.out.println("You get a bonus of 5000.");
				}
			else
				{
					System.out.println("You get a bonus of 3000.");
				}
		}
		else
		{
			System.out.println("Sorry, you are not eligible for a bonus!");
		}
		
	}

}
