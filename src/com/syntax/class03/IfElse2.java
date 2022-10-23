package com.syntax.class03;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double money=5;
		double kfcBurger=11;
		
		if(money>kfcBurger) 
		{
			System.out.println("Yayy, I can enjoy a burger.");
		}

		else
		{
			System.out.println("I should make something at home.");
		}
		
		if(false)
		{
			System.out.println("If block");
		}
		
		else
		{
			System.out.println("Else block");
		}
		
		boolean isHungry=true;
		
		if(isHungry)
		{
			System.out.println("Let's eat something yummy.");
		}
		
		else
		{
			System.out.println("Let's watch and do some coding from YouTube");
		}
	}

}
