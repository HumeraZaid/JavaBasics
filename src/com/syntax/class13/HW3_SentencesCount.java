package com.syntax.class13;

import java.util.Arrays;

public class HW3_SentencesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
		 * How would you find out how many sentences are in that String?
		 */
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		char ch ='"';
		String[] b = a.split("[?]");
		
		System.out.println("There are " + b.length + " sentences in the string " + ch + a + ch);

	}

}
