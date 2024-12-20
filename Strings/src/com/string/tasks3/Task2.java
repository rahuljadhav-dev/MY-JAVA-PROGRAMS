package com.string.tasks3;
import java.util.*;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password :");
		StringBuffer pw=new StringBuffer(sc.next());
		int a=pw.indexOf("@");
		System.out.println(pw.delete(a, pw.length()));
		
	}

}
