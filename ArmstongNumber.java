package com.demo;

public class ArmstongNumber {
	public static boolean isArmstrong(int number) {
		int temp=0;
		int i=number;
		int sum=0;
		while(number>0) {
			temp=number%10;
			sum+=temp*temp*temp;
			number/=10;
		}
		if(sum==i) {
			System.out.println(sum);
			return true;
		}else
			System.out.println(sum);
			return false;
			
	}
	
	public static void main(String[] args) {
		System.out.println(isArmstrong(154));
	}
	

}
