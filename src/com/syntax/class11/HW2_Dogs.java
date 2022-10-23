package com.syntax.class11;

public class HW2_Dogs {
	
	/*
	 * Create a Dog Class and create 3 different objects of it:
	 * Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	 */

	String name;
	String breed;
	String color;
	int age;
	double weight;
	
	void wagTail()
	{
		System.out.println(" is wagging his tail and running around.");
	}
	void play()
	{
		System.out.println(" is playing with frisbee disc in the park.");
	}
	void walk()
	{
		System.out.println(" has gone for a morning walk.");
	}
	
	public static void main(String[] args) {
		
		HW2_Dogs dog1 = new HW2_Dogs();
		dog1.name = "Thor";
		dog1.breed = "Siberian Husky";
		dog1.color = "brown";
		dog1.age = 6;
		dog1.weight = 45;
		
		System.out.print("The dog named " + dog1.name + ", of the " + dog1.breed + " breed, " + dog1.color + 
				" in color, " + dog1.age + " years old, " + "who weighs " + dog1.weight + " lbs,");
		dog1.wagTail();
		
		System.out.println();
		
		HW2_Dogs dog2 = new HW2_Dogs();
		dog2.name = "Maggie";
		dog2.breed = "British Bulldog";
		dog2.color = "white";
		dog2.age = 8;
		dog2.weight = 40;
		
		System.out.print("The dog named " + dog2.name + ", of the " + dog2.breed + " breed, " + dog2.color + 
				" in color, " + dog2.age + " years old, " + "who weighs " + dog2.weight + " lbs,");
		dog2.play();
		
		System.out.println();
		
		HW2_Dogs dog3 = new HW2_Dogs();
		dog3.name = "Charlie";
		dog3.breed = "Labrador";
		dog3.color = "black";
		dog3.age = 5;
		dog3.weight = 37;
		
		System.out.print("The dog named " + dog3.name + ", of the " + dog3.breed + " breed, " + dog3.color + 
				" in color, " + dog3.age + " years old, " + "who weighs " + dog3.weight + " lbs,");
		dog3.walk();
	}
	
}
