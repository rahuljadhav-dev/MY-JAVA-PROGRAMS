package com.string.tasks4;
import java.util.*;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter :");
		String str=sc.nextLine();
		boolean flag=true;
		for(int i=0;i<str.length()-1;i++) {
			if (str.charAt(i) == 'x' && str.charAt(i + 2) == 'y' && str.charAt(i+3)=='z') {
				System.out.println(flag);
				break;
			}
		}
		
		System.out.println(!flag);
		

	}

}
