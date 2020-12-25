package com.linkedlist;

public class LinkedList {

	Node head;
	
	public void insert(int data){
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null){
			head = node;
		}
		else{
//			Assigning  head to a temp node for iteration
			Node n = head;
//			Everytime the n.next is not null, it will point to the next node and at the last iteration, 
//			the last node will be stored in n
			while(n.next!= null){
				n = n.next;
			}
//			pointing the next of the last node to the node that has to be inserted.
			n.next = node;	
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
//		making the new node point to the head node so 
//		that the current head node would not be lost
		node.next = head;
//		making the new node as the head node
		head = node;
	}
	
	public void insertAtAnyPos(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0 )
		{
			insertAtStart(data);
		}
		
		else {
			Node n = head;
			//		written index-1 because we are reaching to the node just before the index using n.next
			//		so the node previous to this node will point to this node
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void delete(int index)
	{
		
		if(index == 0)
		{
			head = head.next;
		}
		else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			Node n1 = n.next;
			n.next = n1.next;
			n1.next = null;
		}
		
	}
	
	public void show()
	{
		Node node = head;
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public Node getHead() {
		
		return head;
	}
	
	
	
}
