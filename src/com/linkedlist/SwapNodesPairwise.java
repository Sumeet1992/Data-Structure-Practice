package com.linkedlist;

public class SwapNodesPairwise {

	Node newHead;
	

	public void swapList(LinkedList pList) {
		
		Node p = pList.getHead();
		newHead = swap(p);
		
		
	}
	
	public Node swap(Node head) {
		
		Node p = head;
		newHead = p.next;
		
		while(true) {
			Node q = p.next;
			Node temp = q.next;
			q.next = p;
			
			if(temp == null) {
				p.next = null;
				break;
			}
			else if(temp.next == null) {
				p.next = temp;
				break;
			}
			p.next = temp.next;
			p = temp;
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
