package com.syntax.reviewclass02;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean studyHard=true;
		if(studyHard)
		{
			System.out.println("We get the job in first few weeks.");
			boolean communicationSkills=true;
			if(communicationSkills)
			{
				System.out.println("We might get a job in Apple, Amazon, etc.");
			}
			else
			{
				System.out.println("We need to work on our communication skills.");
			}
		}
		else
			{
				System.out.println("It might take longer to get a job.");
			}

	}

}
