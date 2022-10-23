package com.syntax.class03;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHungry=false;
		
		if(isHungry)
		{
			System.out.println("Let's eat something yummy.");
		}
		
		if(3>2)
			System.out.println("There is a true statement inside parenthesis.");
		
		double myBankBalance=2000;
		double theAmountThatIWantToTransfer=2500;
		
		if(myBankBalance>theAmountThatIWantToTransfer)
			System.out.println("Funds transferred successfully.");
		else
			System.out.println("Please try again. Not enough balance.");
	}

}
