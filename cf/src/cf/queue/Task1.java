package cf.queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String>names=new LinkedList<String>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter names :");
			names.add(sc.next());
		}
		System.out.println(names);
	}

}
