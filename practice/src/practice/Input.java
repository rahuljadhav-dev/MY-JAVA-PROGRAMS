package practice;
import java.util.*;

public class Input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
   	    int mul=a*b;
		int div=a/b;
        System.out.println(sum);
        if(sum>1000) {
        	System.out.println(mul);
        }else if(mul>1000)
        System.out.println(div);
  
//Operators-post increment pre-increment 
		int x=11;
		int y=22;
		x=y++;
		x=++y;
		System.out.println(x);
		System.out.println(y);
		
//Variables
		byte ___rj=22;
		short _$_55rr=4555;
		
		int $$4=66666;
		
		long RRRjj__$=56666;
		
		double R_j334$=5665.43;
		
		float _______qqqq$$121=444.56F;
		
		boolean $$121;
		char __Name$$='A';

		int cc=5;
		double dd=2.0;
		System.out.println(cc/dd);
	}
	
	

}
