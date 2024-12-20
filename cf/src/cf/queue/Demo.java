package cf.queue;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(25);
		ll.add(7);
		ll.add(78);
		ll.add(108);
		ll.add(4);
		System.out.println(ll);
		LinkedList<Integer> copy=(LinkedList<Integer>)ll.clone();//type casting 
		System.out.println(copy);
		System.out.println(ll.indexOf(25));
		System.out.println(ll.indexOf(7));
		System.out.println(ll.indexOf(78));
		System.out.println(ll.indexOf(108));
		System.out.println(ll.indexOf(4));
		System.out.println(ll.indexOf(77));
//		ll.remove(108);
		System.out.println(ll);//java.lang.IndexOutOfBoundsException
		//so thats why 
		Integer i=new Integer(108);
		ll.remove(i);
		System.out.println(ll);
		
		
		
		

	}

}
