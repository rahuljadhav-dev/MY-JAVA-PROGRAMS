package com.problems.strings;

import java.util.Arrays;

public class MissingNumber {
	
	public static int missinNumber(int arr[]) {
		int n=arr.length+2;
		int expectedSum=n*(n+1)/2;
		int sum=0;
		
		Arrays.sort(arr);
		for (int i : arr) {
			sum+=i;
		}
		return expectedSum-sum;
	}
	
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,9};
		System.out.println(missinNumber(arr));
	}

}
