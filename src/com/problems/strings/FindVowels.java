package com.problems.strings;

import java.util.Scanner;

public class FindVowels {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String names[]=new String[5];
		try {
			for (int i = 0; i < names.length; i++) {
			System.out.println("Enter your name :");
			names[i]=scanner.nextLine();
		}
			
		} catch (Exception e) {
			System.out.println("Please enter valid string");
		} 
		
		
		for (String string : names) {
			if(string.matches(".*[aeiou].*")) {
				System.out.println("Vowels found :"+string);
			}
		}
	
	}

}
