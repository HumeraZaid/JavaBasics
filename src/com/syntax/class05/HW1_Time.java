package com.syntax.class05;

import java.util.Scanner;

public class HW1_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that will ask user to input the current time (use 24-hour format).
		 * Based on the given time, define:
		 * • if hour is between 1-11, output should be morning.
		 * • if hour between 12-15,output should be afternoon.
		 * • if hour between 16-20, output should be evening.
		 * • if hour between 21-24, output should be night.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the current time.");
		int time=scan.nextInt();
		
		if(time>=1 && time<=11)
		{
			System.out.println("It is morning.");
		}
		else if(time>=12 && time<=15)
		{
			System.out.println("It is afternoon.");
		}
		else if(time>=16 && time<=20)
		{
			System.out.println("It is evening.");
		}
		else if(time>=21 && time<=24)
		{
			System.out.println("It is night.");
		}
	}
}