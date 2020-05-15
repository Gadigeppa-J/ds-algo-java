/**
* @author: Gadigeppa Muthu
* @date: 08-Apr-2020
* 
* Question: Given a linked list, write a function that prints the nodes of the list in reverse order
*
* reversePrint(1 -> 2 -> 3)
* 3
* 2
* 1
*
* Hackerack: Print in Reverse (https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem)
**/

public class PrintReversedLinkedListSolution{

	
	public static class Node{
	
		int val;
		Node next;
		public Node (int val){
			this.val=val;
		}
		
	}

	public static void reversePrint(Node head){
		
		if (head==null) return;
		reversePrint(head.next);
		System.out.println(head.val);
		
	}

	public static void main(String[] args){

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		n1.next=n2;
		n2.next=n3;
		
		reversePrint(n1);

	}


}