package cf.map;

import java.util.HashMap;

public class Task2 {
	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(101,"Kunal");
		map.put(102, "Rohan");
		map.put(103, "Rohit");
		map.put(104, "Vikas");
		map.put(104, "Nikhil");
		if(map.containsKey(12)) {
			System.out.println("12 is assigned roll number to any student ");
		}else
			System.out.println("12 is not assigned as roll number to any student");
		
	}

}
