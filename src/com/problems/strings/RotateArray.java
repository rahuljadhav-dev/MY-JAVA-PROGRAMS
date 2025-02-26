package com.problems.strings;

import java.util.Arrays;

public class RotateArray {
	
	public static void rotateArray(int arr[],int n) {
		int index=n;
		for (int i = n; i <n ; i++) {
			arr[index]=arr[i];
			i--;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,9};
		rotateArray(arr, 2);
	}
	

}
