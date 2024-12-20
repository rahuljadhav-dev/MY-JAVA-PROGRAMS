package com.tasks.acc;

public class Account {
	public int accno;
	private int password;
	
	public int getAccno() {
		return accno;
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setAccno(int accno) {
		this.accno=accno;
		System.out.println(accno);
	}
	
	public void setPassword(int password) {
		this.password=password;
		System.out.println(password);
	}


}
