package com.linkedlist;

public class MergeTwoSortedLinkedList {

	Node newHead;
	

	public void mergeSortedList(LinkedList pList, LinkedList qList) {
		
		Node p = pList.getHead();
		Node q = qList.getHead();
		Node sorting = new Node();
		
		System.out.println(p);
		System.out.println(q);
		newHead = merge(p,q,sorting);
		
		
	}
	
	public Node merge(Node p, Node q, Node sorting) {
		
		Node newHead = null;
		if(p == null) {
			return q;
		}
		else if(q == null) {
			return p;
		}
		
		if(p != null && q != null) {
			
			if(p.getData() <= q.getData()) {
				sorting = p;
				p = sorting.next;
			}
			else {
				sorting = q;
				q = sorting.next;
			}
		}
		newHead = sorting;
		
		while(p != null && q != null) {
			if(p.data <= q.data) {
				sorting.next = p;
				sorting = p;
				p = sorting.next;
			}
			else {
				sorting.next = q;
				sorting = q;
				q = sorting.next;
			}
		}
		if(p == null) {
			sorting.next = q;
		}
		if(q == null) {
			sorting.next = p;
		}
		
		
		return newHead;
	}
	
	public void show()
	{
		Node node = newHead;
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	
	
}
