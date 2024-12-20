package com.string.tasks3;
import java.util.*;

public class Task3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter password :");
		String pw=s.nextLine();
		String a=pw.replaceAll("[^0-9]", " ");
		String c=a.valueOf(a);
		int d=Integer.parseInt(c);
	
		System.out.println(d+3);
	


	}

}
