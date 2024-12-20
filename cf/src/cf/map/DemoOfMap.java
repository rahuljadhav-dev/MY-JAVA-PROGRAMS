package cf.map;

import java.util.HashMap;
import java.util.Map;

public class DemoOfMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Rahul");
		map.put(2, "Kunal");
		map.put(3, "Rohit");
		map.put(4, "Vikas");
		map.put(5, "Yash");
		System.out.println(map.containsKey(5));//it checks the key of map and returns boolean.
		System.out.println(map.containsValue("Rahul"));//it checks the value of map returns boolean.
		System.out.println(map.get(3));//it gives the value of map according to the key if i enter the key as 1 it returns rohit.
		System.out.println(map.getOrDefault(1, "java"));//it gives the key value
		System.out.println(map.getOrDefault(12, "Rahul"));//it gives the value cause its in the map
		System.out.println(map.getOrDefault(33, "java"));//it gives the java cause key is not presented in map and also the value
		System.out.println(map.keySet());//it gives only keys of the map
		System.out.println(map.values());//it gives only values of map
		System.out.println(map.entrySet());//it is same as print map
		System.out.println(map.remove(1));//it remove the value assigned to key and also the key is remove from the map 
		System.out.println(map.remove(1,"Rahul"));//same as above 
		System.out.println(map.clone());//it gives the copy of map
		System.out.println(map.replace(2, "Rahul"));//it replace the value of key 
		System.out.println(map);
		
	}

}
