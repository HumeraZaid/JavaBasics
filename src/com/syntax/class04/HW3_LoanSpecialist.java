package com.syntax.class04;

import java.util.Scanner;

public class HW3_LoanSpecialist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan needed.
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the amount of loan needed?");
		
		double LoanAmount=scanner.nextDouble();
		
		if(LoanAmount<=200000)
		{
			System.out.println("We can give you the money.");
		}
		else
		{
			System.out.println("Sorry, we cannot give you the money.");
		}
		
		
	}

}
