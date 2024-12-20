package com.string.tasks;
import java.util.*;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your city name :");
		String city1=sc.next();
		System.out.println("Enter your Friends city name :");
		String city2=sc.next();
		System.out.println(city1.equals(city2));
	}

}
