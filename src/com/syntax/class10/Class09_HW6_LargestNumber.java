package com.syntax.class10;

public class Class09_HW6_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  From an array of integer elements find the largest number.
		 */
		
		int[] num= {100, 400, 3000, 10};
		
		int largestnum=num[0];
		
		for(int n : num)
		{
			if(n>largestnum)
			{
				largestnum=n;
			}
		}
		System.out.println(largestnum);
	}

}
