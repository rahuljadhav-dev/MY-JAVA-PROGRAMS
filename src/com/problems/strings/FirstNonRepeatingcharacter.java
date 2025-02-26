package com.problems.strings;

public class FirstNonRepeatingcharacter {
	public static int firstUniqChar(String s) {
		
	    for (int i = 0; i < s.length(); i++) {
	        boolean isUnique = true;
	        for (int j = 0; j < s.length(); j++) {
	            if (i != j && s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)) {
	                isUnique = false;
	                break;
	            }
	        }
	        if (isUnique) return i;
	    }
	    return -1;
	}

	public static void main(String[] args) {
		String str="aavV";
		
		System.out.println(firstUniqChar(str));
	}

}
