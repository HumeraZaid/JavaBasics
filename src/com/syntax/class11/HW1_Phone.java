package com.syntax.class11;

public class HW1_Phone {
	
	/*
	 * Create a Class “Phone”. 
	 * Create 3 Objects of it: iPhone, Pixel, Samsung with specific attributes and behaviors.
	 */
	
	String name;
	String make;
	String model;
	String color;
	int storage;
	double size;
	
	void recieveUpdates()
	{
		System.out.println(" is receiving updates.");
	}
	
	void downloadApps()
	{
		System.out.println(" is downloading apps from the Google Play Store.");
	}
	
	void takeVideos()
	{
		System.out.println(" is taking videos and applying filters.");
	}
	
	public static void main(String[] args) {
		
		HW1_Phone Phone1 = new HW1_Phone();
		Phone1.name="iPhone";
		Phone1.make = "Apple";
		Phone1.model = "13";
		Phone1.color = "Space Gray";
		Phone1.size = 6;
		Phone1.storage = 128;
		
		System.out.print(Phone1.make + " " + Phone1.name + " " + Phone1.model + " of " + Phone1.color + 
				        " color, display size - " + Phone1.size + " inches, and storage " +  Phone1.storage + " GB,");
		Phone1.recieveUpdates();
		
		System.out.println();
		
		HW1_Phone Phone2 = new HW1_Phone();
		Phone2.name="Pixel";
		Phone2.make = "Google";
		Phone2.model = "6";
		Phone2.color = "Stormy Black";
		Phone2.size = 6.2;
		Phone2.storage = 256;
		
		System.out.print(Phone2.make + " " + Phone2.name + " " + Phone2.model + " of " + Phone2.color + 
				        " color, display size - " +	Phone2.size + " inches, and storage " +  Phone2.storage + " GB,");
		Phone2.downloadApps();
		
		System.out.println();
		
		HW1_Phone Phone3 = new HW1_Phone();
		Phone3.name= "Galaxy";
		Phone3.make = "Samsung";
		Phone3.model = "S22 Ultra";
		Phone3.color = "Phantom White";
		Phone3.size = 6.8;
		Phone3.storage = 512;
		
		System.out.print(Phone3.make + " " + Phone3.name + " " + Phone3.model + " of " + Phone3.color + 
				        " color, display size - " +	Phone3.size + " inches, and storage " +  Phone3.storage + " GB,");
		Phone3.takeVideos();
	}

}
