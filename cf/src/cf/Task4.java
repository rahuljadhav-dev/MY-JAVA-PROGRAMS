package cf;

import java.util.Scanner;
import java.util.TreeSet;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet <String>t=new TreeSet<String>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter names :");
			t.add(sc.next());
		}
		if(t.contains("pen")) {
			System.out.println("Pen is found in bag...");
		}else
			System.out.println("Pen is not found in bag...");
		
	}

}
