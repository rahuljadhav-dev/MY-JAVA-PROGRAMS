package com.problem_solving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MergeSortedArray {
	public static int[] mergeArray(int array_one[],int array_two[]) {
		Arrays.sort(array_one);
		Arrays.sort(array_two);
		int m=array_one.length;
		int n=array_two.length;
		
		int merged[]=new int[m+n];
		int i=0,j=0,k=0;
		
		while(i<m && j<n) {
			if(array_one[i]<array_two[j]) {
				merged[k++]=array_one[i++];
			}else
				merged[k++]=array_two[j++];
		}
		
		while(i<m) {
			merged[k++]=array_one[i++];
		}
		
		while(j<n) {
			merged[k++]=array_two[j++];
		}
		
		return merged;
	}
	public static void main(String[] args) {
		int one[]= {4,5,6,7,8};
		int two[]= {9,7,5,6,4,99,8,7,6,5};
		int merged[]=mergeArray(one, two);
		System.out.println(Arrays.toString(mergeArray(one, two)));
		Set<Integer>set=new TreeSet<Integer>();
		for (Integer integer : merged) {
			set.add(integer);
		}
		System.out.println(set);
		
	}

}
