package com.syntax.class05;

import java.security.PublicKey;
import java.util.Scanner;

public class HW2_Birthday {
	
	public static void main(String[] args)
	{

		/*
		 * Write a program for a user to enter his/her birth month. Based on the month, define the season.
		 * For example, if user is born in March, April, May, output should be season = "Spring".
		 * If user is born in June, July, August, output should be season = "Summer", etc …
		 */
		
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your birth month.");
		String month=inp.next();
		
		if(month.equals("December") || month.equals("January") || month.equals("February"))
		{
			System.out.println("You were born in the Winter season!");
		}
		else if(month.equals("March") || month.equals("April") || month.equals("May"))
		{
			System.out.println("You were born in the Spring season!");
		}
		else if(month.equals("June") || month.equals("July") || month.equals("August"))
		{
			System.out.println("You were born in the Summer season!");
		}
		else if(month.equals("September") || month.equals("October") || month.equals("November"))
		{
			System.out.println("You were born in the Autumn season!");
		}
	}

}
