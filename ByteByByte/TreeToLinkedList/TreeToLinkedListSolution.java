/**
* @author: Gadigeppa Muthu
* @date: 07-Apr-2020
* 
* Question: Given a tree, write a function to convert it into a circular doubly linked list from left to right by only modifying the existing pointers.
*
* <- 4 <-> 2 <-> 5 <-> 1 <-> 6 <-> 3 <-> 7 ->
*
**/

public class TreeToLinkedListSolution{

	
	public static class Node{

		int val;
		Node left;
		Node right;
		
		public Node(int val){
			this.val=val;
		}

	}

	public static Node concatenate(Node a, Node b){

		if (a==null) return b;
		if (b==null) return a;

		Node aEnd = a.left;
		Node bEnd = b.left;

		aEnd.right = b;
		b.left = aEnd;

		a.left = bEnd;
		bEnd.right = a;

		return a;

	}

	public static Node treeToList(Node n){
		
		if (n==null) return null;

		Node left = treeToList(n.left);
		Node right = treeToList(n.right);

		n.left=n;
		n.right=n;

		n = concatenate(left, n);
		n = concatenate(n, right);

		return n;
		
	}


	public static void main(String[] args){

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);


		n2.left=n4;
		n2.right=n5;

		n3.left=n6;
		n3.right=n7;

		n1.left=n2;
		n1.right=n3;

		Node n = treeToList(n1);
		Node curr = n;		

		do{
			System.out.println(curr.val);
			curr = curr.right;
		} while(curr!=n);		

		
	}

}