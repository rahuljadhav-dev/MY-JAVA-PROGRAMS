package com.string.tasks4;
import java.util.*;

public class Task2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.nextLine();
		 int count = 0;
	        for (int i = 0; i < str.length() - 1; i++) {
	            if (str.substring(i, i + 2).equals("hi")) {
	                count++;
	            }
	        }
	        System.out.println(count);
	       
		
			
	}

}
