package com.syntax.class06;

public class SwitchDemo2 {
	
	public static void main(String[] args)
	{
		
		// matching cases must be of same data type as a variable in switch
        // no duplicated case in switch
        // Y y
		
		char choice='K';
		String answer;
		
		switch(choice)
		{
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="May be";
			break;
		default:
			answer="Unknown";
			break;
		}
		
		System.out.println(answer);
		
		/* 
		 * Limitations of SWITCH CASE:
		 * Switch case CANNOT use logical operators.
		 * Switch case CANNOT use relational operators.
		 * Switch case CANNOT work with boolean values.
		 * CE: CANNOT switch on a value of type boolean.
		 * boolean boo=true;
		     switch(boo)
		       {
		       
		       }
		 * CANNOT work with long, float, double.
		 */
		
			
			
	}

}
