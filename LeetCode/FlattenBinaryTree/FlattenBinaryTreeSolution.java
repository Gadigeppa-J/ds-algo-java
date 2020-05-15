
/**
* @author: Gadigeppa Muthu
* @date: 07-Apr-2020
* 
* LeetCode: 114. Flatten Binary Tree to Linked List
*
**/

public class FlattenBinaryTreeSolution{


	public static class TreeNode{
		
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val){
			this.val=val;		
		}
	}

	public static void flatten(TreeNode root){

		if (root==null) return;

		flatten(root.left);
		flatten(root.right);

		if (root.left!=null){

			TreeNode curr = root.left;
			
			while(curr.right!=null){
				curr = curr.right;
			}

			curr.right=root.right;

			root.right=root.left;
			root.left=null;

		}


	}
	
	public static void main(String[] args){

		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);

		n2.left=n3;
		n2.right=n4;

		n5.right=n6;

		n1.left=n2;
		n1.right=n5;

		flatten(n1);


		while(n1!=null){
			System.out.println(n1.val);
			n1=n1.right;
		}

		
		

	}
}