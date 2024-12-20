package cf;

import java.util.Scanner;
import java.util.TreeSet;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet <String>t=new TreeSet<String>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter friend name :");
			t.add(sc.next());
			
		}
		System.out.println(t);
		
		
	}
}
