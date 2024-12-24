package com.demo;

public class RemoveWhiteSpaces {
	public static String removeWhiteSpaces(String str) {
		String pure="";
	for (int i = 0; i < str.length(); i++) {
		if(!Character.isWhitespace(str.charAt(i))) {
			pure+=str.charAt(i);
		}
	}
	return pure;
		
	}
	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces("hey my name is rahul jadhav   122"));
	}

}
