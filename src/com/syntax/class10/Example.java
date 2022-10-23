package com.syntax.class10;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] week= {"Monday", "Sunday", "Tuesday", "Thursday", "Friday"};
		
		// if day is Sunday -> it is fun day
		// otherwise -> it is boring day
		
		for(String day : week)
		{
			if(day.equals("Sunday"))
			{
				System.out.println(day + " is fun day");
			}
			else if(day.equals("Friday"))
			{
				System.out.println(day + " is relax day");
			}
			else
			{
				System.out.println(day + " is boring day");
			}
		}
		
	}

}
