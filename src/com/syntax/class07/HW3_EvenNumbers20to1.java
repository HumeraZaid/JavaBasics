package com.syntax.class07;

public class HW3_EvenNumbers20to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		 * Print even numbers from 20 to 1 (2 ways).
		 */
		
		System.out.println("First way to do it:");
		
		int i=20;
		
		while(i>=1)
		{
			if(i%2==0)
				{
				System.out.print(i + " ");
				}
			i--;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Second way to do it:");
		
		int j=20;
		
		while(j>=1)
		{
			System.out.print(j + " ");
			j-=2;
		}
		
			
	}

}
