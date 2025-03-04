package com.problem_solving;

import java.util.Arrays;

public class RemoveDuplicateStringFromArray {
	public static int removeDuplicateString(String str[]) {
		Arrays.sort(str);
		int left=0;
		for (int right = 1; right < str.length; right++) {
			if(!str[right].equals(str[left])) {
				left++;
				str[left]=str[right];
			}
		}
		return left+1;
	}
	
	public static void main(String[] args) {
		String str[]= {"rahul","ashu","shubh","ashu","rahul","nikhil","amit","sumit","omkar","shubh","rahul"};
		int i=removeDuplicateString(str);
//		System.out.println(Arrays.toString(str));
		for (int j = 0; j < i; j++) {
			System.out.print(str[j]+" ");
			
		}
	}

}
