package com.syntax.Project1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Using Scanner create an array of integer values.
		 * After the array is created, calculate the sum of all stored elements in that array.
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of the array"); // Asks the user for a number
		int size=scanner.nextInt();  // It creates an array of the size above
		
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Please enter an int number");
			arr[i]=scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		
		for( int num : arr)
		{
			sum+=num;
		}
		System.out.println("Sum of all the numbers from the array is " + sum);	
		
	}

}
