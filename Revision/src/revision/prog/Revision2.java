package revision.prog;
import java.util.*;
public class Revision2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose What Do You Want:Time/Palindrome/PrimeNumber");
		String call=sc.next();

		switch(call) {
		case "Time":System.out.println("This is your time :");
		int hr=2;
		int min=6;
		int sec=40;
		int time=(hr*3600)+(min*60)+sec;
		System.out.println(time+"secs");
		int time1=hr%3600;
		int time2=min%60;
		int time3=min/60;
		int time4=time1+time3;
		System.out.println(time4+"hr "+time2+"min "+sec+"sec");break;
		case "Palindrome":System.out.println("Palindrome number checking :");
		int number1=435;
		int count1=0;
		int rev1=number1;
		do {
			count1=count1*10+number1%10;
			number1/=10;
		}
		while(number1>0);
		if(count1==rev1) 
			System.out.println(rev1+" is palindrome");

		else
			System.out.println(rev1+" is not palindrome");break;
		case "PrimeNumber":System.out.println("Prime number checking :");
		int num=17;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println(num+" is not prime");
				System.exit(1);
			}
		}
		System.out.println(num+" is prime");break;
		default:System.out.println("Invalid!");
		}

		int i=1;
		int k=21;
		int Table=12;
		int temp=0;
		do {
			System.out.println(Table+" X "+i+"="+(Table*i));
			i++;

		}
		while(i<=10);

		int number2=57;
		int count2=0;
		if(number2%2==0) {
			System.out.println("Even number");
		}
		else
			System.out.println("Odd number");

		int number3=555;
		int mod=number3%10;//8
		int div=number3/10;//57
		int div1=div%10;//7
		int div2=div/10;//5
		System.out.println(mod);
		System.out.println(div1);
		System.out.println(div2);
		if(mod!=div1 && mod!=div2) {
			System.out.println(div1+div2+mod);

		}else if(mod==div1&&mod==div2) {
			System.out.println("0");

		}else
			System.out.println(mod);

		int TableNo=12;
		int multiplication=0;
		int count3=0;
		for(int ii=1;ii<=10;ii++) {
			count3=i;
			System.out.println(TableNo+"x"+ii+"="+(TableNo*ii)+" Count is "+count3);
		}
		
		int rangeNo1=13;
		int rangeNo2=45;
		int count4=0;
		for(int j=rangeNo1;j<=rangeNo2;j++) {
			System.out.println("The range is "+j);
			count4=j;
		}
		System.out.println(count4);


	}

}
