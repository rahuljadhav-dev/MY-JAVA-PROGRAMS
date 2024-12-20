package com.threads.task2;

public class Rahul extends Thread{
	Radio r;
	public Rahul(Radio r) {
		this.r=r;
		
	}
	@Override
	public void run() {
		r.play(98.3f);
	}

}
