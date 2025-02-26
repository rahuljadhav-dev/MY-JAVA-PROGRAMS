package com.problem_solving;

public class BestTimeToByStocks {
	public static int maxProfit(int arr[]) {
		int minPrice=Integer.MAX_VALUE;
		int maxProfit=0;
	
		for (int price : arr) {
			minPrice=Math.min(minPrice, price);
			maxProfit=Math.max(maxProfit, price-minPrice);		
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int arr[]={1, 5, 3, 6,7, 4};
		System.out.println(maxProfit(arr));
	}

}
