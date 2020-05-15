
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

public class PalindromesWithStackSolution{



	public static boolean isPalindrome(Node head){
		
		if (head==null || head.next==null) return true;
		
		Stack<Node> stack = new Stack<>();
		Node p = head;
		Node q = head;
		Node r = null;

		while(true){


			if (q.next==null){ //odd
				r=p.next;
				break;
			}

			if (q.next.next==null){	// even	
				stack.push(p);		
				r=p.next;
				break;
			}

			
			stack.push(p);
			p=p.next;
			q=q.next.next;

		}
		
		while(!stack.isEmpty()){
			if (stack.pop().val!=r.val){
				return false;
			}
			r=r.next;
		}

		return true;
		
	}
	
	public static void main(String[] args){

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(2);
		Node n4 = new Node(2);

		n1.next = n2;
		n2.next=n3;
		n3.next=n4;

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