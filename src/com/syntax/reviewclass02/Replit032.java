package com.syntax.reviewclass02;

import java.util.Scanner;

public class Replit032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp=new Scanner(System.in);
	    System.out.println("Please enter your gender: M or F");
	    char gender=inp.next().charAt(0);

	    System.out.println("Please enter your age");
	    int age=inp.nextInt();

	    if(age>25)
	    {
	      if(gender=='F')
	      {
	        System.out.println("Woman");
	      }
	      else
	      {
	        System.out.println("Man");
	      }
	    }
	      if(age<25)
	      {
	        if (gender=='F')
	          {
	          System.out.println("Girl");
	      }
	      else
	      {
	        System.out.println("Boy");
	      }  
	    }		
		
	}

}
