package com.string.tasks;
import java.util.*;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mail id :");
		String id=sc.next();
		System.out.println(id.indexOf("@"));
	}
}
