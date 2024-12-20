package com.threads.task2;

public class Kunal extends Thread{
	Radio r;
	public Kunal(Radio r) {
		this.r=r;
		
		
	}
	@Override
	public void run() {
		r.play(94.7f);
	
	}

}
