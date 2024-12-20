package practice;
import java.util.*;
public class Task3 {
//problem number 1
	public static void main(String[] args) {
		int x=10;
		int y=4;
		x+=10;
		y-=x;
		x*=y;
		y/=y;
		x%=x;
		System.out.println(x);
		System.out.println(y);
		
//problem number 2
		int x1=10;
		int x2=22;
		System.out.println(x1!=x2);
		int sum=x1+x2;
		System.out.println(sum>x2);
		
//problem number 3
		int y1=98;
		int z1=100;
		int mod=z1%y1;
		System.out.println(mod);
		
//problem number 4
		int r=22;
		int a=33;
		int h=44;
		r+=h;
		r-=a;
		a/=h;
		System.out.println(r);
		System.out.println(a);
		System.out.println(r==a);
		System.out.println(r>=a);
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum1=0;
		for(int i=0; i<=n; i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
	
		
		
	}
	
	

}
