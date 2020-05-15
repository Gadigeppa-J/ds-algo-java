/**
* @author: Gadigeppa Muthu
* @date: 14-Apr-2020
* 
* Question: Given a linked list where each node has two pointers, one to the next node and one to a random node in the list, clone the linked list.
*
* Leetcode: 138. Copy List with Random Pointer (https://leetcode.com/problems/copy-list-with-random-pointer/)
**/

public class RandomLinkedListWithoutExtraSpaceSolution{


	public static Node copyRandomList(Node head){
		
		
		Node curr = head;
		Node nHead = null;

		// create cloned nodes
		while(curr!=null){
			
			Node nCurr = new Node(curr.val);

			if (nHead==null){
				nHead=nCurr;
			}
	
			nCurr.next = curr.next;
			curr.next=nCurr;
			curr=nCurr.next;

		}
		

		// update random pointers
		curr = head;

		while(curr!=null){
			curr.next.random = curr.random!=null?curr.random.next:null;		
			curr=curr.next.next;
			
		}		
		

		// restore orignial list
		curr = head;
		
		while(curr.next!=null){
			Node temp = curr.next;
			curr.next=curr.next.next;
			curr=temp;
		}
		
		return nHead;

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