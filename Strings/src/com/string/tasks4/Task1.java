package com.string.tasks4;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter :");
		String x=sc.next();
		if(x.contains(".")) {
			int a=x.lastIndexOf(".");
			String b=x.substring(0,a);
			System.out.println(b.contains("xyz"));
		}
		else
			System.out.println(x.contains("xyz"));
		
	}

}
