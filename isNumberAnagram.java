package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class isNumberAnagram {
	
	public static void isAnagram(long num1,long num2) {
		List<Long>one=new ArrayList<Long>();
		List<Long>two=new ArrayList<Long>();
		long digit=0;
		while(num1>0) {
			digit=num1%10;
			one.add(digit);
			num1/=10;
		}
		
		while(num2>0) {
			digit=num2%10;
			two.add(digit);
			num2/=10;
		}
		
		
		Collections.sort(one);
		Collections.sort(two);
		
		if(one.size()==two.size()) {
			if (one.equals(two)) {
				System.out.println("Number is anagram");
				
			}else
				System.out.println("Number is not anagram");
			
		}else
			System.out.println("No anagrams");
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		isAnagram(121, 1342);
	}

}
