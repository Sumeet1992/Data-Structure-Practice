package com.linkedlist;


public class ReverseALinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(5);
		list.insert(2);
		list.insert(4);
		list.insert(3);
//		list.insertAtStart(25);
//		list.insertAtAnyPos(2, 14);
		
		list.show();
		System.out.println("----------------After reversing");
		ReverseALinkedList linkedList = new ReverseALinkedList();
		linkedList.reverseList(list);
		linkedList.show();

	}

}
