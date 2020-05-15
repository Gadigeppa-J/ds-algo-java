/**
* @author: Gadigeppa Muthu
* @date: 23-Apr-2020
* 
* Question: Implement a Priority Queue
* 
**/

public class PriorityQueueWithArraySolution{
	
	int[] array;
	int size;	

	public PriorityQueueWithArraySolution(int cap){
		array=new int[cap];
	}	
	
	public void push(int val){		
		if (array.length==size) throw new IllegalStateException("Queue is full");
		
		int pos = size;
		
		array[pos]=val;
		
		while(pos!=0){
			
			int parent = ((pos+1)/2)-1;

			if (array[parent]>array[pos]){
				break;
			}
			
			swap(parent, pos);
			pos=parent;		
		}
		
		size++;

	}

	public int pop(){
		
		if (size==0) throw new IllegalStateException("Queue is empty");	
		
		int pos = 0;
		int res = array[pos];
		size--;		

		swap(pos, size);

		while(pos<size){

			int left = ((pos+1) * 2)-1;
			int right = left+1;
			
				
			if (right<size && array[right]>array[left]){
				
				if (array[pos]>=array[right]) break;		
				swap(pos, right);
				pos=right;

			}else if (left<size){

				if (array[pos]>=array[left]) break;		
				swap(pos, left);
				pos=left;
			}else {
				break;
			}


		}
		
		return res;
	
	}

	public int size(){
		return size;
	}

	public int peek(){
		if (size==0) throw new IllegalStateException("Queue is empty");	
		return array[0];
	}
		
	private void swap(int pos1, int pos2){
		
		int tmp = array[pos1];
		array[pos1]=array[pos2];
		array[pos2]=tmp;
		
	}

	public static void main(String[] args){

		PriorityQueueWithArraySolution pq = new PriorityQueueWithArraySolution(5);
		
		pq.push(2);		
		pq.push(1);
		pq.push(5);
		pq.push(3);
		pq.push(2);		
		//pq.push(4);

		
		System.out.println(pq.pop());				
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());

		/*
		pq.push(7);		
		pq.push(10);
		pq.push(6);
		pq.push(8);
		pq.push(9);
	
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
*/
	}	

}