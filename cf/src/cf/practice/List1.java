package cf.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(50);
		list.add(150);
		Collections.sort(list);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.contains(260));
		list.iterator();
		System.out.println(list);
		List<Integer>list2=new ArrayList<Integer>();
		list2.add(250);
		list2.add(70);
		list2.add(300);
		list2.add(175);
		System.out.println(list2.size()+" Before");
		list2.addAll(list);
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println(list2.size()+" After");
		
		for(int i:list2) {
			if(i%2==0) {
				System.out.println("Even Numbers :"+i);
			}else
				System.out.println("Odd Numbers :"+i);
		}
	}

}
