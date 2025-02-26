package com.adt;

import java.util.Arrays;
import java.util.Scanner;

//array must be sorted
public class BinarySearch {
	public static int binarySearch(int arr[],int target) {
		int low=0;
		int high=arr.length-1;
 
		while(low<=high) {

			int mid=low+(high-low)/2;

			if(arr[mid]==target) {
				return mid;
			}

			if(target<arr[mid]) {
				high=mid-1;
			}

			if(target>arr[mid]) {
				low=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		ArrayADT a=new ArrayADT(8);

		Scanner sc=new Scanner(System.in);

		int arr[]=new int[8];

		System.out.println("Enter Number Upto :"+arr.length);

		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(binarySearch(arr, 7));
		System.out.println(arr);

	}

}


