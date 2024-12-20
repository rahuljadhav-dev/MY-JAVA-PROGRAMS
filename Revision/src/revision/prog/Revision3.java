package revision.prog;
import java.util.*;
public class Revision3 {
	public int sumOfNumber(int c,int d) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a=sc.nextInt();
		System.out.println("Enter Second Number :");
		int b=sc.nextInt();
		System.out.println("The Sum of First and Second Number is :");
		int sum=a+b;
		return sum+c+d;
		
	}
	public static void main(String[] args) {
		Revision3 call=new Revision3();
		int ans=call.sumOfNumber(12,12);
		System.out.println(ans);
		
		
	}

}
