package com.syntax.class10;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] countries= {
							  {"Usa", "Canada"},   // 1st array with index 0
							  {"Peru", "Brazil", "Colombia", "Ecuador"},  // 2nd array with index 1
							  {"Ethiopia", "Egypt", "Kenya"},
							  {"Germany", "Turkiye", "Moldova", "Ukraine"},
							  {"Kazakhstan", "Afghanistan", "Korea"}
							  };
		System.out.println("------ Getting all values from 2D array using for each loop--------");
		
		for(String[] country:countries)
		{
			for(String c:country)
			{
				if(c.equals("Kazakhstan"))
				{
					System.out.print(c + " is my home country ");
				}
				else
				{
				System.out.print(c + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println(countries.length);  // 5 - total number of arrays or rows
		
		int elofarr1=countries[0].length;
		System.out.println("# of elements from array 1 = " + elofarr1);
		
		int elofarr2=countries[1].length;
		System.out.println("# of elements from array 2 = " + elofarr2);		
	}

}
