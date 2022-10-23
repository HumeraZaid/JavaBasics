package com.syntax.Project1;

public class Task7_DoneByMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a java program to check whether a given number is prime or not?
		 */
		
		int num = 10;
	    boolean prime  = false;
	    
	    for (int i = 2; i <= num / 2; i++)
	    {
	  
	      if (num % i == 0)
	      {
	        prime = true;
	        break;
	      }
	    }

	    if (!prime)
	    {
	      System.out.println(num + " is a prime number.");
	    }
	    else
	    {
	      System.out.println(num + " is not a prime number.");
	  }
	}
}


