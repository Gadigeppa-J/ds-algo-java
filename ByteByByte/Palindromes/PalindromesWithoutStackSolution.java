
/**
* @author: Gadigeppa Muthu
* @date: 10-Apr-2020
* 
* Question: Given a linked list, write a function to determine whether the list is a palindrome.
* palindrome(1 -> 2 -> 3) = false
* palindrome(1 -> 2 -> 1) = true
*
* LeetCode: 234. Palindrome Linked List (https://leetcode.com/problems/palindrome-linked-list/)
*
**/

import java.util.Stack;


public class PalindromesWithoutStackSolution{


	
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


	public static boolean isPalindrome(Node head){
		
		if (head==null || head.next==null) return true;
		
		Node p = head;
		Node q = head;
		Node r = null;

		while(true){


			if (q.next==null || q.next.next==null){
				r=p.next;
				break;
			}
			
			p=p.next;
			q=q.next.next;

		}

		r=reverse(r);
		
		while(r!=null){
			
			if (head.val!=r.val){
				return false;
			}
			head=head.next;
			r=r.next;
		}
		
		return true;
		
	}
	
	public static void main(String[] args){

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(2);
		Node n4 = new Node(1);

		n1.next=n2;
		n2.next=n3;
		//n3.next=n4;

		System.out.println(isPalindrome(n1));

	}


}

class Node{

	int val;
	Node next;

	public Node(int val){
		this.val=val;
	}

}