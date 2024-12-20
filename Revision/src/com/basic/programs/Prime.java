package com.basic.programs;

public class Prime {
	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<100;i++) {
			count=1;
			for(int j=0;j<100;j++) {
				count++;
			}
			if(count==2) {
				System.out.println(count);
			}
		}
		
	}

}
