package com.syntax.reviewclass02;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Explicit/External/Narrowing/Manual
		
		short largerBox=129; // As we cannot fit 129 in a byte, we will get wrong results.
		byte smallerBox=(byte)largerBox;
		System.out.println(smallerBox);
		
		// Explicit/External/Narrowing/Manual
		
		int largerBox1=129; // As we can fit 129 in short, we will get proper results.
		short smallerBox1=(short)largerBox1;
		System.out.println(smallerBox1);
		
		// Implicit/Internal/Widening/Automatic
		
		short smallerBox2=45;
		long largerBox2=(long)smallerBox2;
		System.out.println(largerBox2);
		
	}

}
