package com.syntax.class09;

public class HW7_ReverseCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array to store char values and then print those in reverse order.
		 */
		
		char[] values= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z'};
		
		for(int i=values.length-1;i>=0;i--)
		{
			System.out.print(values[i] + " ");
		}
	
	}

}
