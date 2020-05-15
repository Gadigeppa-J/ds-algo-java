

/**
* @author: Gadigeppa Muthu
* @date: 04-Apr-2020
**/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class ShortestPathSolution{

	public static class Node{

		int val;
		List<Node> nodes;
		
		public Node(int val){
			this.val=val;
		}

		public String toString(){return val+"";}

	}


	public static List<Node> shortestPath(Node start, Node end){

		Map<Node, Node> parents = new HashMap<>();
		Queue<Node> queue = new LinkedList<>();	
		
		queue.add(start);
		parents.put(start, null);

		while(!queue.isEmpty()){
			
			Node curr = queue.remove();
			
			if (curr==end) break;
	
			for (Node child : curr.nodes){
				if (!parents.containsKey(child)){
					queue.add(child);
					parents.put(child, curr);

				}
			}		


		}

		List<Node> result = new ArrayList<>();

		if (parents.containsKey(end)){

			Node curr = end;

			while(curr!=null){
				result.add(0, curr);
				curr=parents.get(curr);
			}
		}
			
		return result;
		 
	}



	public static void main(String[] args){
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		n1.nodes = Arrays.asList(n2, n3);
		n2.nodes = Arrays.asList(n5);
		n5.nodes = Arrays.asList(n4);
		n4.nodes = Arrays.asList(n3, n1);

		System.out.println(shortestPath(n2, n3));
		
	}


}