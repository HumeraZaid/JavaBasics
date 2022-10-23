package com.syntax.class05;

import java.util.Scanner;

public class CW1_HeightCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Prompt the user to enter a person's height in inches. Based on the input,
		 * person should be classified as one of the following:
		 *  • short (under 60 inch)
		 *  • medium(between 60 -72 inch)
		 *  • tall (over 72 inch)
		 */
		

		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your height in inches.");
		double height=inp.nextDouble();
		
		if(height<=60)
		{
			System.out.println("Your height is short.");
		}
		else if (height>60 && height<72)
		{
			System.out.println("Your height is medium.");
		}
		else if (height>=72)
		{
			System.out.println("Your height is tall.");
		}
	}

}
