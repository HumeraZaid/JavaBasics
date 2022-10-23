package com.syntax.class05;

import java.util.Scanner;

public class CW2_Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Write a program that will print whether it is a weekday or weekend. 
		 * If any day from 1-5, output should be "It is a weekday.".
		 * Any day from 6-7, output should be "It is a weekend.".
		 * Any other day, output should be "Invalid day.".
		 */

		int day=10;
		
		if(day>=1 && day<=5)
		{
			System.out.println("It is a weekday.");
		}
		else if (day==6 || day==7)
		{
			System.out.println("It is weekend.");
		}
		else
		{
			System.out.println("Invalid day.");
		}
	}

}
