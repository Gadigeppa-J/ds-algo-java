/**
* @author: Gadigeppa Muthu
* @date: 10-Apr-2020
*
* LeetCode: 206. Reverse Linked List (https://leetcode.com/problems/reverse-linked-list/submissions/)
*
**/

public class ReverseLinkedListIterativeSolution{
	
	
	public static Node reverse(Node head){

		if (head==null || head.next==null) return head;

		Node curr = head;
		Node prev = null;

		while(curr!=null){
			Node temp = curr.next;			
			curr.next=prev;
			prev=curr;
			curr=temp;			
		}

		return prev;

	}



	public static void main(String[] args){

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;


		Node reversed = reverse(n1);
		
		while(reversed!=null){
			System.out.println(reversed.val);
			reversed=reversed.next;
		}


	}

}

class Node{

	int val;
	Node next;

	public Node(int val){
		this.val=val;
	}

}