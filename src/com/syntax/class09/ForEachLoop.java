package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Only when we deal with arrays or collections, we can use :
		// for each loop, enhanced for loop, advanced for loop
		
		String[] iceCream= {"Vanilla", "Chocolate", "Pistachio", "Kulfi", "Mango"};
		
		for(String flavor : iceCream)
		{
			System.out.println(flavor);
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();
		
		char[] letters= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(char letter : letters )
		{
		System.out.print(letter);	
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();
		
		int[] numbers= {12, 56, 345, 1, 0, 9};
		// Get all the elements using regular for loop
		
		for(int i=0; i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
			System.out.println();
			
		// Get all the elements using enhanced for loop
		// This loop always loops ONLY 1 way: from start till end
			
			for(int num : numbers)
			{
				System.out.print(num + " ");
			}
		
	}

}
