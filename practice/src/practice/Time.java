package practice;
import java.util.*;

public class Time {
	public static void main(String[] args) {
////ques.1 convert 1 hr and 20 min into second
//		int Hr=1;
//		float Min=20.6667F;
//		float Time=Min+Hr;
//		float Sec1=Time/60;
////1hr=3600sec and 20min=1200sec so for that
//		float Sec=(Hr*3600)+(Min%60*60)+Sec1;
//		System.out.println(Sec +" Seconds");
//
////ques.2 convert seconds into hour
//		int sec=4890;
//		int hr=(sec/3600);
//		int min=(sec%3600);
//		int time=(min/60);
//		int sec1=(min%60);
//		System.out.println(hr + "Hr " + time + "Min "+sec1 + "Sec " );
//		
////loops
//		int i=6;
//		int j=5;
//		
//		for(int k=1; k<=i; k++ ) {
//			for(int l=1; l<=j; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
////swith and break
//		
//		Scanner Sc=new Scanner(System.in);
//		byte button=Sc.nextByte();
//		switch(button) {
//		case 1:System.out.println("Hello Rahul Bhai");
//		break;
//		case 2:System.out.println("Kay chalay");
//		break;
//		case 3:System.out.println("Zal Ka Jevan");
//		break;
//		default:System.out.println("Bas kara Ata!");
//		}
//		
////conditional statements if else-if
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		if(a==b) {
//			System.out.println("Equal");
//		}else if(a>b) {
//			System.out.println("a is greater");
//		}else {
//			System.out.println("a is lesser");
//		}
////while loop
//		int rj=1;
//		while(rj<12) {
//			System.out.println(rj);
//			rj++;
//		}
//		int number=12;
//		for(int i=1;i<=10;i++) {
//			System.out.println(number+"X"+i+"="+(i*number));
//		}
//		int a=1;
//		int fact=7;
//		for(int j=1;j<=fact;j++) {
//			a*=j;
//		}
//		System.out.println("Factorial of "+fact+" is"+"="+a);
//		int b=1;
//		for(int k=b;k<=50;k++) {
//			k+=b;
//			System.out.println(k);
//		}
//		int c=40;
//		int d=670;
//		int range=0;
//		for(int l=c+1;l<=d;l++) {
//			range+=1;
//		}
//		System.out.println("The range of "+c+" and "+d+" is "+"="+range);
//		int star=1;
//		for(int s=1;s<=5;s++) {
//			System.out.println("*");
			
            
            // Inner loop to print stars
            for (int k = 0; k < 2 ; k++) {
                System.out.print("*"+"\n");
            }
            //Factorial of a number
            int fact=10;
            int mul=1;
            int i=1;
            
            while(i<=fact) {
            	mul*=i;
            	i++;
            }
            System.out.println(mul);

	}

}
//the end 