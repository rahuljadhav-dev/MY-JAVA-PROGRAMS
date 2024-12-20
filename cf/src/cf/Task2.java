package cf;

import java.util.Scanner;
import java.util.TreeSet;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet <Integer>t=new TreeSet<Integer>();
		for(int i=0;i<10;i++) {
			System.out.println("Enter marks :");
			t.add(sc.nextInt());	
		}
		System.out.println(t.descendingSet());
		
		
	}

}
