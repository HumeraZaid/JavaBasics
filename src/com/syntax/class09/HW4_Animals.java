package com.syntax.class09;

public class HW4_Animals {

	public static void main(String[] args) {
		
		/*
		 * Create an array of animals and store 5 elements into it.
		 * Using 2 different loops print all elements from the array.
		 */
		
		System.out.println("Using regular for loop:");
		System.out.println();
		
		String[] animalNames= {"Lion", "Tiger", "Elephant", "Monkey", "Bear"};
		
		for(int animal=0; animal<animalNames.length; animal++)
		{
			System.out.println(animalNames[animal]);
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("Using enhanced for loop:");
		System.out.println();
		
		for(String animals : animalNames)
		{
			System.out.println(animals);
		}
			
			
	}
}
