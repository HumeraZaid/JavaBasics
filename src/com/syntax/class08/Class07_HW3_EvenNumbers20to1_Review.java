package com.syntax.class08;

public class Class07_HW3_EvenNumbers20to1_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub

				/* 
				 * Print even numbers from 20 to 1 (2 ways).
				 */
				
				System.out.println("First way to do it:");
				
				for (int i=20;i>=1;i--)
				{
				
					if(i%2==0)
					{
						System.out.print(i + " ");
						}
				}
				
				System.out.println();
				System.out.println();
				System.out.println("Second way to do it:");
				
				for(int j=20;j>=1;j-=2)
				{
					System.out.print(j + " ");
				}
				
	}

}
