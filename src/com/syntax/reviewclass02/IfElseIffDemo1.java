package com.syntax.reviewclass02;

public class IfElseIffDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=100;
		
		if(number>0)
		{
			System.out.println("Number is positive.");
		}
		if(number<0)
		{
			System.out.println("Number is negative.");
		}
		if(number==0)
		{
			System.out.println("Number is 0.");
		}
		
		if(number>0) 
		{
			System.out.println("Number is positive.");
		}
		else if(number<0)
		{
			System.out.println("Number is negative.");
		}
		else 
		{
			System.out.println("Number is 0.");
		}
		
		
	}

}
