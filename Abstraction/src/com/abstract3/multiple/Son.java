package com.abstract3.multiple;

public class Son implements Father,Mother {

	@Override
	public void show() {
		System.out.println("I am Father");	
	}

	@Override
	public void show1() {
		System.out.println("I am mother");
		
		
	}
	


}
