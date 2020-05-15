/**
* @author: Gadigeppa Muthu
* @date: 08-Apr-2020
* 
* Question: Given a tree, write a function to find the length of the longest branch of nodes in increasing consecutive order.
*
**/


public class LongestConsecutiveBranchSolution{

	public static class TreeNode{
		
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val){
			this.val=val;		
		}
	}

	public static int longestConsecutiveBranch(TreeNode root, int val, int count){

		if (root==null) return count;

		if (root.val != val){
			count=0;
		} 

		count++;

		return Math.max(longestConsecutiveBranch(root.left, root.val+1, count), longestConsecutiveBranch(root.right, root.val+1, count));

	}
	
	public static void main(String[] args){

		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(1);
		TreeNode n3 = new TreeNode(2);

		n1.left=n2;
		n1.right=n3;





		TreeNode n8 = new TreeNode(3);
		TreeNode n9 = new TreeNode(2);
		TreeNode n10 = new TreeNode(4);

		n8.left=n9;
		n8.right=n10;
		
		n3.left=n8;


		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(1);
		TreeNode n6 = new TreeNode(3);

		n4.left=n5;
		n4.right=n6;


		TreeNode n7 = new TreeNode(0);
		
		n7.left=n1;
		n7.right=n4;
		
		System.out.println(longestConsecutiveBranch(n7, n7.val, 0));
		

	}


}