package com.problem_solving;

import java.util.Arrays;

public class FiveSum {
	public static void fiveSum(int arr[],int target) {
		Arrays.sort(arr);
		int n=arr.length;
		for (int i = 0; i < n-4; i++) {
			for (int j = i+1; j < n-3; j++) {
				for (int k = j+1; k < n-2; k++) {
					int left=k+1,right=n-1;
					while(left<right) {
						int sum=arr[i]+arr[j]+arr[k]+arr[left]+arr[right];
						if(sum==target) {
							System.out.println("Pair Found :"+arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[left]+" "+arr[right]);
							return;
						}else if(sum<target) {
							left++;
						}else {
							right--;
						}
					}
				}
			}
		}
		System.out.println("No Pair Found....");
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 25;
        fiveSum(arr, target);
	}

}
