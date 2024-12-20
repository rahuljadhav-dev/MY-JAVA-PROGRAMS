package comparable.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Call {
	public static void main(String[] args) {
		ArrayList<Animal>an=new ArrayList<Animal>();
		Animal a1=new Animal("Lion", 3);
		Animal a2=new Animal("Elephant", 6);
		Animal a3=new Animal("Tiger", 2);
		Animal a4=new Animal("Zebra", 4);
		Animal a5=new Animal("Monkey", 2);
		Animal a6=new Animal("Bear", 3);
		Animal a7=new Animal("Deer", 2);
		Animal a8=new Animal("Giraffe", 7);
		an.add(a1);
		an.add(a2);
		an.add(a3);
		an.add(a4);
		an.add(a5);
		an.add(a6);
		an.add(a7);
		an.add(a8);
		Collections.sort(an);
		System.out.println(an);
		
	} 
	

}
