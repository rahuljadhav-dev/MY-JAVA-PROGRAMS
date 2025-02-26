package com.problems.strings;
public class DistinctSum {

	public static boolean perfectNumber(int n) {
		int sum=0;
		for (int i = 1; i <n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum==n;
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <=5000; i++) {
			if (perfectNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}
}



