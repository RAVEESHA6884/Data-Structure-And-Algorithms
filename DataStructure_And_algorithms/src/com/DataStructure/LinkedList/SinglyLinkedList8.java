package com.DataStructure.LinkedList;

// Search an element in a List

public class SinglyLinkedList8 {

	private static ListNode head;
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
	public boolean find(ListNode head,int searchKey) {
		if(head==null) {
			return false;
		}
		ListNode current=head;
		while(current!=null) {
			if(current.data==searchKey) {
				return true;
			}
			current=current.next;
			
		}
		return false;
	}
	
public static void main(String[] args) {
	SinglyLinkedList8 sll=new SinglyLinkedList8();
	sll.insertLast(11);
	sll.insertLast(8);
	sll.insertLast(1);
	sll.display();
	
	if(sll.find(head, 1)) {
		System.out.println("Search Key Found...");
	}else {
		System.out.println("Search Key not Found...");
	}

}
}
