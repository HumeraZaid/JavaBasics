package com.syntax.reviewclass06;

public class HW_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * How would you reverse a String without using reverse function?
		 * 1. use StringBuilder and reverse method
		 * 2. use charAt();
		 * 3. use toCharArray(); --> HW
		 */

     String a = "Hello";
     char[] b = a.toCharArray();

     for(int i=b.length-1; i>=0; i--)
     {
         System.out.print(b[i]);
     }

 }


}
