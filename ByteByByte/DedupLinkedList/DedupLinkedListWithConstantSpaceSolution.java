/**
* @author: Gadigeppa Muthu
* @date: 14-Apr-2020
* 
* Question: Given an unsorted linked list, write a function to remove all the duplicates.
* 
* dedup(1 -> 2 -> 3 -> 2 -> 1) = 1 -> 2 -> 3
**/

public class DedupLinkedListWithConstantSpaceSolution{


	public static void dedup(Node head){
				
		Node curr1=head;

		while(curr1!=null){

			Node curr2=curr1.next;
			Node prev=curr1;
			
			while(curr2!=null){
				
				if (curr1.val==curr2.val){
					prev.next=curr2.next;
				}else{
					prev=curr2;
				}
					curr2=prev.next;				
			}
			
		
			curr1=curr1.next;
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