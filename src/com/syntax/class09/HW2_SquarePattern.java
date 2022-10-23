package com.syntax.class09;

public class HW2_SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Print the following pattern on the console:
		 * 
		 *          *****
		 *          *   *
		 *          *   *
		 *          *   *
		 *          *****
		 */

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if ((i == 2 || i == 3 || i==4) && (j == 2 || j == 3 || j==4))
				{
				System.out.print(" ");
				continue;
			}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
