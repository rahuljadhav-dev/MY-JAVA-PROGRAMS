package com.demo;

public class SumOfDigit {
	public static int sumOfDigit(int digit) {
		int sum=0;
		while(digit>0) {
			sum+=digit%10;
			digit/=10;	
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Sum:"+sumOfDigit(12345));
	}

}
