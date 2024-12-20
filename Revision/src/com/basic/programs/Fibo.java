package com.basic.programs;

public class Fibo {
	public static void main(String[] args) {
		int range=10;
		int num1=0;
		int num2=1;
		int num3;
		for(int i=0;i<range;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}

}
