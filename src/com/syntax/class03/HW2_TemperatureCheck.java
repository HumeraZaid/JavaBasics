package com.syntax.class03;

public class HW2_TemperatureCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a Java program and name it TemperatureCheck. Create a variable to 
		 * store the temperature. Your program should check if temperature is below 32, than
		 * it should print "Water will freeze with temperature _", otherwise "Water will
		 * NOT freeze with temperature _".
		 */

		double temp=41;
		
		if(temp<32)
		{
			System.out.println("Water will freeze with temperature.");
		}
		else
		{
			System.out.println("Water will NOT freeze with temperature.");
		}
		
	}

}
