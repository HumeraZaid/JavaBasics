package com.syntax.class07;

import java.util.Scanner;

public class HW6_Coffee {

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
		double priceOfCoffee;
		
		do
		{
			System.out.println("Please pay for your coffee.");
			priceOfCoffee=sc.nextDouble();
			
			if(priceOfCoffee>5)
			{
				System.out.println("Your coffee is for $5. Please pay less.");
				System.out.println("------------------------------------------");
			}
			else if(priceOfCoffee<5)
			{
				System.out.println("Your coffee is $5. Please pay more.");
				System.out.println("------------------------------------------");
			}
		}
		
		while(priceOfCoffee!=5);
			System.out.println("Please enjoy your coffee!!");
		
	}

}
