package com.onesoft.day3;

public class StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Rengadurai";
		int index = name.indexOf("a");
		int index1 = name.indexOf("ai");
		char char1 = name.charAt(5);
		char firstLetter = name.charAt(0);
		char lastLetter = name.charAt(name.length()-1);
		
		String name1 = "DineshKumar";
		char firstLetter1 = name1.charAt(0);
		char lastLetter1 = name1.charAt(name.length()-1);
		
		System.out.println("index= " + index + " index1= " + index1);
		System.out.println("charAt= " + char1);
		System.out.println("FirstLetter= " + firstLetter + " lastLetter= " + lastLetter);
		System.out.println("FirstLetter= " + firstLetter1 + " lastLetter= " + lastLetter1);

	}

}
