package com.polymorphism.tasks;

public class TicketBook {
	public void Show() {
		System.out.println("Choose type do you want Silver/Gold/Platinum :");
		
	}
	
	public void Show(String type) {
		String a="Platinum";
		String b="Silver";
		String c="Gold";
		
		if(type==b) {
			System.out.println("Price :"+" 150");
		}else if(type==a) {
			System.out.println("Price :"+" 300");
		}else
			System.out.println("Price :"+" 200");
		
		System.out.println(type+" Now choose how many tickets :");
	}
	
	public void Show(int num) {
		System.out.println(num);
		if(num>100) {
			System.out.println("Limit Reached");
		}
	}
}
