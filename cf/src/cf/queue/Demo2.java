package cf.queue;

import java.util.ArrayDeque;

public class Demo2 {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(40);
		ad.add(30);
		ad.add(20);
		ad.add(50);
		ad.addLast(20);
		ad.addFirst(10);
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
	}

}
