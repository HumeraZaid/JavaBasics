package com.syntax.class04;

public class NestedIfCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double moneyInMyAccount=50000;
		String season="Spring";
		
		if(season.equals("Spring"))
		{
 
			if(moneyInMyAccount>30000)
			{
				System.out.println("Let's go on a vacation.");
			}
			else
			{
				System.out.println("I need to save more.");
			}
		}
		
	}

}
