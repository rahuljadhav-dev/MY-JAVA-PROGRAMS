package com.problem_solving;

import java.util.Arrays;

public class FourSum {
	public static void fourSum(int arr[],int target) {
		Arrays.sort(arr);
		int n=arr.length;
		for (int i = 0; i < n-3; i++) {
			for (int j = i+1; j < n-2; j++) {
				int left=j+1;
				int right=n-1;
				
				while(left<right) {
					int sum=arr[i]+arr[j]+arr[left]+arr[right];
					if(sum==target) {
						System.out.println("Four Paired :"+arr[i]+" "+arr[j]+" "+arr[left]+" "+arr[right]+" For Target :"+target);
						return;
						/* break; */
					}else if(sum<target) {
						left++;
					}else {
						right--;
					}
				}
			}
		}
		System.out.println("No valid pair found");
	}
	public static void main(String[] args) {
		int arr[]= {6,5,9,7,4,3,1,11};
		int target=28;
		fourSum(arr, target);
	}
	

}
