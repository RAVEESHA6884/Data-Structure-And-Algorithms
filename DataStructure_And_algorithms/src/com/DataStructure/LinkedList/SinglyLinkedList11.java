package com.DataStructure.LinkedList;



public class SinglyLinkedList11 {

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
	public ListNode getNthNodeFromEnd(int n) {
		if(head==null) {
			return null;
		}
		if(n<=0) {
			throw new IllegalArgumentException("Invalid value : n="+n);
		}
		ListNode mainPtr=head;
		ListNode refPtr=head;
		int count=0;
		while(count<n) {
			if(refPtr==null) {
				throw new IllegalArgumentException(n+"is  greater than the  number of nodes in list");
				
			}
			refPtr=refPtr.next;
			count++;
		}
		while(refPtr!=null) {
			refPtr=refPtr.next;
			mainPtr=mainPtr.next;
		}
		return mainPtr;
	}
	
public static void main(String[] args) {
	SinglyLinkedList11 sll=new SinglyLinkedList11();
	sll.insertLast(11);
	sll.insertLast(8);
	sll.insertLast(1);
	sll.insertLast(11);
	sll.display(head);
	ListNode  nthNodeFromEnd=sll.getNthNodeFromEnd(2);
	System.out.println("nth node from end is - "+nthNodeFromEnd.data);
	
	
	
	
	


}

}


