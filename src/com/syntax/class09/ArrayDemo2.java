package com.syntax.class09;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] drinks= {"fanta", "milk", "juice", "lemonade", "water", "dr pepper"};
		
		System.out.println(drinks[2]); // juice
		
		// how many elements inside my array?
		
		int size=drinks.length; // will give number of elements in the array
		System.out.println("Size of array = " + size);
	}

}
