package com.syntax.class06;

import java.util.Scanner;

public class HW1_CountryAndLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Ask the user to enter their country and capture it.
		 *  Once values are captured, print which language user speaks.
		 */

		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your country name.");
		String country=inp.nextLine();
		String language;
		
		switch(country)
		{
		case "India":
			language="Hindi";
			break;
		case "USA":
			language="American English";
			break;
		case "London":
			language="British English";
			break;
		case "Afhganistan":
			language="Pashto";
			break;
		case "Bangladesh":
			language="Bengali";
			break;
		case "Brazil":
			language="Portuguese";
			break;
		case "Finland":
			language="Finnish";
			break;
		case "Iran":
			language="Persian";
			break;
		case "Ireland":
			language="Irish";
			break;
		case "Japan":
			language="Japanese";
			break;
		case "Pakistan":
			language="Urdu";
			break;
		case "Dubai":
			language="Arabic";
			break;
		case "Turkey":
			language="Turkish";
			break;
		default:
			language="Unknown";
			break;
		}
		
		System.out.println("You are from " +country+ " and you speak the " +language+ " language!");
			
		
		
	}

}
