package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAndEvenInArray {
	public static List giveOddofArray(int[] arr) {
		List<Integer>odd=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				odd.add(arr[i]);	
			}
		}
		return odd;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println(giveOddofArray(arr));
	}

}
