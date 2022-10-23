package com.syntax.class04;

import java.util.Scanner;

public class HW6_CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If user does not have a credit card, then offer them.
		 * If they do have one, ask what is balance on the card?
		 * If balance of the card is larger than 1000, tell them to pay off immediately,
		 * otherwise you can tell them that they can spend more.
		 */
		
		Scanner value=new Scanner(System.in);
		System.out.println("Do you have a Credit Card? Please enter Yes or No.");
		String question=value.next();
		
		if(question.equals("Yes"))
		{
			System.out.println("What is the balance on your card?");
			
			double bal=value.nextDouble();	
			if(bal>1000)
			{
				System.out.println("Please pay off your card immediately.");
			}
			else
			{
				System.out.println("You can spend more.");
			}
		}
		else
		{
			System.out.println("I offer you to get a Credit Card.");
		}
		
	}

}
