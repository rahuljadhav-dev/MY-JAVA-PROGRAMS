package com.adt;

public class ArrayADT {
	
	private int array[];
	private int capacity;
	private int size;
	
	public ArrayADT(int capacity) {
		this.capacity=capacity;
		this.size=0;
		this.array=new int[capacity];
	}
	
	//for inserting the array
	public void insert(int value) {
		if(this.capacity==size) {
			System.out.println("Array is full");
			return;
		}
		array[size]=value;
		size++;
	}
	
	//for deleting the elements of array
	public void delete(int index) {
		if(index<0||index>=size) {
			System.out.println("Invalid index");
			return;
		}
		
		for (int i = index; i < size-1; i++) {
			array[index]=array[index+1];
			
		}
		size--;
	}
	
	//get the index
	
	public int getIndex(int number) {
		if(number<0||number>=size) {
			System.out.println("Invalid");
			return -1;
		}
		
		return array[number];
	}
	
	public void print() {
		for (int i = 0; i <this.size; i++) {
			System.out.println(array[i]);
//			return;
		}
	}

}
