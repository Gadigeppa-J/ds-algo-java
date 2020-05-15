/**
* @author: Gadigeppa Muthu
* @date: 10-Apr-2020
* 
* Question: Given a binary search tree, print out the elements of the tree in order without using recursion.
*
* LeetCode: 94. Binary Tree Inorder Traversal (https://leetcode.com/problems/binary-tree-inorder-traversal/)
*
**/

import java.util.Stack;


public class InorderTraversalSolution{


	public static void printInorder(Node root){
		
		Stack<Node> stack = new Stack<>();

		while(true){


			while(root!=null){
				stack.push(root);
				root=root.left;
			}

			if (stack.isEmpty()) break;

			Node n = stack.pop();
			System.out.println(n.val);
			root=n.right;
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


		n2.left=n1;
		n2.right=n3;

		n6.left=n5;
		n6.right=n7;

		n4.left=n2;
		n4.right=n6;
		
		printInorder(n4);
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