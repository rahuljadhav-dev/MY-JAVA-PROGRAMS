package com.demo;

public class PalindromeNumber {
	public static boolean status(int number) {
		int temp=number;
		int reversed=0;
		while(number>0) {
			reversed=reversed*10+number%10;
			number/=10;
		}
		if(reversed==temp) {
			return true;
		}else
			return false;
	}
	public static void main(String[] args) {
		System.out.println(status(1212));
	}

}
