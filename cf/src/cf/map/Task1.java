package cf.map;

import java.util.HashMap;

public class Task1 {
	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(101,"Kunal");
		map.put(102, "Rohan");
		map.put(103, "Rohit");
		map.put(104, "Vikas");
		map.put(104, "Nikhil");
		if(map.containsValue("Rohan")) {
			System.out.println("Rohan is present in the batch ");
		}else
			System.out.println("Rohan is not present in the batch");
	}

}
