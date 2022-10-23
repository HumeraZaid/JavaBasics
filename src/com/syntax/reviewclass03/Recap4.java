package com.syntax.reviewclass03;

import java.util.Scanner;

public class Recap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter if you are comfortable with Java"
				+ " operators now");
		boolean goodWithOp=scanner.nextBoolean();
		
		if(!goodWithOp)
		{
			System.out.println("Do some more research, solve Repls, and take some rest");
		}
	}

}
