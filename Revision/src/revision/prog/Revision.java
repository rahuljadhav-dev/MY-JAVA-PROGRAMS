package revision.prog;
import java.util.*;
public class Revision {
	public static void main(String[] args) {
//		int a=0;
//		int b=10;
//		int c=20;
//		String Select="Even";
//		switch(Select) {
//		case "Table":
//			for(int i=1;i<=10;i++) {
//				a=b*i;
//				System.out.println("Table of "+b+" is"+"="+a);
//			}
//		case "Factorial":
//			for(int j=1;j<=c;j++) {
//				a*=j;
//			}
//			System.out.println(a);break;
//		case "Range":
//			for(int k=b+1;k<=c;k++){
//				a+=1;
//				System.out.println(k);
//			}
//			System.out.println("The rage of "+b+" & "+c+" ="+a);
//		case "Alphabets":
//			for(char l='A';l<='Z';l++) {
//				System.out.print(l+" ");
//			}
//		case "Even":
//			for(int m=1;m<=150;m++) {
//				if(m%2==0) {
//					System.out.println(m);
//				a+=1;
//				}
//			}
//			System.out.println(a);
//		}
		System.out.println("Enter The Number Do You Want To Check :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a=sc.nextInt();
		System.out.println("Enter Second Number :");
		int b=sc.nextInt();
		int add=0;
		for(int i=a;i<b;i++) {
			add++;
			//System.out.println(i);
		}
		System.out.println("The Range "+a+" To "+b+" is :"+add);
		int age=15;
		char age1='a';
		switch(age1) {
		case 'a':
			if(age>=18) 
				System.out.println("You Are Eligibile For Vote");
			
			else
				System.out.println("Sorry! You Are Not Eligible For Vote");break;
		default:System.out.println("Something Went Wrong");
		}
	}

}
