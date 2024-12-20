package com.threads.practice;

public class Table extends Thread{
	@Override
	public void run() {
		int num=10;
		for(int i=1;i<=10;i++) {
			System.out.println(num+"X"+i+"="+(num*i));
		}
		
	}
}
