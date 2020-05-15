/**
* @author: Gadigeppa Muthu
* @date: 10-Apr-2020
* 
* Question: Implement a LIFO stack with basic functionality (push and pop) using FIFO queues to store the data.
*
* LeetCode: 225. Implement Stack using Queues (https://leetcode.com/problems/implement-stack-using-queues/)
*
**/

import java.util.Queue;
import java.util.LinkedList;

public class StackFromQueuesSolution{


	Queue<Integer> primary = new LinkedList<>();
	Queue<Integer> secondary = new LinkedList<>();	


	public void swapQueueReferences(){
		Queue<Integer> temp = primary;
		primary=secondary;
		secondary=temp;
	}
	

	public void push(int x){

		secondary.add(x);
		
		while(!primary.isEmpty()){
			secondary.add(primary.remove());
		}
		swapQueueReferences();

	}

	public int pop(){
		return primary.remove();
	}

	public int top(){
		return primary.element();
	}

	public boolean empty(){
		return primary.isEmpty();
	}
		

	public static void main(String[] args){

		StackFromQueuesSolution stack = new StackFromQueuesSolution();
		stack.push(1);
		stack.push(2);

		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		
	}


}