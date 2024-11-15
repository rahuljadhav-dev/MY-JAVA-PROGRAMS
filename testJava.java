package misc.bufferedreader.first;

import java.util.Scanner;

public class TestJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		scanner.close();

		// Array to hold word representations of digits
		String[] digitWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

		// Convert number to words
		String result = "";
		int digit;
		while (number > 0) {
			digit = number % 10;  // Extract the last digit
			number /= 10;  // Remove the last digit
			result = digitWords[digit] + " " + result; // Convert digit to word and append
		}

		System.out.println("Number in words: " + result);
	}
}
