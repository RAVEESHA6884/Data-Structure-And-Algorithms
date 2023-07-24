package com.DataStructure.LinkedList;

// Find middle node in a LinkedList

public class SinglyLinkedList10 {

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
	public ListNode getMiddleNode() {
		if(head==null) {
			return null;
		}
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr!=null || fastPtr.next!= null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}
public static void main(String[] args) {
	SinglyLinkedList10 sll=new SinglyLinkedList10();
	sll.insertLast(11);
	sll.insertLast(8);
	sll.insertLast(1);
	sll.insertLast(10);
	sll.display();
	ListNode middleNode=sll.getMiddleNode();
	System.out.println("Middle node is"+middleNode.data);
	
	
}

}


