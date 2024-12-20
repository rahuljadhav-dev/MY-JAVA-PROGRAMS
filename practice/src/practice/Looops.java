package practice;
import java.util.*;

public class Looops {
	public static void main(String[] args) {
		System.out.println("Checking Number :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int x=sc.nextInt();
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				System.out.println("Not Prime");
				System.exit(1);
			}
		}
		System.out.println("Prime");
		
	}


}

