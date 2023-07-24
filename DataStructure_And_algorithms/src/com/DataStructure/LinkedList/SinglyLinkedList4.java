package com.DataStructure.LinkedList;

// Insert a node in a SinglyLinkedList at a given position

public class SinglyLinkedList4 {

	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	public void insert(int position,int value) {
		//1-->4-->5
		//1-->6-->4-->5
		ListNode node=new ListNode(value);
		if(position==1) {
			node.next=head;
			head=node;
		}else {
			ListNode previous=head;
			int count=1;//position-1
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=node;
			node.next=current;
		}
	}
	public static void main(String[] args) {
	
		SinglyLinkedList4 sll=new SinglyLinkedList4();
		sll.insert(1, 3);//3-->null
		sll.insert(2, 5);//3-->--5>null
		sll.insert(1, 2);//2-->3-->5-->null
		sll.insert(2, 4);//2-->4-->3-->5-->null
		sll.insert(5, 7);//2-->4-->3-->5-->7-->null
		sll.display();

	}

}
