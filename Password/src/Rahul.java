import java.util.*;
import java.util.Scanner;
public class Rahul 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=sc.nextLine();
		System.out.println("Thank You For Giving Your Name I Am Generating Your Password "+ name);


		int length = 12;
		System.out.println(rahul_Passwordd(length));

	}
	static char[] rahul_Passwordd(int len)
	{
		System.out.println("Generating password using random():");
		System.out.println("Your new password is :");
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*<>>";
		String values = Capital_chars + small_chars + numbers + symbols;
		Random rndm_method = new Random();
		char[]password = new char[len];
		for (int i = 0; i< len; i++)
		{
			password[i] =
					values.charAt(rndm_method.nextInt(values.length()));
		}
		return password;
	}

}
