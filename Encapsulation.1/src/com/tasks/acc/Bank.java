package com.tasks.acc;

public class Bank {
	public static void main(String[] args) {
		Account call=new Account();
		call.setAccno(1234);
		call.setPassword(445676);
		call.getAccno();
		call.getPassword();
		System.out.println("This is your account number :"+call.getAccno());
		System.out.println("This is your password :"+call.getPassword());
	}

}
