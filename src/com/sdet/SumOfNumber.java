package com.sdet;

import java.util.Scanner;

public class SumOfNumber {
	
	public static int sumOfNumber(int num) {
			int sum=0;
			if(num<0 || num==0) {
				System.out.println("The Number is Negative/Zero");
				return 0;
			}
			
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			return sum;
	}
	
	public static void main(String[] args) {
		try (Scanner scanner=new Scanner(System.in)){
			System.out.println("Enter Number");
			int number=scanner.nextInt();
			System.out.println("The Sum Of Your Number Is :"+sumOfNumber(number));
			
		} catch (Exception e) {
			System.out.println("Number Should Be Integer...");
		}
	}

}
