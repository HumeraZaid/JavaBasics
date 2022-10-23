package com.syntax.class14;

public class HW3_Palindrome {
	
	/*
	 * Create a method that will print whether a given String is palindrome or not.
	 */
	
	boolean isPalindrome(String a)
    {
        StringBuilder b = new StringBuilder(a);
        if(a.equalsIgnoreCase(b.reverse().toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
       
        HW3_Palindrome pd = new HW3_Palindrome();
        String a = "Syntax";
		if(pd.isPalindrome(a))
        {
            System.out.println( a + " is a palindrome string.");
        }
        else
        {
            System.out.println(a + " is not a palindrome string.");
        }


    }

	
	

	
}
