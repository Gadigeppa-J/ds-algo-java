/**
* @author: Gadigeppa Muthu
* @date: 10-Apr-2020
*
* LeetCode: 155. Min Stack (https://leetcode.com/problems/min-stack/)
*
**/

import java.util.Stack;

public class MinStackWithAuxillaryStackSolution{

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> aux = new Stack<>();
    
    	public void push(int x) {
        	if (aux.isEmpty() || aux.peek()>=x){
			aux.push(x);
		}
		stack.push(x);
    	}
    
    	public void pop() {
        	int x = stack.pop();
		
		if (aux.peek()==x){
			aux.pop();
		}
    	}
    
    	public int top() {
        	return stack.peek();
    	}
    
    	public int getMin() {
        	return aux.peek();
    	}
	
	

	public static void main(String[] args){

		MinStackWithAuxillaryStackSolution minStack = new MinStackWithAuxillaryStackSolution();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());   
		minStack.pop();
		System.out.println(minStack.top());     
		System.out.println(minStack.getMin());   
	}
}