package com.threads.practice;
import java.util.*;

public class Array extends Thread{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		int num[]=new int[10];
		for(int i=0;i<num.length;i++) {
			System.out.println("Enter number :");
			num[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
		
	}

}
