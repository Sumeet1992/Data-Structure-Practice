package com.linkedlist;

public class FindMiddleOfLinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(5);
		list.insert(2);
		list.insert(4);
		list.insert(3);
		list.insert(31);
		
		list.show();
		
		FindMiddleOfLinkedList findMiddleOfLinkedList = new FindMiddleOfLinkedList();
		int middle = findMiddleOfLinkedList.findMiddle(list);
		System.out.println("Middle Element is : "+middle);

	}

}
