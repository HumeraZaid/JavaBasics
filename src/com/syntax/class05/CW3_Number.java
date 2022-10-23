package com.syntax.class05;

import java.util.Scanner;

public class CW3_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ask a user to enter a number and then define if number is small, medium, or large.
		 * • Small number is value between 1 and 10.
		 * • Medium number is value between 11 and 100.
		 * • Large number is value between 101 and 1000
		 */

		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter the number.");
		int num=inp.nextInt();
		
		if(num>=1 && num<=10)
		{
			System.out.println(num +" is small.");
		}
		else if(num>=11 && num<=100)
		{
			System.out.println(num + " is medium.");
		}
		else if (num>=101 && num<=1000)
		{
			System.out.println(num +" is large.");
		}
	}

}
