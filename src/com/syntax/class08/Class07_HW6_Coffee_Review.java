package com.syntax.class08;

import java.util.Scanner;

public class Class07_HW6_Coffee_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Declare a variable to store a price for a coffee.
		 * Ask the user to pay for a coffee.
		 * Keep asking to pay for coffee until the user enters the EXACT amount .
		 * If the user gives more than coffee price --> ask them to give less.
		 * If the user gives less money then ask to give more.
		 * Once user give EXACT amount print “Please enjoy your coffee"
		 */

		Scanner sc=new Scanner(System.in);
		double priceOfCoffee=5.0;
		double priceUserPaid;
		
		do
		{
			System.out.println("Please pay for your coffee.");
			priceUserPaid=sc.nextDouble();
			
			
			if(priceUserPaid>priceOfCoffee)
			{
				System.out.println("Your coffee is for $5. Please pay less.");
				System.out.println("------------------------------------------");
			}
			else if(priceUserPaid<priceOfCoffee)
			{
				System.out.println("Your coffee is $5. Please pay more.");
				System.out.println("------------------------------------------");
			}
		}
		
		while(priceUserPaid!=priceOfCoffee);
			System.out.println("Please enjoy your coffee!!");
		

	}

}
