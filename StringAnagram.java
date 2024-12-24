package com.demo;

import java.util.Arrays;

public class StringAnagram {
	public static boolean isAnagram(String a, String b) {
		char[] chars1=a.toCharArray();
		char[] chars2=b.toCharArray();
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		boolean flag=false;
		
		if(a.length()!=b.length()) {
			flag=false;
		}
		
		for (int i = 0; i < chars2.length; i++) {
			if(chars1[i]==chars2[i]) {
				flag=true;
			}else
				flag=false;
		}
		return flag;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("act", "tca"));
	}

}
