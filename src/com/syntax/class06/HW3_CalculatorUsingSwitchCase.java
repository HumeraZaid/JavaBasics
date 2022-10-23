package com.syntax.class06;

import java.util.Scanner;

public class HW3_CalculatorUsingSwitchCase {

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
		double num1=inp.nextInt();
		System.out.println("Please enter the second number.");
		double num2=inp.nextInt();
		System.out.println("Please enter an operator.");
		char opr=inp.next().charAt(0);
		
		switch(opr)
		{
		case '+':
			System.out.println(num1+num2);	
			break;
		case '-':
			System.out.println(num1-num2);	
			break;
		case '*':
			System.out.println(num1*num2);	
			break;
		case '/':
			System.out.println(num1/num2);	
			break;
		default:
			System.out.println("Invalid operator entered.");
			break;
		}
		}
	
	}
