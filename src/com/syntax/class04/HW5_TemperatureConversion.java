package com.syntax.class04;

import java.util.Scanner;

public class HW5_TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a Java program that will ask user to input city and temperature.
		 * Your program should convert Fahrenheit into celsius and print “The temperature of the city is ” 
		 */
	
		Scanner value=new Scanner(System.in);
		System.out.println("Which city you live in?");
		String city=value.next();
		System.out.println("What is the current temperature (in F°) of the city you live in?");
		double F=value.nextDouble();
		float cel=(float)(F-32)*5/9;
		System.out.println("The temperature of " +city+ " is " +cel+ "° C.");
	}

}
