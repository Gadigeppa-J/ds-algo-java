/**
* @author: Gadigeppa Muthu
* @date: 15-Apr-2020
* 
* Question: Given a linked list, and an input n, write a function that returns the nth-to-last element of the linked list.
* 
* list = 1 -> 2 -> 3 -> 4 -> 5 -> null
* nthToLast(list, 0) = 5
* nthToLast(list, 1) = 4
* nthToLast(list, 4) = 1
* nthToLast(list, 5) = null
*
**/

public class NthToTheLastElementSolution{

	
	public static Integer nthLastElement(Node head, int n){
		
		if (head==null) return null;		


		Node p = head;
		Node q = head;
		
		for (int i  = 0 ; i< n; i++){
			if (q.next==null) return null; // overflow
			q=q.next;
		}
		
		while(q.next!=null){	
			q=q.next;
			p=p.next;
		}

		return p.val;

	}


	public static void main(String[] args){
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		System.out.println(nthLastElement(n1, 3));

	}


}

class Node{
	int val;
	Node next;

	public Node(int val){
		this.val=val;
	}

}