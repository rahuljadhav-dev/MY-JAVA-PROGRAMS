package com.demo;

import java.util.HashSet;

public class DistinctCharacterInString {
	public static void distinctChars(String str) {
		HashSet<Character>strings=new HashSet<>();
		
		for (int i = 0; i < str.length(); i++) {
			strings.add(str.charAt(i));
		}
		
		System.out.println(strings);
		System.out.println(strings.size());
	

	}
	public static void main(String[] args) {
		distinctChars("arjadhav");
	}

}
