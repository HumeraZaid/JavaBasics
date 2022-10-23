package com.syntax.class06;

import java.util.Scanner;

public class CW1_EnhancedBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program for a user to enter his/her birth month. Based on the month, define the season.
		 * For example, if user is born in March, April, May, output should be season = "Spring".
		 * If user is born in June, July, August, output should be season = "Summer", etc …
		 * Enhance this code by defining a variable for the output and then printing it.
		 * At the end of the program, we should see 1 output as “You were born in the __ season.”.
		 */
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please enter your birth month.");
		String month=inp.next();
		String birthMonth;
		
		
		if(month.equals("December") || month.equals("January") || month.equals("February"))
		{
			birthMonth="You were born in the Winter season!";
		}
		else if(month.equals("March") || month.equals("April") || month.equals("May"))
		{
			birthMonth="You were born in the Spring season!";
		}
		else if(month.equals("June") || month.equals("July") || month.equals("August"))
		{
			birthMonth="You were born in the Summer season!";
		}
		else if(month.equals("September") || month.equals("October") || month.equals("November"))
		{
			birthMonth="You were born in the Autumn season!";
		}
		else
		{
			birthMonth="Wrong birth month entered. Please enter a valid birth month.";
		}
		
		System.out.println(birthMonth);

	}

}
