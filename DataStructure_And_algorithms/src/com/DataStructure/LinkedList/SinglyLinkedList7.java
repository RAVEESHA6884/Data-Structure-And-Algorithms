package com.DataStructure.LinkedList;

// Delete a node from a singlyLinkedList at a given position

public class SinglyLinkedList7 {

	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode (int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"--->");
			current=current.next;
		}
		System.out.println("Null");
	}
	public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current=head;
		while(null!=current.next) {
			current=current.next;
		}
		current.next=newNode;
	}
	public void delete(int position) {
		//position is valid and starting from 1
		if(position==1) {
			head=head.next;
		}else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=current.next;
		}
	}

	
public static void main(String[] args) {
	SinglyLinkedList7 sll=new SinglyLinkedList7();
	sll.insertLast(11);
	sll.insertLast(8);
	sll.insertLast(1);
	sll.display();
	sll.delete(2);
	sll.display();
	
}
}
