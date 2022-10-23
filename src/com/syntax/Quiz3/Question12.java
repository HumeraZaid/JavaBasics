package com.syntax.Quiz3;

public class Question12 {
	
	public static void main(String[] args) {

	       String word ="abrakadabra";

	      String replace=word.replaceAll("[^aAeEiIoOuU]", "");

	      System.out.println(replace);
	}

}
