package com.syntax.class09;

public class HW5_SumOfIntegers {

	public static void main(String[] args) {
		
		/*
		 * Create an array of integers and calculate the sum of all elements in the array.
		 */
		
		System.out.println("Using regular addition method:");
		System.out.println();
		
		int[] array= {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		
		System.out.println("Sum of all integers = " + (array[0] + array[1] + array[2] + array[3] + array[4] +
				array[5] + array[6] + array[7] + array[8] + array[9]));
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Using for loop:");
		System.out.println();
		
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		System.out.println("Sum of all integers = " + sum);
	}
}
