package com.syntax.class06;

import java.util.Scanner;

public class CW2_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores)
		 * and determine the grade based on the following rules: 
		 * • if the average score >=90, output should be grade=A.
		 * • if the average score >= 70 and <90, output should be grade=B
		 * • if the average score>=50 and <70, output should be grade=C
		 * • if the average score<50, output should be grade=F.
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your Quiz score.");
		double Quiz=inp.nextDouble();
		System.out.println("Please enter your Mid-term score.");
		double MidTerm=inp.nextDouble();
		System.out.println("Please enter your Final score.");
		double Final=inp.nextDouble();
		
		double average;
		average = (Quiz+MidTerm+Final)/3;
		String grade;
		
		if(average>=90 && average<=100)
		{
			grade="A";
		}
		else if(average>=70 && average<90)
		{
			grade="B";
		}
		else if(average>50 && average<70)
		{
			grade="C";
		}
		else if(average<50 && average>0)
		{
			grade="F";
		}
		else
		{
			grade= " None. Please enter a valid score.";
		}
		
		System.out.println("Grade:" +grade);
				
		
	}

}
