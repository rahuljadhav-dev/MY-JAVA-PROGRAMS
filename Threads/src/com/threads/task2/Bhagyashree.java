package com.threads.task2;

public class Bhagyashree extends Thread{
	Radio r;
	public Bhagyashree(Radio r) {
		this.r=r;
	
	}
	@Override
	public void run() {
		r.play(91.1f);
	}

}
