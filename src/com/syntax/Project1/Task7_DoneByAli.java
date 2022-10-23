package com.syntax.Project1;

public class Task7_DoneByAli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=13;

        for(int a=2; a<i; a++)
        {
            if(i%a==0 && i>1) 
            {
                System.out.println(i + " is not a prime number");
                break;
            }

            else
            { 
            	System.out.println(i + " is a prime number");
                break;
            }
        }
	}

}
