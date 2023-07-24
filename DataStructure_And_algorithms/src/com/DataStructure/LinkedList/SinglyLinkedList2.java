package com.DataStructure.LinkedList;

//Insert a node at the beginning of a  SinglyLinkedList 

public class SinglyLinkedList2 {

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
	public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	public static void main(String[] args) {
		SinglyLinkedList2 sll=new SinglyLinkedList2();
		sll.insertFirst(11);
		sll.insertFirst(8);
		sll.insertFirst(1);
		sll.display();
	}

}
