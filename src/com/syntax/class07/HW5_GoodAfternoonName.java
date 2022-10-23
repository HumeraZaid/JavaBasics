package com.syntax.class07;

import java.util.Scanner;

public class HW5_GoodAfternoonName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Prompt the user to ask the name 3 times and print "Good afternoon +name...
		 */
		
		Scanner sc=new Scanner(System.in);
		String name;
		
		for(int i=1; i<=3; i ++)
		{
			System.out.println("Please enter your name");
			name=sc.nextLine();
			System.out.println("Good afternoon, " +name +".");
			System.out.println("--------------------------------");
			System.out.println();
			
		}
		
	}

}
