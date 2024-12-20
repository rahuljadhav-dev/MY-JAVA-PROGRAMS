package com.string.tasks;
import java.util.*;

public class Task3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name :");
	String name=sc.next();
	System.out.println("Enter middle name :");
	String middle=sc.next();
	System.out.println("Enter last name :");
	String last=sc.next();
	System.out.println(name.concat(" "+middle). concat(" "+last));
}
}
