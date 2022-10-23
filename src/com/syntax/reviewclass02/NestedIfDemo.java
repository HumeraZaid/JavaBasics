package com.syntax.reviewclass02;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Nested if-conditions are conditions which are dependent on each other.
		 * If the outer if-condition is not true, the inner if-condition is never checked.
		 * The inner if-condition is checked only when the outer if-condition is passed.
		 */
		
		int money=12;
		if(money>10) // Outer if-condition
		{
			System.out.println("Let's buy some eggs.");
			int noOfEggs=2; // Inner if-condition
			if(noOfEggs>0) 
			{
			System.out.println("Let's boil the eggs.");
			}
		}
		
	}

}
