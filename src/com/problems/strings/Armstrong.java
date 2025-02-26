package com.problems.strings;

public class Armstrong {
	public static boolean armstrong(int num) {
		int temp=num;
		int i=0;
		int m=0;
		while(num>0) {
			i=num%10;
			num/=10;
			m+=i*i*i;
			System.out.println(i);
		}
		System.out.println(i);
		System.out.println(num);
		
		if(temp==m) {
			return true;
		}else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(armstrong(153));
	}

}
