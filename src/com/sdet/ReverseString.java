package com.sdet;

public class ReverseString {
	public static StringBuilder reverseMyString(String str) {
		StringBuilder builder=new StringBuilder();
		char chars[]=str.toCharArray();
		for (int i = chars.length-1; i >=0; i--) {
			builder.append(chars[i]);
		}
		
		return builder;
	}
	
	public static String reverseAnotherApproach(String str) {
		if(str==null) {
			return "String should not null";
		}
		
		return new StringBuilder(str).reverse().toString();
		
	}
	public static void main(String[] args) {
		String name="hey how are you";
		System.out.println(reverseMyString(name));
		System.out.println(reverseAnotherApproach(name));
	}

}
