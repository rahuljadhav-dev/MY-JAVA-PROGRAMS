package com.problems.strings;

public class DuplicateCharacters {
	
	public static void duplicateChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if(Character.isAlphabetic(str.charAt(i))) {
					if(str.charAt(i)==str.charAt(j)) {
						System.out.println(str.charAt(i));
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		String str="Rahul Jadhav ";
		duplicateChars(str);
	}

}
