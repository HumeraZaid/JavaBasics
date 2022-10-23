package com.syntax.class11;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	
	void call()
	{
		System.out.println("Calling...");
	}
	
	void takePicture()
	{
		System.out.println("Taking pictures");
	}
	
	public static void main(String[] args) {
		// Name of Class variable name = new Name of Class();
		
		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "Iphone 14 Pro Max";
		iphone.color = "Black";
		iphone.storage = 128;
		iphone.size = 6.8;
		iphone.cheap = false;
		
		System.out.println("Make " + iphone.make + " Model " + iphone.model);
		iphone.call();
		
		System.out.println("***********************");

		Phone samsung = new Phone();
		samsung.make = "Samsung";
		samsung.model = "S22 Ultra";
		samsung.color = "Grey";
		samsung.storage = 256;
		samsung.size = 6.7;
		samsung.cheap = false;
		
		System.out.println((iphone.make));
		
		System.out.println(samsung.make);
	}
}
