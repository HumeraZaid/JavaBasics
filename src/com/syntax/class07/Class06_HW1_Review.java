package com.syntax.class07;

import java.util.Scanner;

public class Class06_HW1_Review {
	
	public static void main(String[] args) {
		
		/*
		 * Ask the user to enter their country and capture it.
		 *  Once values are captured, print which language user speaks.
		 */
		
		System.out.println("Example of switch with the toLowerCase() method:");
		System.out.println();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scanner.nextLine();
		String yourLanguage;
		
		switch(country.toLowerCase())
		{
		case "moldova":
			yourLanguage="Romanian";
			break;
		case "romania":
			yourLanguage="Romanian";
			break;
		case "usa":
			yourLanguage="English";
			break;
		case "kazakhstan":
			yourLanguage="Kazakh";
			break;
		case "germany":
			yourLanguage="German";
			break;
		case "austra":
			yourLanguage="Romanian";
			break;
		case "italy":
			yourLanguage="Italian";
			break;
		case "france":
			yourLanguage="french";
			break;
		
		default:
			yourLanguage="Unknown";
			break;
				
		}
		System.out.println(yourLanguage);
		
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.println("Example of switch with the toUpperCase() method:");
		System.out.println();
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your country");
		String ctry=inp.nextLine();
		String language;
		
		switch(ctry.toUpperCase())
		{
		case "UAE":
			language="Arabic";
			break;
		case "INDIA":
			language="Hindi";
			break;
		case "UK":
			language="English";
			break;
		case "TURKEY":
			language="Turkish";
			break;
		case "BANGLADESH":
			language="Bengali";
			break;
		case "FINLAND":
			language="Finnish";
			break;
		
		default:
			language="Unknown";
			break;
				
		}
		
		System.out.println(language);
		
	}

}
