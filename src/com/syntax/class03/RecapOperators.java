package com.syntax.class03;

public class RecapOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Addition =>+
		 * Subtraction => -
		 * Multiplication => *
		 * Division => /
		 * Modulus => %
		 */

		
		int number1=9;
		int number2=2;
		
		System.out.println(number1/number2); //dividing number1 by number2
		
		double number3=9;
		double number4=2;
		
		System.out.println(number3/number4); //dividing number3 by number4
		
		float number5=1.0F;
		float number6=3.0F;
		
		System.out.println(number5/number6); //dividing number5 by number6
		
		double number7=1.0F;
		double number8=3.0F;
		
		System.out.println(number7/number8); //dividing number7 by number8
		
		double number9=9;
		double number10=2;
		System.out.println(number9%number10); //mod number9 by number10
		
		System.out.println("Answer = " +number1/number2); // Division is prioritized
		System.out.println("Remainder = " +number1%number2); // Modulus is prioritized
		

	
	}

}