package com.linkedlist;

public class ReverseALinkedList {
	
	Node p; 
	Node q;

	public void reverseList(LinkedList list) {
		
		Node head = list.getHead();
		reverse(head);
	}
	public Node reverse(Node head) {
		
		p = new Node();
		q = new Node();
		
		if(head == null) {
			return head;
		}
		p = head;
		q = p.next;
		
		if(q == null) {
			return q;
		}
		
		q = reverse(q);
		
		p.next.next = p;
		p.next = null;
		
		return q;
	}
	

	
	public void show()
	{
		Node node = q;
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	
	
}
