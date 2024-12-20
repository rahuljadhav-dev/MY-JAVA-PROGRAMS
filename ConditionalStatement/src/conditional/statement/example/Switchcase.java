package conditional.statement.example;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte Month=sc.nextByte();
		switch(Month) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("Sept");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("december");
			break;
		}
		
		////Task No.1
		Scanner number=new Scanner(System.in);
		System.out.println("Enter Number :");
		int a=number.nextInt();
		switch(a%2) {
		case 0:System.out.println("This is even number");
		break;
		case 1:System.out.println("This is odd number");
		break;
		}
		
		//Task No.2
		System.out.println("Enter Number :");
		int b=number.nextInt();
		switch(b) {
		case 0:System.out.println("This is zero");
		break;
		default:System.out.println("This Non-Zero");
		}
		
		//Task No.3
		char ch='a';
		switch(ch) {
		case 'a':System.out.println("Vowels");break;
		case 'e':System.out.println("Vowels");break;
		case 'i':System.out.println("Vowels");break;
		case 'o':System.out.println("Vowels");break;
		case 'u':System.out.println("Vowels");break;
		default:System.out.println("Consonant");
		}
		
		//Task no.4
		Scanner math=new Scanner(System.in);
		System.out.println("Enter first number x=");
		int x=math.nextInt();
		System.out.println("Enter first number y=");
		int y=math.nextInt();
		System.out.println("Enter what do want add/sub/mul/div/mod :");
		String operation=math.next();
		System.out.println("This is your final answer=");
		switch(operation) {
		case "add":System.out.println(x+y);break;
		case "sub":System.out.println(x-y);break;
		case "mul":System.out.println(x*y);break;
		case "div":System.out.println(x/y);break;
		case "mod":System.out.println(x%y);break;
		default:System.out.println("invalid!");
		}
		
		//Task No.5
		Scanner dayNo=new Scanner(System.in);
		System.out.println("Enter number :");
		byte day=dayNo.nextByte();
		switch(day) {
		case 1:System.out.println("The day is sunday");break;
		case 2:System.out.println("The day is monday");break;
		case 3:System.out.println("The day is tuesday");break;
		case 4:System.out.println("The day is wednesday");break;
		case 5:System.out.println("The day is thursday");break;
		case 6:System.out.println("The day is friday");break;
		case 7:System.out.println("The day is saturday");break;
		default:System.out.println("Notfound");break;
		}
		
		//Task No.6
		Scanner yearno=new Scanner(System.in);
		System.out.println("Enter Year Number :");
		int year=yearno.nextInt();
		switch(year) {
		case 1:System.out.println("Jan");break;
		case 2:System.out.println("Feb");break;
		case 3:System.out.println("Mar");break;
		case 4:System.out.println("Apr");break;
		case 5:System.out.println("May");break;
		case 6:System.out.println("June");break;
		case 7:System.out.println("July");break;
		case 8:System.out.println("Aug");break;
		case 9:System.out.println("Sept");break;
		case 10:System.out.println("Oct");break;
		case 11:System.out.println("Nov");break;
		case 12:System.out.println("Dec");break;
		}
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int p=Sc.nextInt();
		System.out.println("Enter Second Number :");
		int q=Sc.nextInt();
		String nu="check";
		switch(nu) {
		case "check":	if(p>q) 
			System.out.println(p+" is maximum number");
		else if(p==q)
			System.out.println(p+" and "+q+" are same numbers");
		else
			System.out.println(p+" is minimum number");
		break;

		}

		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age=sc1.nextInt();
		String verify="eligibility";
		switch(verify) {
		case "eligibility":
			if(age>=18)
				System.out.println("You Are Eligible For Vote!");
			else 
				System.out.println("You Are Not Eligible For Vote!");
			break;
		default:System.out.println("Invalid Info");
		}
		
		// swapping numbers
		int a11=12;
		int b11=10;
		a11=a11+b11;
		b11=a11-b11;
		a11=a11-b11;
		System.out.println("a="+a11);
		System.out.println("b="+b11);
		
		//ques.1
		int x1=14891;
		int number1=x1%10;
		switch(number1) {
		case 0:System.out.println("Zero");break;
		case 1:System.out.println("one");break;
		case 2:System.out.println("two");break;
		case 3:System.out.println("three");break;
		case 4:System.out.println("four");break;
		case 5:System.out.println("five");break;
		case 6:System.out.println("six");break;
		case 7:System.out.println("seven");break;
		case 8:System.out.println("eight");break;
		case 9:System.out.println("nine");break;
		default:System.out.println("Invalid");

		}
		
		//ques.2
		int numm=265;
		int x11=numm%10;
		int	y11=numm/10;
		int z11=y11%10;
		System.out.println(x11+z11);

		//ques.3		
		int a1=11;
		int b1=24;
		int a2=a1%10;
		int b2=b1/10;
		int sum=a2+b2;
		System.out.println(sum);
		
		//ques.4
		int c1=114;
		int c2=c1/10;
		int c3=c1%10;
		if(c2>c3) {
			System.out.println("unit place is greater than tens place");
		}
		else if(c2==c3) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("unit place is less than tens place");
		}
		
		//ques.5
		char call='C';
		switch(call) {
		case'C':System.out.println("PI X r X r");
		break;
		case 'T':System.out.println("1/2 X b X h");
		break;
		case 'R':System.out.println("L X B");
		break;
		default:System.out.println("End");
		}

	}

}

