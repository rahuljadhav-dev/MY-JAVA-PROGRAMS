package com.demo;

public class PalindromeString {
	public static boolean isPalindrome(String string) {
		String reversed="";
		for (int i = string.length()-1; i >=0 ; i--) {
			reversed+=string.charAt(i);
		}
		if(string.equalsIgnoreCase(reversed)) {
			return true;
		}else
			return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("Madamss"));
	}

}
