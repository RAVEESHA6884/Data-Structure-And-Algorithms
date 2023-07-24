package com.DataStructure.LinkedList;

//Insert a node at the end of  a SinglyLinkedList 

public class SinglyLinkedList3 {

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
	public static void main(String[] args) {
		SinglyLinkedList3 sll=new SinglyLinkedList3();
		sll.insertLast(11);
		sll.insertLast(8);
		sll.insertLast(1);
		sll.display();
	}

}
