package com.overriding.ex;

public class Even extends Odd{
	public void Odd(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+b+c);
	}

}