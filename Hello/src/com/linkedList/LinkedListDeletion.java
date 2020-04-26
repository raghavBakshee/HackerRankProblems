package com.linkedList;

public class LinkedListDeletion {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void deleteAtFirst() {
		if (head == null)
			return;
		head = head.next;

	}

	public void deleteKey(int key) {
		Node temp = head;
		Node prev = null;
		if (temp == null)
			return;
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != key) {
			prev = temp;	
			temp = temp.next;
		}
		if(temp==null)
			return;
		
		prev.next = temp.next;
	}

	public void deleteAtEnd() {

	}

	public void deleteAtGivenLocation() {

	}

	public void insertAtFirst(int newdata) {
		Node newnode = new Node(newdata);
		newnode.next = head;
		head = newnode;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListDeletion llist = new LinkedListDeletion();
		llist.insertAtFirst(4);
		llist.insertAtFirst(3);
		llist.insertAtFirst(2);
		llist.printList();
	//	llist.deleteAtFirst();
		llist.printList();
		llist.deleteKey(3);
		llist.printList();
	}
}