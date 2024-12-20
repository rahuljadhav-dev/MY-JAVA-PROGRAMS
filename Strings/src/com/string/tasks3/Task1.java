package com.string.tasks3;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email id :");
		String id=sc.next();
		int b=id.lastIndexOf("@");
		System.out.println(id.substring(0, b));
		
		
		
		
	
	}

}
