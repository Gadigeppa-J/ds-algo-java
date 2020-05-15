/**
* @author: Gadigeppa Muthu
* @date: 13-Apr-2020
* 
* Question: Given a linked list, determine whether it contains a cycle.
*
* Leetcode: 141. Linked List Cycle (https://leetcode.com/problems/linked-list-cycle/)
**/


public class LinkedListCycleSolution{

	

	public static boolean hasCycle(Node head){
		
		if (head==null) return false;

		Node p = head;
		Node q = head;

		while(true){
			
			if (q==null || q.next==null) return false;

			p=p.next;
			q=q.next.next;

			if (p==q) return true;
		}
		
				
	}

	public static void main(String[] args){

		Node n1 = new Node(3);
		Node n2 = new Node(2);
		Node n3 = new Node(0);
		Node n4 = new Node(-4);

		n1.next=n2;		
		n2.next=n3;
		n3.next=n4;
		//n4.next=n2;

		System.out.println(hasCycle(n1));


	}

}

class Node{
	int val;
	Node next;

	public Node(int val){
		this.val=val;
	}

}