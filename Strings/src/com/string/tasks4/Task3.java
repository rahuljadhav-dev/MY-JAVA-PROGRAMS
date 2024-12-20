package com.string.tasks4;
import java.util.*;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hi :");
		String h=sc.next();
		boolean flag=true;

		for (int i = 0; i < h.length() - 2; i++) {
			if (h.charAt(i) == 'b' && h.charAt(i + 2) == 'b') {
				System.out.println(flag);
				break;
			}else
				System.out.println(!flag);
			break;
				
				
		}
		










	}

}
