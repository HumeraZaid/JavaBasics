package com.syntax.class08;

public class CW1_SumOfEvenNumbersAndSumOfOddNumbers_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// From the range of 1 to 50, please find sum of all even and all odd numbers
		
		int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) 
        {
            if (i % 2 == 0) 
            {
                sumEven += i;
            } 
            else 
            {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
	}
}

