package cf.map;

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		HashMap<String, Integer>map=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		map.put("Mango",600);
		map.put("Banana",40);
		map.put("Apple",120);
		map.put("Kiwi",350);
		map.put("Papaya",100);
		System.out.println("Enter the name of fruit :");
		String fruit=sc.next();
		if(map.containsKey(fruit)) {
			System.out.println(map.get(fruit));
		}else
			System.out.println("Free");
		
	}

}
