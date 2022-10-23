package com.syntax.class09;

public class HW6_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  From an array of integer elements find the largest number.
		 */

		int[] arr= {10, 20, 50, 100, 30, 40, 80, 60, 90, 70};
		
		int largestNumber=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>largestNumber)
			{
				largestNumber=arr[i];
			}
		}
		System.out.println("The largest number is " + largestNumber);	
	}

}
