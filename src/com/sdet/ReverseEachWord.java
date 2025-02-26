package com.sdet;

public class ReverseEachWord {
	public static String reverseEachWord(String str) {
		if(str==null || str==" ") {
			return "String Should Not Blank Or Null";
		}
		String reverse="";
		
		for (String words:str.split(" ")) {
			StringBuilder builder=new StringBuilder(words+" ");
			reverse+=builder.reverse();
		}
		
		return reverse.trim();
	}
	
	public static String reverseStringAnotherApproach(String str) {
		if(str==null || str.equals(str.isEmpty())) {
			return "String Should Be Contain Some Content";
		}
		
		StringBuilder builder=new StringBuilder();
		String words[]=str.trim().split("\\s+");
		for (String w : words) {
			builder.append(new StringBuilder(w).reverse()).append(" ");
		}
		
		return builder.toString().trim();
	}
	public static void main(String[] args) {
		String str=" Hey how are you";
		System.out.println(reverseEachWord(str));
		System.out.println(reverseStringAnotherApproach(str));
	}

}
