package com.adt;

import java.util.Scanner;

public class LinearSearch {
	public static void searchElement(int arr[],int target) {
		for (int i = 0; i < arr.length; i++) {
//			if(target>arr[i]||target<arr[i]) {
//				System.out.println("Not Found..");
//				break;
//			}
			
			if(arr[i]==target) {
				System.out.println("Target Found at index :"+i);
				break;
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[8];
		System.out.println("Enter Number Upto :"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		searchElement(arr, 4);
	}

}
