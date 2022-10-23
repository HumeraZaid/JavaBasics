package com.syntax.class10;

public class CW2_2DArrayShorterWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array(shorter way) in which first array will consist of 4 names and
		 * second array will contain grades. Then your program should print name of the students
		 * that has A and B grade.
		 */
		
		String [][] names= {
						   {"Zaid", "Humera", "Zahra", "Shelia"}, 
						   { "A", "B", "C", "D"}
						   };
		System.out.println(names[0][0] + " has grade " + names[1][0] + "\n" + names[0][1] + " has grade "
							 + names[1][1]);	
	}

}
