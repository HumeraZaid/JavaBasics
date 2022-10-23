package com.syntax.class10;

public class Class09_HW5_SumOfIntergers_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array of integers and calculate the sum of all elements in the array.
		 */
		
		int[] numbers= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int sum=0;
		
		for(int number:numbers)
		{
			sum+=number;
		}
		System.out.println(sum);		
	}

}
