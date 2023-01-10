package com.onesoft.day3;

public class StringEquals {

	public static void main(String[] args) {
		
		String name = "Sriram";
		String name1 = new String("sriram");
		
		boolean value1 = name.equals(name1);
		boolean value2 = name.equalsIgnoreCase(name1);
		boolean value3 = name.contains("sr");
		boolean value4 = name.startsWith("Sr");
		boolean value5 = name.endsWith("am");
		int value6 = name.length();
		
		
		System.out.println(value1 + " " + value2 + " " + value3 + " " +
				value4 + " " + value5);
		System.out.println("The length of " + name + " is= " + value6);
			
		
	}

}
