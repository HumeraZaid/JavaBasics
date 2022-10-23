package com.syntax.reviewclass04;

import java.util.Scanner;

public class ScannerLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=scanner.nextInt();
		
		/* while(i!=10)
		{
			System.out.println(i);
			i=scanner.nextInt();
		}
		*/	
		
		// all the loops are interchangeable, but sometimes using one type of
		// loop can make your code cleaner and easier to understand
		
			for(int j=0;i!=10;j=0)
			{
				System.out.println(i);
				i=scanner.nextInt();
			}
				
		
	}

}
