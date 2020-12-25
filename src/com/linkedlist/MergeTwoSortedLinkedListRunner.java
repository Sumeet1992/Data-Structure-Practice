package com.linkedlist;


public class MergeTwoSortedLinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		list1.insert(1);
		list1.insert(5);
		list1.insert(7);
		list1.insert(9);
		list1.insert(10);
//		list.insertAtStart(25);
//		list.insertAtAnyPos(2, 14);
		list1.show();
		System.out.println("-------");
		
		
		LinkedList list2 = new LinkedList();
		list2.insert(2);
		list2.insert(7);
		list2.insert(9);
		list2.insert(10);
		list2.insert(18);
		list2.show();
		System.out.println("-------");
		MergeTwoSortedLinkedList linkedList = new MergeTwoSortedLinkedList();
		linkedList.mergeSortedList(list1, list2);
		linkedList.show();

	}

}
