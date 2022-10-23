package com.syntax.class04;

import java.util.Scanner;

public class HW4_DMV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * You are a DMV representative and you need to ask customer their age.
		 * If they are 18 and older, you will issue a driver license to them,
		 * otherwise you will offer them to get a learners permit.
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age.");
		
		int age=input.nextInt();
		if(age>=18)
		{
			System.out.println("We can issue you a Drivers License.");
		}
		else
		{
			System.out.println("Please get a Learners Permit.");
		}
		
	}

}
