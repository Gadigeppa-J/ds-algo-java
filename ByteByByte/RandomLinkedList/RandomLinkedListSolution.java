/**
* @author: Gadigeppa Muthu
* @date: 14-Apr-2020
* 
* Question: Given a linked list where each node has two pointers, one to the next node and one to a random node in the list, clone the linked list.
*
* Leetcode: 138. Copy List with Random Pointer (https://leetcode.com/problems/copy-list-with-random-pointer/)
**/

import java.util.Map;
import java.util.HashMap;

public class RandomLinkedListSolution{


	public static Node copyRandomList(Node head){
		
		Map<Node, Node> map = new HashMap<>();
		
		Node curr = head;
		Node nwHead = new Node(head.val);
		Node nwCurr = nwHead;
		
		map.put(curr, nwCurr);		
	
		
		while(curr!=null){
			
			// create next node
			if (curr.next!=null){

				if (map.containsKey(curr.next)){
					nwCurr.next = map.get(curr.next);
				}else{
					nwCurr.next = new Node(curr.next.val);
					map.put(curr.next, nwCurr.next);
				}

			}
	

			// create random node
			if (curr.random!=null){
			
				if (map.containsKey(curr.random)){
					nwCurr.random = map.get(curr.random);
				}else{
					nwCurr.random = new Node(curr.random.val);
					map.put(curr.random, nwCurr.random);
				}	

			}

			curr=curr.next;
			nwCurr=nwCurr.next;			
		
		}
		
		return nwHead;

	}
	
	public static void main(String[] args){

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);

		n1.next = n2;		
		n2.next = n3;
		n3.next = n4;
		
		n1.random=n3;
		n2.random=n1;
		n3.random=n3;
		n4.random=n2;
		
		Node nn1 = copyRandomList(n1);
		Node curr=nn1;

		while(curr!=null){
			System.out.println(curr.val);
			System.out.println(curr.random.val);
			System.out.println();
			curr=curr.next;
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