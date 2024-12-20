package cf.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		LinkedList<String> planet=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter planet name :");
			planet.add(sc.next());
		}
		for(int i=planet.size()-1;i>=0;i--) {
			System.out.println(i);
//			if(planet.get(i).contains("r")||planet.get(i).contains("R"))
//			planet.remove(i);
			System.out.println(planet);
		}
		System.out.println(planet);
	
	}

}
