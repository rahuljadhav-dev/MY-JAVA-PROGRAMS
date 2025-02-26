package com.linkedlist;

public class ADTLinkedList {

	//insert linkedlist
	Node head=null;
	public void insert(int value) {
		Node n=new Node(value);
		if(head==null) {
			head=n;
			return;
		}
		n.next=head.next;
		head=n;
	}
	
	public void printData() {
		while(head.next!=null) {
			System.out.println(head.next.data);
		}
	}

}
