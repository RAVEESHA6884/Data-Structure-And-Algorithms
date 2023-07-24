package com.DataStructure.LinkedList;

// Reverse a singlyLinked List

public class SinglyLinkedList9 {
	private static ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode (int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void display(ListNode head) {
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
	public ListNode reverse(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
public static void main(String[] args) {
	SinglyLinkedList9 sll=new SinglyLinkedList9();
	sll.insertLast(11);
	sll.insertLast(8);
	sll.insertLast(1);
	sll.insertLast(10);
	sll.display(head);
	ListNode reverseListHead=sll.reverse(head);
	sll.display(reverseListHead);
	
	
	


}

}
