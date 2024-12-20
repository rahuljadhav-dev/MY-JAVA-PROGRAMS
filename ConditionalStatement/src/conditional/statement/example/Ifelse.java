package conditional.statement.example;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		//Program No.1-Take a input as a number if the number range between 1-10 then output is valid if less than 0 then valid
		//but greater than 10 invalid
		int n=15;
		boolean ignore=true;
		if(n>=1 && n<=10) {
			System.out.println("Valid ");
		}else if(n>10) {
			System.out.println("Invalid");
		}else if(n<1&&ignore) {
			System.out.println("Valid");
		}

		//Program No.2-		
		int a=1;
		int b=9;
		int sum=a+b;
		if(a>=13||b<=19) {
			System.out.println("19");
		}else if(b>=13||b<=19) {
			System.out.println("19");
		}else
			System.out.println(sum);

		//Program No.3-Take three inputs(numbers) such as 1 2 3 then print sum if 1 1 2 then ignore same number and print 2
		//if the all numbers are same like 1 1 1 then print 0.
		int x=12;
		int y=11;
		int z=12;
		int sum1=x+y+z;
		if(x==y && y==z && x==z ) {
			System.out.println(x+ " " +y+ " " +z+ " = " + "0");

		}else if(x!=y && y!=z && x!=z) {
			System.out.println(x+ " " +y+ " " +z+ " = " +sum1);

		}else if(x==y && y!=z && z!=x) {
			System.out.println(x+ " " +y+ " " +z+ " = " +z);

		}else if(x!=y && y!=z && z==x) {
			System.out.println(x+ " " +y+ " " +z+ " = " +y);

		}else if(x!=y && y==z && z!=x) {
			System.out.println(x+ " " +y+ " " +z+ " = " +x);
		}

		//Program No.4-Take three Numbers and print the greater number		
		int A=100;
		int B=400;
		int C=50;
		if(A<B && B>C) {
			System.out.println(B+" Is Greater Number");
		}else if(A>B && C<A ){
			System.out.println(A+" Is Greater Number");

		}else if(A<B && A<C) {
			System.out.println(C+" Is Greater Number");
		}

		//Program No.5-Take three numbers and prit the smaller number		
		int A1=11;
		int B1=40;
		int C1=12;
		if(A1>B1 && B1<C1) {
			System.out.println(B1+" Is Smaller Number");
		}else if(A1<B1 && C1>A1 ){
			System.out.println(A1+" Is Smaller Number");

		}else if(A1>B1 && A1>C1) {
			System.out.println(C1+" Is Smaller Number");
		}

		//Extra programs 		
		int num=-2;
		if(num%2==0 && num>0) {
			System.out.println(num+" is positive and even number");
		}else if(num%2!=0 && num>0) {
			System.out.println(num+" is positive and odd number");
		}else if(num<0) {
			System.out.println(num+" is negative number");
		}

		//Ex-1
		char ch='A';
		char ch1='B';
		char ch2='C';

		if(ch=='A') {
			System.out.println("Apple");
		} if(ch1=='B'){
			System.out.println("Ball");
		}if(ch2=='C') {
			System.out.println("Cat");
		}else
			System.out.println("None!");

		//Ex-2
		int x1=3;
		if(x1%2==0) {
			System.out.println("The Number Is Even");
		}else
			System.out.println("The Number Is Odd");

		//Ex-3
		short area=100;
		short area2=10;
		if(area>=100) {
			System.out.println("Bigcircle");
		}if(area>=10) {
			System.out.println("Smallcircle");
		}else
			System.out.println("0");
		//Prob.1 check the number and give the output the number single digit or double digit or multi digit

		int a1=560;

		if(a1<=9 && a1>=-9) {
			System.out.println("Single Digit");
		}else if(a1<=99 && a1>=-99) {
			System.out.println("Double Digit");
		}else if(a1>99 || a1<-1)
			System.out.println("Multi Digit");

		else {
			System.out.println("Invalid");
		}
		//prob.2
		short marks=88;
		if(marks>=35 && marks<60) {
			System.out.println("Grade C");

		}else if(marks>60 && marks<75) {
			System.out.println("Grade B");

		}else if(marks>=75 && marks<=100) {
			System.out.println("Grade A");
		}else
			System.out.println("Failed/invalid");

		//prob.3
		int x11=2000;
		int y1=2300;
		if(x11<y1) {
			System.out.println(x11 + " Is Smaller Number");
		}else
			System.out.println(x11 + " Is Greater Number");

		//prob.4

		int num1=15;;
		if(num1 % 2==0 ) {
			System.out.println(num1+" Is Even number");
		}else if(num1 % 2!=0) {
			System.out.println(num1+" Is odd Number");
		}else if(num1==0) {
			System.out.println("Its Zero");
		}
		char Symbol='*';
		if(Symbol=='A'||Symbol=='E'||Symbol=='I'||Symbol=='O'||Symbol=='U'||
				Symbol=='a'||Symbol=='e'||Symbol=='i'||Symbol=='o'||Symbol=='u') {
			System.out.println("vowels");

		}else if(Symbol=='@'||Symbol=='#'||Symbol=='$'||Symbol=='%'||Symbol=='&'||Symbol=='%'||Symbol=='*') {
			System.out.println("Special Symbols");

		}else if(Symbol=='0'||Symbol=='1'||Symbol=='2'||Symbol=='3'||Symbol=='4'||
				Symbol=='5'||Symbol=='6'||Symbol=='7'||Symbol=='8'||Symbol=='9') {
			System.out.println("These are numbers");
		}else
			System.out.println("Consonants");

		System.out.println("Enter Your Score :");
		Scanner sc=new Scanner(System.in);
		int PassingMarks=sc.nextInt();
		if(PassingMarks>=50) {
			System.out.println("Congratulations! You Have Passed The Course");
		}else
			System.out.println("Sorry You Have Failed The Course");

	}



}



