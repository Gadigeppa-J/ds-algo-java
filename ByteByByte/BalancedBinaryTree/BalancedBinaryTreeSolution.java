/**
* @author: Gadigeppa Muthu
* @date: 09-Apr-2020
* 
* Question: Given a binary tree, write a function to determine whether the tree is balanced.
*
* Leetcode: 110. Balanced Binary Tree (https://leetcode.com/problems/balanced-binary-tree/)
**/

public class BalancedBinaryTreeSolution{



	public static int isBalanced(Node root){
		
		if (root==null) return 0;

		int left = isBalanced(root.left);
		int right = isBalanced(root.right);
		
		if (left == -1) return -1;
		
		if (right == -1) return -1;

		if (Math.abs(left-right)>1) return -1;
		
		return Math.max(left, right) + 1;

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
		n6.left = n7 ;

		n1.left=n2;
		n1.right=n3;

		int num = isBalanced(n1);

		if (num>=0){
			System.out.println("Tree is balanced");
		}else{
			System.out.println("Tree is not balanced");
		}


	}

}

class Node{
	
	int val;
	Node left;
	Node right;

	public Node(int val){this.val=val;}

}