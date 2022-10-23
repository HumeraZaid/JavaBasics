package com.syntax.class14;

public class HW6_PrimeNumber {
	
	/*
	 * Write a method to return whether a given number is prime or not?
	 */
	
	void isPrime(int num) {
        for (int a = 2; a < num; a++) {
            if (num % a == 0 && num > 1) {
                System.out.println(num + " is not a prime number.");
                break;
            } else {
                System.out.println(num + " is a prime number.");
                break;
            }
        }
    }

        public static void main(String[] args)
        {
          HW6_PrimeNumber pn = new HW6_PrimeNumber();
          pn.isPrime(4);
        }


}
