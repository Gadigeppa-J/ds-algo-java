

/**
* @author: Gadigeppa Muthu
* @date: 06-Apr-2020
* 
* Question: Given two nodes in a binary tree, write a function to find the lowest common ancestor.
* Binary Tree: 1, 2, 3, 4, 5, 6, 7  
*
* lcs(4, 3) = 1
* lcs(6, 7) = 3
*
**/

public class LowestCommonAncestorSolution{

	
	public static class TreeNode{
		
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val=val;
		}
	}

	
	public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){

		if (root==null) return null;
		
		TreeNode left = findLCA(root.left, p, q);
		TreeNode right = findLCA(root.right, p, q);

		if (root == p || root == q){
			return root;
		}else if (left != null && right != null){
			return root;
		}else if (left != null){
			return left;
		}else if (right != null){
			return right;
		}else {
			return null;
		}
		
	}

	public static void main(String[] args){
		
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);

		n2.left=n4;
		n2.right=n5;

		n3.left=n6;
		n3.right=n7;

		n1.left=n2;
		n1.right=n3;

		System.out.println(findLCA(n1, n4, n6).val);
		
	}


}