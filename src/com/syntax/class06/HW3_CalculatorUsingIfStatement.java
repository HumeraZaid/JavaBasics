package com.syntax.class06;

import java.util.Scanner;

public class HW3_CalculatorUsingIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Using the Scanner class, create a calculator.
		 * Allow user to enter 2 numbers and an operator(+,-,*,/).
		 * Based on the operator, provide the result to the user.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter the first number.");
		int num1=inp.nextInt();
		System.out.println("Please enter the second number.");
		int num2=inp.nextInt();
		System.out.println("Please enter an operator.");
		char opr=inp.next().charAt(0);
		int result=0;
		
		if(opr=='+')
		{
			result=num1+num2;
		}
		else if(opr=='-')
		{
			result=num1-num2;
		}
		else if(opr=='*')
		{
			result=num1*num2;
		}
		else if(opr=='/')
		{
			result=num1/num2;
		}
		else
		{
			System.out.println("Wrong operator entered.");
		}
		if(opr=='+' || opr=='-' || opr=='*' || opr=='/')
		{
		System.out.println(result);
		}
	}

}

