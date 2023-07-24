package com.DataStructure.LinkedList;

// remove duplicates from sorted linkedList 
public class SinglyLinkedList12 {


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
		
		public void removeDuplicates() {
			if(head==null) {
				return;
			}
			ListNode current=head;
			while(current!=null || current.next!=null) {
				if(current.data==current.next.data) {
					current.next=current.next.next;
				}else {
					current=current.next;
				}
			}
		}
	public static void main(String[] args) {
		SinglyLinkedList12 sll=new SinglyLinkedList12();
		sll.insertLast(11);
		sll.insertLast(8);
		sll.insertLast(1);
		sll.insertLast(11);
		sll.display(head);
		sll.removeDuplicates();
		sll.display(head);
		
		
		
		


	}

	}



