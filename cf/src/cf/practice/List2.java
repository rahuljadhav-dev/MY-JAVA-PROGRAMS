package cf.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List2 {
	public static void main(String[] args) {
		List<String>names=new LinkedList<String>();
		names.add("Rahul");
		names.add("ROhit");
		names.add("Kunal");
		names.add("Ashu");
		names.add("Shubham");
		names.add("Nikhil");
		names.add("Omkar");
		Collections.sort(names);
		System.out.println(names);
				
	}

}
