package com.DataStructure.LinkedList;

//Delete first node of a singly LinkedList

public class SinglyLinkedList5 {
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
	public ListNode deleteFirst() {
		if(head==null) {
			return null;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	public static void main(String[] args) {
		SinglyLinkedList5 sll=new SinglyLinkedList5();
		sll.insertLast(11);
		sll.insertLast(8);
		sll.insertLast(1);
		sll.display();
		System.out.println(sll.deleteFirst().data);
		System.out.println(sll.deleteFirst().data);
		sll.display();
	}

}
