package com.demo;

public class FibonacciSeries {
	public static void fibonacciSeries(int range) {
		System.out.println("Fibonacci Series :"); 
		int a=0;
		int b=1;
		int c;
		
		for (int i = 0; i < range; i++) {
			a=a+b;
			b=a-b;
			c=b;
			System.out.print(c+" ");
		}
		
	}
	public static void main(String[] args) {
		fibonacciSeries(10);
	
	}

}
