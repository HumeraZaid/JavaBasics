package com.syntax.class07;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		
		while(num<=2)
		{
			System.out.println("I am the while loop");
			num++;
		}
		
		System.out.println("---------------------");
		
		int num1=1;
		
		do
		{
			System.out.println("I am the do-while loop");
			num1++;
		}
		while(num1<=2);
	}

}
