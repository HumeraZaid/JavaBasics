package com.syntax.class09;

public class HW3_Cars {
	
	public static void main(String[] args) {
		
		/* 
		 * Create an array of cars and store 6 elements into it.
		 * Using 2 different loops print all values from the array.
		 */
		
		System.out.println("Using regular for loop:");
		System.out.println();
		
		String[] carNames= {"BMW", "Mercedes", "Audi", "Tesla", "Lamborghini", "Porsche"};
		
		for (int car=0; car<carNames.length; car++)
		{
			System.out.println(carNames[car]);
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("Using enhanced for loop:");
		System.out.println();
		
		for (String car: carNames)
		{
			System.out.println(car);
		}
	}

}
