import java.util.Random;

/**
* @author: Gadigeppa Muthu
* @date: 05-Apr-2020
* 
* Question: Implement a binary tree with a method getRandomNode() that returns a random node.*
* 
* getRandomNode() = 5
* getRandomNode() = 8
* getRandomNode() = 1*
*
**/

public class RandomBinaryTreeSolution{



	public static class Node{
		
		int val;
		Node left;
		Node right;
		int children;

		public Node(int val, int children){
			this.val=val;
			this.children=children;
		}


	}


	public static Node getRandomNode(Node node, int index){
		

		if (index == children(node.left)) {

			return node;

		}else if (index < children(node.left)){

			return getRandomNode(node.left, index);

		}else{

			return getRandomNode(node.right, index - (children(node.left)+1));

		}
		

	}

	
	public static int children(Node node){		
		if (node == null) return 0;
		return node.children + 1;
	}
	
	public static void main(String[] args){

		Node n1 = new Node(1, 0);
		Node n2 = new Node(2, 2);
		Node n3 = new Node(3, 0);
		Node n4 = new Node(4, 6);
		Node n5 = new Node(5, 0);
		Node n6 = new Node(6, 2);
		Node n7 = new Node(7, 0);
		
		n2.left = n1;
		n2.right = n3;

		n6.left = n5;
		n6.right = n7;

		n4.left = n2;
		n4.right = n6;

		Random rand = new Random();

		int randInt = rand.nextInt(6);

		System.out.println("index: " + randInt);

		System.out.println(getRandomNode(n4, randInt).val);
				
				
	}

}