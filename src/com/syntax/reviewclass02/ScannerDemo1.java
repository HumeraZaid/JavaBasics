package com.syntax.reviewclass02;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* nextLine() is a special method that can capture spaces and enters as well.
		 * When we use any method like nextInt(), nextBoolean(), nextDouble(), and if after that, we use nextLine(),
		 * we need to discard that enter by using  an extra nextLine() call.
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your age.");
		int age=scanner.nextInt();
		
		System.out.println("Please enter your name.");
		scanner.nextLine();
		String name=scanner.nextLine();
	
		System.out.println(name +" is " +age+ " years old.");
	}

}
