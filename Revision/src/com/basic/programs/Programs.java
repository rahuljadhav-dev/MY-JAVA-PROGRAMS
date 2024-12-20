package com.basic.programs;

public class Programs {
	public static void main(String[] args) {
		int a=90;
		int b=50;
		int c=30;
		if(a>b && b>c) {
			System.out.println(a+" is maximum");
		}
		else if(a<b && b>c) {
			System.out.println(b+" is maximum");
		}
		else
			System.out.println(c+" is maximum");

		int d=90;
		int e=10;
		int f=30;
		if(d<e && e<f) {
			System.out.println(d+" is minimum");
		}
		else if(d>e && e<f) {
			System.out.println(e+" is minimum");
		}
		else
			System.out.println(f+" is minimum");
		
		int i=1;
		int num=13;
		int count=0;
		do {
			System.out.println(num+"X"+i+"="+(num*i));
			count+=(num*i);
			i++;
			
		}
		while(i<=10);
		System.out.println(count);
		if((num*i)%2==0) {
			System.out.println((num*i)+"are even numbers");
		}
		else
			System.out.println((num*i)+"are odd numbers");
		
		int arm=153;
		int temp=arm;
		int st=0;
		int ans=0;
		while(arm!=0) {
			st=arm%10;
			arm/=10;
			ans+=st*st*st;
			
		}
		if(ans==temp) {
			System.out.println(temp+" is armstrong number ");
		}else
			System.out.println(temp+" is not armstrong number ");
		
		
	
		
		
	}
}




