/**
* @author: Gadigeppa Muthu
* @date: 15-Apr-2020
* 
* Question: Given a linked list, write a function to split the list into two equal halves.
* 
* split(1 -> 2 -> 3 -> 4) = 1 -> 2, 3 -> 4
* split(1 -> 2 -> 3 -> 4 -> 5) = 1 -> 2 -> 3, 4 -> 5
**/

public class SplitALinkedListSolution{


	public static Node[] split(Node head){

		if (head==null) return new Node[]{null, null};

		Node p = head;
		Node q = head;
		
		Node nwHead = null;
		
		while(true){
			
			if (q.next==null || q.next.next==null){
				nwHead = p.next;
				p.next=null;
				break;
			}

			p=p.next;
			q=q.next.next;
			
		}
		
		return new Node[]{head, nwHead};

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
		
		Node[] nodes = split(n1);
		
		Node curr = nodes[0];

		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
		}
		
		System.out.println();
		curr = nodes[1];

		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
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