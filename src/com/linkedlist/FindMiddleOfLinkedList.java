package com.linkedlist;


public class FindMiddleOfLinkedList {
	
	Node p; 
	Node q;
	
	public int findMiddle(LinkedList l) {
		
		Node head = l.getHead();
		
		p = head;
		q = head;
		
		while(q != null && q.next != null) {
			p = p.next;
			q = q.next.next;
		}
		return p.data;
		
	}
}
