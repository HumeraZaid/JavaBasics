package com.syntax.reviewclass04;

public class ForLoopDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print  1 3 7 9
		
		for(int i=1;i<=9;i+=2)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		
		for(int i=1; i<=9; i+=2)
		{
			if(i!=5) 
			{
			continue;
			}
			System.out.println(i);
		}
	}

}
