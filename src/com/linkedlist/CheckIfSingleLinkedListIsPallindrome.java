package com.linkedlist;

// First split the linked list in two parts
// Then reverse the second linked list
// Then Compare the first linked list with the second reversed linked list element by element

public class CheckIfSingleLinkedListIsPallindrome {
	
	Node p; 
	Node q;
	
	public void splitLinkedList(LinkedList l) {
		
		Node head = l.getHead();
		p = head;
		q = head;
		Node secondHead = new Node();
//		Breaking condition
		while(true) {
			p = p.next.next;
//			Below condition is true when list is odd numbered
			if(p != null && p.next == null) {
				secondHead = q.next.next;
				break;
			}
//			Below condition matches when list is even numbered
			if(p == null) {
				secondHead = q.next;
				break;
			}
			q = q.next;
		}
		q.next = null;
		
//		Now 'head' points to the 1st list and 'secondHead' points to the 2nd list
//		Now reverse the second list
//		Then compare the two lists
	}
}
