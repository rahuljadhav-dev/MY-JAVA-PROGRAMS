package demo.info;

import java.util.Scanner;

public class Calculator2 {
	Scanner sc=new Scanner(System.in);
	int sum;
	int mul;
	int sub;
	int div;
	int mod;

	public void Add() {
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		sum=a+b;
		System.out.println("Addition :"+sum+"\n");
	}

	public void Min() {
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		sub=a-b;
		System.out.println("Substraction :"+sub+"\n");
	}

	public void Mul() {
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		mul=a*b;
		System.out.println("Multiplication :"+mul+"\n");
	}

	public void Div() {
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		div=a/b;
		System.out.println("Division :"+div+"\n");
	}

	public void Mod() {	
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		mod=a%b;
		System.out.println("Modulo :"+mod+"\n");
	}


}
