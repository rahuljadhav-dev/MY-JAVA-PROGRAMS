package com.threads.task2;

public class Radio {
	public synchronized void play(float freq) {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("playing radio "+freq);
				Thread.sleep(2000);
			}
			
		} catch (Exception e) {
		
		}
		

	}


}
