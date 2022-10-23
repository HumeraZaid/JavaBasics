package com.syntax.class09;

public class AllElementsFromArray {

	public static void main(String[] args) {
		
		String[] iceCream= {"Vanilla", "Chocolate", "Pistachio", "Kulfi", "Mango"};
		
		// System.out.println(iceCream[0]);
		// System.out.println(iceCream[1]);
		
		// How to get all values?
		
		for(int i=0;i<iceCream.length;i++)
		{
			System.out.println(iceCream[i]);
		}
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		
		char[] letters= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(int i=0;i<letters.length;i++)
		{
			System.out.print(letters[i] + " ");
		}
		
		
	}
}
