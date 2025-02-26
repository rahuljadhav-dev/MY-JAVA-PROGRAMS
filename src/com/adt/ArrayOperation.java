package com.adt;

public class ArrayOperation {
	public static void main(String[] args) {
		ArrayADT arr=new ArrayADT(7);
		arr.insert(0);
		arr.insert(5);
		arr.insert(6);
		arr.insert(7);
		arr.insert(8);
		arr.insert(9);
		arr.insert(4);
		
		//arr.delete(4);
		
//		arr.print();
		System.out.println(arr.getIndex(4));
		
	}

}
