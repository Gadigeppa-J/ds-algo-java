/**
* @author: Gadigeppa Muthu
* @date: 19-Apr-2020
* 
* Question: Given a tree, write a function that prints out the nodes of the tree in level order.
* 
* traverse(tree) = 1 2 3 4 5 6 7
**/

import java.util.Queue;
import java.util.LinkedList;


public class TreeLevelOrderSolution{



	public static void traverse(Node head){
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(head);

		while(!queue.isEmpty()){
			
			Node n = queue.remove();

			System.out.println(n.val);
			
			if (n.left!=null){
				queue.add(n.left);
			}
			
			if (n.right!=null){
				queue.add(n.right);
			}
			
		}
		
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

		traverse(n1);

	}

}

class Node{
	int val;
	Node left;
	Node right;

	public Node(int val){
		this.val=val;
	}

}