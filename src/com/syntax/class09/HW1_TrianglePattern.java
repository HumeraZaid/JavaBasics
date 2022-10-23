package com.syntax.class09;

public class HW1_TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Print the following pattern on the console:
		 * 
		 *          *
		 *          **
		 *          ***
		 *          ****
		 *          *****
		 */

		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
