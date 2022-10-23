package com.syntax.class07;

public class CW2_EvenNumbers1to20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print all even numbers from 1 to 20
		
		int i=1;
		
		
		while(i<=20)
		{
			if(i%2==0)
			{
			System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Another way:");
		
		int j=2;
		while(j<=20)
		{
			System.out.print(j +" ");
			j+=2;
		}
	}
}

