package com.demo;

public class VowelsFromStrings {
	public void findVowels(String str) {
		boolean isVowel=false;
		for (int i = 0; i < str.length(); i++) {
			//regex
			if(str.toLowerCase().matches(".*[aeiou].*")) {
				isVowel=true;
			}
		}
		if(isVowel) {
			System.out.println("Vowels are present in the string");
		}else
			System.out.println("vowels are not present in the string");
	}
	public static void main(String[] args) {
		VowelsFromStrings strings= new VowelsFromStrings();
		strings.findVowels("Zgfh");
	}

}
