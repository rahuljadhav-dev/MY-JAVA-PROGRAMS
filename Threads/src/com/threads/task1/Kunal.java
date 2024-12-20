package com.threads.task1;

public class Kunal extends Thread{
	@Override
	public void run() {
		try {
			
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				Thread.sleep(2000);;
			}
			
		} catch (Exception e) {
		
		}
		
	}
	

}
