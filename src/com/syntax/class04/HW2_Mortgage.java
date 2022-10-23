package com.syntax.class04;

import java.util.Scanner;

public class HW2_Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a house,
		 * otherwise user will consider buying.
		 * Once user decides to buy a house, if price of the house is larger than 200000, than user will take a loan,
		 * otherwise user will pay cash.
		 */

		Scanner value=new Scanner(System.in);
		System.out.println("Please enter the Mortgage Rate.");
		double MortgageRate=value.nextDouble();
		
		if(MortgageRate>4.5)
		{
			System.out.println("We will not buy a house.");
		}
		else
		{
			System.out.println("We will buy a house.");
			System.out.println("Please enter the Mortgage Price.");
			int MortgagePrice=value.nextInt();
			
			if(MortgagePrice>200000) {
				System.out.println("We will take a loan.");
			}
			else
			{
				System.out.println("We will pay cash.");
			}
			
		}
		
	}

}
