package com.onesoft.day3;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "sowmiya";
		String partOfTheString = name.substring(0,3); 
		String secondPart  = name.substring(3);
		int len = name.length();
		String halfString = name.substring(0,len/2);
		String halfString2 = name.substring(len/2);
		
		System.out.println(partOfTheString);
		System.out.println(secondPart);
		System.out.println(halfString + " " + halfString2);
		
		

		
	}

}
