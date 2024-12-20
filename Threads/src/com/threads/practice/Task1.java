package com.threads.practice;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			int count=0;
			System.out.println("Enter number :");
			arr[i]=s.nextInt();
			count=count*10+arr[i]%10;
			arr[i]/=10;
			System.out.println(count);
		}
		
	}

}
