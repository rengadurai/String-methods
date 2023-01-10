package com.onesoft.day3;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		
		String name = "Raja,Ram,Mohan,Roy";
		String[] names = name.split(",");
		
		System.out.println(names[0]);
		System.out.println(names[1] + " " + names[2] + " " + names[3]);
		
		String sentence = "javaAisHa@coding#language";
		System.out.println(sentence);
		String[] words = sentence.split("[A-Z@#,]");
		System.out.println(Arrays.toString(words));
		
	}

}