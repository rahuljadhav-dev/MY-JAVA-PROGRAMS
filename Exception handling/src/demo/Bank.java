package demo;
import java.util.*;

public class Bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cash=10000;
		int withdraw;
		int pin;
		try {
			System.out.println("Enter pin :");
			pin=sc.nextInt();
			if(pin<=9999 && pin>999) {
				System.out.println("Connecting server.....");
				System.out.println("Enter amount :");
				withdraw=sc.nextInt();

				if(cash<withdraw) {
					throw new Exception("Insufficient balance!");
				}
				System.out.println("Count cash :"+withdraw);
				System.out.println("Transaction complted!");
				System.out.println("Terminate!");

			}
			
			else {
				System.out.println("Invalid pin!");
				System.out.println("Please enter valid pin!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Please enter correct amount!");

		}
		finally {
			System.out.println("Thank you!");
		}
	}

}
