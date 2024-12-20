package practice.first;
import java.util.*;

public class MyClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		int b;
		int sum;
		try {
			System.out.println("Enter first number :");
			a=s.nextInt();
			System.out.println("Enter second number :");
			b=s.nextInt();
			sum=a+b;
			System.out.println("The sum of two number is :"+sum);
			
//			
		} 
		catch(InputMismatchException e) {
			System.out.println("please re-run your program and enter integer number");
			
		}
		//	catch (Exception e) {
//			System.out.println("invalid!");
//			System.out.println("Please re-run your program and enter integer number");
//		}
	}

}
