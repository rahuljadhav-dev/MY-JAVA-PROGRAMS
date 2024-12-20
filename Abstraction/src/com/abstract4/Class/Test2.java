package com.abstract4.Class;

public class Test2 extends Test1 {
	int x,y,z;

	@Override
	public void add(int a,int b) {
		x=a;
		y=b;
		
	}

	@Override
	public void show() {
		 z=x+y;
		
		
	}

	@Override
	public void display() {
		System.out.println("the sum is :"+z);
	
		
	}

}
