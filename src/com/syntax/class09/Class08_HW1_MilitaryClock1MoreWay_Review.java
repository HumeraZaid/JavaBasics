package com.syntax.class09;

public class Class08_HW1_MilitaryClock1MoreWay_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a digital clock using nested loops.
		 * If you can, try to have a clock that would show 2 digits for hour and 2 digits for minutes.
		 */

		for (int h=0;h<24;h++)
		{
			for(int m1=0;m1<=5;m1++)
			{
				for(int m2=0;m2<=9;m2++)
				{
					if(h<10)
					{
						System.out.println("0" + h + ":" + m1 + m2);
					}
					else
					{
						System.out.println(h + ":" + m1 + m2);
					}

					}
				
			}
		}
	}

}
