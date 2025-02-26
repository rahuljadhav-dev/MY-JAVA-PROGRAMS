package com.linkedlist;

import java.util.LinkedList;

public class ImplementLinkedList {
	public static void main(String[] args) {
		Node one=new Node(66);
//		System.out.println(one.data);//value 
//		System.out.println(one.next);//address of next node
		
		Node two=new Node(77);
		one.next=two;
		
		Node three=new Node(88);
		one.next.next=three;
		
//		System.out.println(one.next.next.data);
		ADTLinkedList l=new ADTLinkedList();
		l.insert(99);
		l.insert(90);
//		System.out.println(l.head.next.data);
		l.printData();
		
		 
	
	}


}

