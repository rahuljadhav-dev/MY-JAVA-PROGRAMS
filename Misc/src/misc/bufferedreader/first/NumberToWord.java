package misc.bufferedreader.first;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberToWord {
	public static void main(String[] args) {
		// Create a map to store word-to-digit mappings
		TreeMap<String, Integer> wordToDigit = new TreeMap <>();
		wordToDigit.put("zero", 0);
		wordToDigit.put("one", 1);
		wordToDigit.put("two", 2);
		wordToDigit.put("three", 3);
		wordToDigit.put("four", 4);
		wordToDigit.put("five", 5);
		wordToDigit.put("six", 6);
		wordToDigit.put("seven", 7);
		wordToDigit.put("eight", 8);
		wordToDigit.put("nine", 9);

		// Read input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter words representing a number: ");
		String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case insensitivity
		scanner.close();

		// Tokenize input
		String[] words = input.split("\\s+");

		// Convert words to digits
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			// Look up the word in the map
			Integer digit = wordToDigit.get(word);
			if (digit != null) {
				// If the word is found in the map, append the corresponding digit to the result
				result.append(digit);
			} else {
				// If the word is not found in the map, append an error message
				result.append("[Invalid]");
			}
		}

		// Print the result
		System.out.println("Digits represented by the words: " + result);

	}
}
