package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we need to ask a user where he/she is from.
         * Based on the country, define favorite food
         */
		 
		Scanner inp=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		String country=inp.nextLine();
		
		String favoriteFood;
		
		switch(country)
		{
		case "USA":
			favoriteFood="Burgers and fries";
			break;
		case "Kazakhstan":
			favoriteFood="Beshparmak";
			break;
		case "Turkey":
			favoriteFood="Adana Kebab";
			break;
		case "Venezuela":
			favoriteFood="Arepa";
			break;		
		case "India":
			favoriteFood="Chicken curry";
			break;
		case "Yemen":
			favoriteFood="Mandi";
			break;
		case "Afghanistan":
			favoriteFood="Kabuli Pulao";
			break;
		default:
			favoriteFood="Unknown";
			break;
		}
		
		System.out.println("You are from " +country + " and your favorite food is " +favoriteFood + ".");
	}

}
