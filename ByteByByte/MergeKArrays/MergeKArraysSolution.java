

import java.util.PriorityQueue;


public class MergeKArraysSolution{

	
	public static class QueueNode implements Comparable<QueueNode>{
		
		int array, index, value;
		
		public QueueNode(int array, int index, int value){
			this.array=array;
			this.index=index;
			this.value=value;
		}
		
		public int compareTo(QueueNode o){
			return this.value - o.value;
		}
		
	}




	public static int[] mergeArrays(int[][] arrays){
		
		PriorityQueue<QueueNode> ps = new PriorityQueue<>();
		
		if (arrays.length == 0){
			return new int[0];
		}

		int size = 0;

		for (int i = 0; i < arrays.length; i++){
			
			if (arrays[i].length > 0){
				size += arrays[i].length;
				ps.add(new QueueNode(i, 0, arrays[i][0]));
			}
			
		}


		int[] merged = new int[size];
		int index = 0;

		while(ps.size()>0){
			
			QueueNode node = ps.poll();
			merged[index] = node.value;
			index++;

			if (node.index < arrays[node.array].length - 1){
				ps.add(new QueueNode(node.array, node.index + 1, arrays[node.array][node.index+1]));
			}
		}

		return merged;
		
	}

	public static void main(String[] args){
		
		int[][] arrays = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
		int[] merged = mergeArrays(arrays);
		
		for (int i = 0 ; i < merged.length; i++){
			System.out.println(merged[i]);
		}		
	}

}