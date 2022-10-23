package com.syntax.reviewclass02;

public class IfElseConditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username="Admin";
		String password="password";
		
		/*
		 * When we have to check if a box contains a value or not, we can use == or .equals().
		 * When the dataType is primitive (for example, char, int, short, etc.), we use ==.
		 * When the dataType is non-primitive (for example, string), we use .equals().
		 */
		
		if(password.equals("password123"))
			{
				System.out.println("Welcome " +username);
			}
		else
		{
			System.out.println("Wrong password, " +username);
		}
		
	}

}
