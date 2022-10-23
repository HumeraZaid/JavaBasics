package com.syntax.class09;

public class CW2_Group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Create an array of names and store all names of your group.
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 */
		
		System.out.println("First way to do it:");
		
		String[] groupMember=new String[10];
		
		groupMember[0]="Asma";
		groupMember[1]="Athira";
		groupMember[2]="Humera";
		groupMember[3]="Kenny";
		groupMember[4]="Muhammed Ilyas";
		groupMember[5]="Nergis";
		groupMember[6]="Priyasri";
		groupMember[7]="Sara";
		groupMember[8]="Tymur";
		groupMember[9]="Vidya";
		
		System.out.println(groupMember[2]);	
		
		System.out.println();
		System.out.println("Second way to do it:");
		
		
		String[] groupMemberNames= {"Asma", "Athira", "Humera", "Kenny", "Muhammed Ilyas", "Nergis", "Priyasri", 
								"Sara", "Tymur", "Vidya"};
		
		System.out.println(groupMemberNames[2]);
				
		}
				
	}

