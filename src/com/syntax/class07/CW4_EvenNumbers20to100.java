package com.syntax.class07;

public class CW4_EvenNumbers20to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print even numbers from 20 to 100 (do it in 2 different ways)
		
		System.out.println("First way to do it:");
		
		int i=20;
		while(i<=100)
		{
			if(i%2==0)
			{
			System.out.print(i + " ");
			}
			i++;
		}

		System.out.println();
		System.out.println();
		
		System.out.println("Second way to do it:");
		
		int j=20;
		while(j<=100)
		{
			System.out.print(j + " ");
			j+=2;
		}
	}

}
