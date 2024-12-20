package practice;
import java.util.*;

public class Aajshikvalel {
	public static void main(String[] args) {

		//		System.out.println("Enter Your Name :");
		//		Scanner s=new Scanner(System.in);
		//		String b=s.next();
		//		System.out.println("enter your age :");
		//		int a=s.nextInt();
		//		System.out.println("enter your salary");
		//		long c=s.nextLong();
		//		System.out.println("enter your gender");
		//		String k=s.next();
		//		System.out.println("name : "+b);
		//		System.out.println("age  : "+a);
		//		System.out.println("salary :"+c);
		//		System.out.println("gender :"+k);
		//		
		//	

		int n1=0,n2=1,n3,fibo=10;
		int sum=0;
		//System.out.print(n1+" "+n2);
		for(int i1=0;i1<fibo;++i1)   
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;   
			sum+=n3;
			System.out.println("sum of fibo :"+sum);
		
		
		}
	}

}
