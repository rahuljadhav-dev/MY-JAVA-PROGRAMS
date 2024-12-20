package com.overriding.ex;

public class Reach {
	public static void main(String[] args) {
		Extra c=new Extra();
		c.Cat();
		c.Dog();
		Even call=new Even();
		call.Odd(1, 3, 5);
		call.a=5;
		call.b=6;
		call.c=9;
		
		
		
		
		
	}

}
