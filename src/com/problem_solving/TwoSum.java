package com.problem_solving;

public class TwoSum {
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8};
		int elements[]=new int[arr.length];
		int target=9;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>target) {
				System.out.println("Target is greater than element");
				break;
			}
			for (int j = i+1; j < arr.length; j++) {
				sum=arr[i]+arr[j];
				if(sum==target) {
				System.out.println(i+" "+j);
				}
			}
		}
		
		
	}
	
	

}
