package com.syntax.class07;

import java.util.Scanner;

public class Class06_HW3_CalculatorUsingIfStatementReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Using the Scanner class, create a calculator.
		 * Allow user to enter 2 numbers and an operator(+,-,*,/).
		 * Based on the operator, provide the result to the user.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */

		        Scanner aaa = new Scanner(System.in);
		        System.out.println("Enter 1st Number");
		        double num1 = aaa.nextInt();

		        System.out.println("Enter 2nd Number");
		        double num2 = aaa.nextInt();

		        System.out.println("Enter the operator");
		        char op = aaa.next().charAt(0);

		        double result = 0;
		        boolean wrongOperator=false;

		        if (op == '+') {
		            result = num1 + num2;
		        } else if (op == '-') {
		            result = num1 - num2;
		        } else if (op == '*') {
		            result = num1*num2;
		        } else if (op == '/') {
		            result = num1 / num2;
		        } else {
		            System.out.println("Enter valid operator");
		            wrongOperator=true;
		        }

		        if (!wrongOperator) {
		            System.out.println(result);
		        }
	}

}
