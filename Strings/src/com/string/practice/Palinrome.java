package com.string.practice;

public class Palinrome {
	public static void main(String[] args) {
		String str="abc";
		boolean flag=true;
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag=false;
				break;
			}
			i++;
			j--;
		}
		System.out.println(str);
		if(flag==true) {
			System.out.println("Palindrome!");
		}else
			System.out.println("Not palindrome");
	
	}

}
