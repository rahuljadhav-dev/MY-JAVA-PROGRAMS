package com.abstract4.Calculator;
import java.util.*;


public class Operations implements Maths {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();

	@Override
	public int Addition() {
		int sum=a+b;
		return sum;
	}

	@Override
	public int Multiplication() {
		int mul=a*b;
		return mul;
	}

	@Override
	public int Division() {
		int div=a/b;
		return div;
	}

	@Override
	public int Substraction() {
		int sub=a-b;
		return sub;
	}
	



}
