package com.problem_solving;

import java.util.stream.IntStream;

public class AlternateElements {
	public static void main(String[] args) {
		int arr[]= {5,6,7,8,4,88,9,9};
		IntStream.range(0, arr.length).filter(i->(i%2==0)).map(i->arr[i]).forEach(System.out::println);
	}

}
