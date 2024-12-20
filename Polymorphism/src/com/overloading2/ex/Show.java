package com.overloading2.ex;

public class Show {
	public static void main(String[] args) {
		Student3 s=new Student3();
		s.showInfo(null);
		s.showInfo(123);
		s.showInfo(18, 142);
	}

}
