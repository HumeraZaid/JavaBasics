package com.syntax.reviewclass05;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] dresses=new String[] {"Pink dress", "Cocktail", "Summer Dress", "Night Dress", "Pencil Dress"};
		
		// Last index is always size-1 because arrays index start from zero
		
		System.out.println(dresses.length);
		
		// Mostly this is how you will be using arrays
		
		for (int i=0;i<dresses.length;i++)
		{
			System.out.println("Let's try " + dresses[i]);
		}
		
		// Enhanced for loop
		
		for(String dress : dresses)
		{
			System.out.println(dress);
		}
		System.out.println("********************************");
		
		// Prints all the elements of an array without a loop
		
		System.out.println(Arrays.toString(dresses));	
	}

}
