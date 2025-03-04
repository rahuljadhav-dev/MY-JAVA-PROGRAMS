package com.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateArray {
	
	public static int[] rotate(int arr[],int k) {
		int left=0;
		int right=arr.length-k;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		return arr;
		
	}
	
	public static List<Integer> rotateUsingCf(int k){
		ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(4,5,6,7,8,9));
		
		Collections.rotate(list, k-1);
		return list;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {5,6,7,8,9,1,4,3,2};
		System.out.println(Arrays.toString(rotate(arr, 5)));
		System.out.println(rotateUsingCf(5));
	}

}
