package com.syntax.class10;

public class CW2_2DArrayShorterWay_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array(shorter way) in which first array will consist of 4 names and
		 * second array will contain grades. Then your program should print name of the students
		 * that has A and B grade.
		 */
		
		String [][] arr= {
						 {"Yusuf", "Hamza", "Adam", "John"}, 
						 { "A", "B", "C", "D"}
						 };
		
		for (String[] singleArray:arr) // loops over 1D or single array
		{
			for(String el:singleArray) // loops over each element of the 1D array
			{
				System.out.print(el + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
