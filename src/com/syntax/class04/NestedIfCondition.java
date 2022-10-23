package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time=4;
		String day="Monday";
		
		
		if(day.equals("Monday")) // Outer if-condition. As String is non-primitive, we cannot us == sign. We have to use the .equals method.
			
			/* 
			 * It is called outer if-condition. If it is true, then only the inner conditions will be checked.
			 * If it is false, nothing from the inner if-conditions will be executed.
			 * It is like the main door.
			 * If the main door is closed, we cannot enter the building.
			 */
			
		{
			if(time>7) // Inner if-condition.
			{
				System.out.println("Let's go to office.");
			}
			
			if(time<6)
			{
				System.out.println("Let's sleep more.");
			}
		
		}
	}

}
