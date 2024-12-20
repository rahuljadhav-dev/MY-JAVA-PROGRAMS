package com.threads.task2;

public class Play {
	public static void main(String[] args) {
		Radio obj=new Radio();
		Rahul r=new Rahul(obj);
		Bhagyashree b=new Bhagyashree(obj);
		Kunal k=new Kunal(obj);
		r.start();
		b.start();
		k.start();
		
	}

}
