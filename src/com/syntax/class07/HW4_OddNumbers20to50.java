package com.syntax.class07;

public class HW4_OddNumbers20to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Print odd numbers between 20 and 50 (2 ways).
		 */
		
		System.out.println("First way to do it:");
		
		int i=20;
		
		while(i<=50)
		{
			if(i%2!=0)
			{
			System.out.print(i + " ");
		}
			i++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Second way to do it:");
		
		int j=21;
		
		while(j<=49)
		{
			System.out.print(j + " ");
			j+=2;
		}
			
	}

}
