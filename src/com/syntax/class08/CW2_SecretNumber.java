package com.syntax.class08;

import java.util.Scanner;

public class CW2_SecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Create a secret number and let user guess the secret number.
		 * Once user guessed your secret number, output should be you won!
		 */
		
		Scanner sc=new Scanner(System.in);
		int mySecretNumber=2;
		int secretNumber;
		
		do
		{
			System.out.println("Please enter the secret number.");
			secretNumber=sc.nextInt();
		}
		while(secretNumber!=mySecretNumber);
			System.out.println("Congratulations, you won!");
	}

}
