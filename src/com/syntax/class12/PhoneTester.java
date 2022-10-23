package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * If the class whose object we are creating is present in the same package, we don't need to import it.
		 */
		
		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "iPhone 14 Pro Max";
		iphone.year = 2022;
		iphone.storage = 128;
		iphone.makeCall();
		
		Phone samsungPhone =  new Phone();
		samsungPhone.make = "Samsung";
		samsungPhone.model = "S22 Ultra";
		samsungPhone.year = 2022;
		samsungPhone.makeCall();
	}

}
