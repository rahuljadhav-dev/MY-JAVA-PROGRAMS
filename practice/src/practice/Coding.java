package practice;
import java.util.*;

public class Coding {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter You Age : ");
		int ageforvote=sc.nextInt();
		if(ageforvote>=18) {
			System.out.println("You Are Eligible For Vote");
		}else
			System.out.println("You Are Not Eligible For Vote");

		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Year :");
		int year=Sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year.");
				} else {
					System.out.println(year + " is not a leap year.");
				}
			} else {
				System.out.println(year + " is a leap year.");
			}
		} else {
			System.out.println(year + " is not a leap year.");

		}

		int Calculate=2024;
		System.out.println(Calculate % 4);
		System.out.println(Calculate % 100);
		System.out.println(Calculate % 400);
		int numm=10;
		for(int i=1; i>numm; i++) {
			System.out.println(i);
		}
		
	}


}
