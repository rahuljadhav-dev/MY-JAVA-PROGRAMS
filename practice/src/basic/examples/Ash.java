package basic.examples;
import java.util.*;
public class Ash {
	public static void main(String[] args) {
		float a=2.0f;
		float b=3.0f;
		float c=4.0f;
		float d=5.0f;
		a=a+b+c+d;
		b=a-(b+c+d);//14-12=2 now b is 2
		c=a-(b+c+d);//14-11=3 now c is 3
		d=a-(b+c+d);//14-10=4 now d is 4
		a=a-(b+c+d);//14-9=5 now a is 5
		System.out.println("The value of a is"+"="+a);
		System.out.println("The value of b is"+"="+b);
		System.out.println("The value of c is"+"="+c);
		System.out.println("The value of d is"+"="+d);
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Maths Marks :");
		int math=sc.nextInt();
		
		System.out.println("Enter Your Science Marks :");
		int science=sc.nextInt();
		
		System.out.println("Enter Your English Marks :");
		int english=sc.nextInt();
		
		float avg=(math+science+english)/3f;
		if(avg>=40 && math>=33 && science>=33 && english>=33) {
			System.out.println("You Are Passed The Subject "+avg+"%");
		}else
			System.out.println("You are Failed The Subject "+avg+"%");
		
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		int d1=sc.nextInt();
		double sum=a1+b1+c1+d1;
		double multiply=a1*b1*c1*d1;
		double division=a1/b1/c1/d1;
		double substract=a1-b1-c1-d1;
		System.out.println("a1 + b1 + c1 + d1" + "=" + (sum));
		System.out.println("a1 * b1 * c1 * d1" + "=" + (multiply));
		System.out.println("a1 / b1 / c1 / d1" + "=" + (division));
		System.out.println("a1 - b1 - c1 - d1" + "=" + (substract));
		if(sum!=0) {
			System.out.println("You are Awesome");
		}else if(division>substract){
			System.out.println("Yo Yo Honey Singhhhh!");
		}else
			System.out.println("sab kuch badhiya");
		Scanner tax=new Scanner(System.in);
		System.out.println("Enter Your Income :");
		
		float slot=tax.nextFloat();
		if(slot>2.5&&slot<5.0) {
			System.out.println("5% Tax");
		}else if(slot>5.0&&slot<10.0) {
			System.out.println("20% Tax");
		}else if(slot>10.0) {
			System.out.println("30% Tax");
		}
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Your Income :");
		float income=sc1.nextFloat();
		float tax1=0.0f;
		if(income<2.5f) {
			tax1=tax1+0;
		
		}
		else if(income>2.5f&&income<=5.0f) {
			tax1= tax1 + 0.05f * (income-2.5f);
		}
		else if(income>5.0f&&income<=10.0f) {
			tax1=tax1+0.05f*(income-2.5f);
			tax1=tax1+0.2f*(income-5.0f);
		}
		else if(income>10.0f) {
			tax1=tax1+0.05f*(income-2.5f);
			tax1=tax1+0.2f*(income-5.0f);
			tax1=tax1+0.3f*(income-2.5f);
		}
		System.out.println(tax1);
		
		
		
		int number=13;
		if(number%2==0) {
			if(number+1>number) {
				System.out.println("Its not prime number");
			}
		}else
			System.out.println("Its prime number");
		}
		
	}


