//Accept names of 5 planets and remove the all planets that contain r
//"r" or "R" in their name.
package cf.queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayDeque <String> ad=new ArrayDeque<String>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter planet name :");
			String planet=sc.next();
			if(planet.contains("r")||planet.contains("R")) {
//				ad.remove(planet);
			
			}else
				ad.add(planet);
		}
		System.out.println(ad);


	}

}
