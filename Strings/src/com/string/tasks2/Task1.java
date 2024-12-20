package com.string.tasks2;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter your id :");
        String id=s.next(); 
        String regex = "[\\@ \\.]";
        String[] myArray = id.split(regex);
        System.out.println("Domain :"+myArray[1]);
       
	}

}
