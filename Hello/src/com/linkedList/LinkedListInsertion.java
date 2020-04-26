package com.linkedList;

public class LinkedListInsertion {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public void insertAtBefore(int newdata){
		Node newNode = new Node(newdata);
		newNode.next = head;
		head = newNode;
	}
	public void insertAtEnd(int newdata){
		Node newNode = new Node(newdata);
		if(head==null){
			head = newNode;
			return;
		}
		newNode.next = null;
		Node tnode = head;
		while(tnode.next!=null)
			tnode = tnode.next;
		tnode.next = newNode;
		return;
	}
	public void inserAtGivenNode(int prevdata, int newdata){
		Node newNode = new Node(newdata);
		Node tnode = head;
		Node prevnode=null;
		while(tnode.next!=null){
			if(tnode.data == prevdata)
				prevnode = tnode;
			tnode = tnode.next;
		}
		
		newNode.next = prevnode.next;
		prevnode.next = newNode;
		
	}
	public void printlist(){
		Node tnode = head;
		while(tnode!=null){
			if(tnode.next==null)
			System.out.print(tnode.data);
			else{
				System.out.print(tnode.data + "->");
				
			}
			tnode = tnode.next;
			
		}
		System.out.println();
	}
	public static void main(String[] args){
		LinkedListInsertion llist = new LinkedListInsertion();
		llist.insertAtBefore(6);
		llist.insertAtBefore(3);
		llist.insertAtBefore(7);
		llist.insertAtBefore(9);
		llist.printlist();
		
		llist.inserAtGivenNode(3, 2);
		llist.printlist();
		llist.insertAtEnd(15);
		llist.insertAtEnd(20);
		llist.printlist();
	}
	
}