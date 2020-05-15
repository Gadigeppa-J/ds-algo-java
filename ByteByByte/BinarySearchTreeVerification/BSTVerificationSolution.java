/**
* @author: Gadigeppa Muthu
* @date: 09-Apr-2020
* 
* Question: Given a binary tree, write a function to test if the tree is a binary search tree.
*
* Leetcode: 98. Validate Binary Search Tree (https://leetcode.com/problems/validate-binary-search-tree/)
**/

public class BSTVerificationSolution{



	// Use long instead for int as the range of any node value can 
	// be equal to Integer MAX or MIN
	public static boolean bstUtil(Node root, long min, long max){
		
		if (root==null) return true;

		if (root.val>min && root.val < max && bstUtil(root.left, min, root.val) && bstUtil(root.right, root.val, max)){
			return true;
		}else{
			return false;
		}

	}

	
	
	public static boolean isValidBST(Node root){	
		return bstUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static void main(String[] args){
		
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);


		n2.left=n1;
		n2.right=n3;

		n7.left=n6;
		n7.right=n8;

		n5.left=n2;
		n5.right=n7;

		System.out.println(isValidBST(n5));

	}



}

class Node{
	
	int val;
	Node left;
	Node right;

	public Node(int val){this.val=val;}

}