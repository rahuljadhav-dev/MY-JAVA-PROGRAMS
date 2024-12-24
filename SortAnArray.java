package com.demo;

public class SortAnArray {
	public void sortMe(int[] arr) {
		int n=arr.length;
		
		for (int i = 0; i < n-1; i++) {
			boolean flag=false;
			
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
			
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {2,5,4,7,9,0,1};
		SortAnArray array=new SortAnArray();
		array.sortMe(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
