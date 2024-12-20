package cf;

import java.util.Scanner;
import java.util.TreeSet;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet <String>t=new TreeSet<String>();
		t.add("Apple");
		t.add("Mango");
		t.add("Pineapple");
		t.add("Banana");
		t.add("Kiwi");
		System.out.println("Enter the fruit name do you want delete :");
		String name=sc.next();
		System.out.println(t.remove(name));
		System.out.println(t);
		
	}

}
