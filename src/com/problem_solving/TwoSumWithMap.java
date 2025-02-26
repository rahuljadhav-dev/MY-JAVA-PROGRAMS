package com.problem_solving;

import java.util.HashMap;
import java.util.Map;

public class TwoSumWithMap {
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8};
		int target=19;
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) 
		{
			int complement=target-arr[i];
			if(map.containsKey(complement)) 
			{
				System.out.println(map.get(complement)+" "+i);
				return;
			}
			
			map.put(arr[i], i);
		}
		
		System.out.println("No Pair Found..");
	}

}
