package com.syntax.class08;

public class CW1_SumOfEvenNumbersAndSumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// From the range of 1 to 50, please find sum of all even and all odd numbers
		
		System.out.println("Sum of all even numbers from 1 to 50 is:");
		int sum=0;
		
		for(int i=2;i<=50;i+=2)
			
		{
			sum+=i;
		}
		System.out.println(sum);
	
	
		System.out.println();
		System.out.println("Sum of all odd numbers from 1 to 50 is:");
	
		int sum1=0;
		
		for (int j=1;j<=49;j+=2)
		{
			sum1+=j;
		}
		System.out.println(sum1);

	}

}
