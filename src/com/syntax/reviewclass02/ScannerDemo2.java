package com.syntax.reviewclass02;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
	
		System.out.println("Please enter your name.");
		char name=scanner.next().charAt(5);
	
		System.out.println(name);

	}

}
