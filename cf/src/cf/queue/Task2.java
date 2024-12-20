// Accept names of 10 fruits. Store in arraydeque. All fruits starts 
//with A should be stored in the top.
package cf.queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayDeque <String> ad=new ArrayDeque<String>();
		for(int i=0;i<10;i++) {
			System.out.println("Enter fruit name :");
			String f=sc.next();
			if(f.startsWith("a")||f.startsWith("A")) {
				ad.addFirst(f);
			
			}else
				ad.add(f);
		}
		System.out.println(ad);


	}

}
