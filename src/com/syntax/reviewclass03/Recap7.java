package com.syntax.reviewclass03;

public class Recap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean programmer=true;
		boolean manualTester=false;
		boolean knowFramework=true;
		
		if(programmer)
		{
			if(manualTester)
			{
				if(knowFramework)
				{
					System.out.println("You can be an automation engineer");
				}
				else
				{
					System.out.println("You need to know framework as well");
				}
			}
			else
			{
				System.out.println("You need to know Manual testing as well");
			}
		}
		else
			{
				System.out.println("You need to be a programmer as well");
				
			}
	}

}
