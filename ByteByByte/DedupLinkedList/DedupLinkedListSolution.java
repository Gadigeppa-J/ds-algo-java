/**
* @author: Gadigeppa Muthu
* @date: 14-Apr-2020
* 
* Question: Given an unsorted linked list, write a function to remove all the duplicates.
* 
* dedup(1 -> 2 -> 3 -> 2 -> 1) = 1 -> 2 -> 3
**/

import java.util.Set;
import java.util.HashSet;

public class DedupLinkedListSolution{


	public static void dedup(Node head){
				
		Set<Integer> set = new HashSet<>();
		
		Node curr = head;
		Node prev = null;		

		while(curr!=null){
			
			if (set.contains(curr.val)){				
				prev.next=curr.next;		
			}else{
				set.add(curr.val);
				prev=curr;
			}		
	
			curr=prev.next;		
		}		
		
		
	}


	public static void main(String[] args){

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(4);

		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;

		dedup(n1);
		
		while(n1!=null){
			System.out.println(n1.val);
			n1=n1.next;
		}
		

	}


}

class Node{
	int val;
	Node next;
	Node random;	

	public Node(int val){
		this.val=val;
	}

}