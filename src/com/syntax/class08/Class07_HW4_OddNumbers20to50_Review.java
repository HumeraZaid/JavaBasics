package com.syntax.class08;

public class Class07_HW4_OddNumbers20to50_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Print odd numbers between 20 and 50 (2 ways).
		 */
		
		System.out.println("First way to do it:");
		
		for (int i=20;i<=50;i++)
		{
			if(i%2!=0)
			{
			System.out.print(i + " ");
		}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Second way to do it:");
		
		for (int j=21;j<=49;j+=2)
		{
			System.out.print(j + " ");
		}
	}

}
