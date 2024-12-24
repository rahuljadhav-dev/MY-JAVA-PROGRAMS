package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NumberToWord {
	public static void numberToWord(int number) {
		Map<Integer, String>word=new HashMap<Integer, String>();
		word.put(1, "one");
		word.put(2, "two");
		word.put(3, "three");
		word.put(4, "four");
		word.put(5, "five");
		word.put(6, "six");
		word.put(7, "seven");
		word.put(8, "eight");
		word.put(9, "nine");
		word.put(0, "zero");
		int digit = 0;
		StringBuilder result=new StringBuilder();
		

			while(number>0) {
				digit=number%10;
				result.insert(0, word.get(digit)+" ");
				number/=10;
				
			}
			System.out.println(result.toString().trim());
		
		}
	
	public static void main(String[] args) {
		numberToWord(889008);
	}

}
