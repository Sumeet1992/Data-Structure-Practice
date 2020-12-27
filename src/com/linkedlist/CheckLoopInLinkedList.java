package com.linkedlist;

public class CheckLoopInLinkedList {
	
	Node p; 
	Node q;

	public void reverseList(LinkedList list) {
		
		Node head = list.getHead();
		checkIfLoopExists(head);
		
	}
	
//	Check if the loop exists or not
	public Node checkIfLoopExists(Node head) {

		Node p = head;
		Node q = head;
		
		while(p != null && q != null && q.next != null) {
			p = p.next;
			q = q.next.next;
			
			if(p.equals(q)) {
//				This below p is the point at which both the pointers meet in the loop
				return p;
			}
		}
		
		return null;
	}
	
//	Check the starting point of the loop / Floyd's cycle detecting Algorithm
	public Node startingOfLoop(Node head, Node p) {
		
		Node q = head;
		if(!p.equals(q)) {
			p = p.next;
			q = q.next;
		}
		
		return p;
		
	}
}
