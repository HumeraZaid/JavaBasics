package com.syntax.class07;

public class CW5_OddNumbers100to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print only odd numbers from 100 to 1 (do it in 2 different ways)
		
		System.out.println("First way to do it:");
		
		int i=100;
		
		while(i>=1)
		{
			if(i%2!=0)
			{
			System.out.print(i + " ");
			}
			
			i--;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Second way to do it:");
		
		int j=99;
		
		while(j>=1)
		{
			System.out.print(j +" ");
			j-=2;
		}

	}

}
