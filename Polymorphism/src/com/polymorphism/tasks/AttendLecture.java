package com.polymorphism.tasks;

public class AttendLecture {
	public void Info() {
		System.out.println("Type of attend the Lecture :");
	}
	
	public void Info(String ltype,String name,boolean t,boolean f) {
		String a="Online";
		String b="Offline";
		String c="Recording";
		if(ltype==a) {
			System.out.println(name+" is doing "+ltype+" Lecture. Status :"+t);
		}else
			System.out.println(name+" is doing "+ltype+" Lecture. Status :"+f);
		
	}
	
	public void Info(String name,boolean t,boolean f,String ltype) {
		String a="Online";
		String b="Offline";
		String c="Recording";
		if(ltype==b) {
			System.out.println(name+" is doing "+ltype+" Lecture. Status :"+t);
		}else
			System.out.println(name+" is doing "+ltype+" Lecture. Status :"+f);
		
	}
	
	public void Info(String name,boolean t,String ltype, boolean f) {
		String a="Online";
		String b="Offline";
		String c="Recording";
		if(ltype==c) {
			System.out.println(name+" is doing "+ltype+" Lecture. Status :"+t);
		}else
			System.out.println(name+" is doing "+ltype+" Lecture. Status :"+f);
		
	}
	
	
	public void Info(int hr) {
		System.out.println("Spending :"+hr+" hrs for lecture");
	}

}
