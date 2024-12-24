package com.demo;

public class SumOfOddArray {
	public static int sumOfOdd(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,9,1,2,3};
		System.out.println(sumOfOdd(arr));
	}

}
