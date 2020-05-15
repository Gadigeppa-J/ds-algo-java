/**
* @author: Gadigeppa Muthu
* @date: 10-Apr-2020
*
* Question: Implement a LIFO stack that has a push(), pop(), and max() function, where max() returns the maximum value in the stack. All of these functions should run in O(1) time.
*
* push(1)
* max() = 1
* push(2)
* max() = 2
* push(1)
* max() = 2
* pop() = 1
* max() = 2
* pop() = 2
* max() = 1
*
**/

import java.util.Stack;

public class MaxStacksWithAuxiliaryStackSolution{


	Stack<Integer> stack = new Stack<>();
	Stack<Integer> aux = new Stack<>();

	public void push(int x){
		
		if (aux.isEmpty() || aux.peek()<=x){
			aux.push(x);
		}
		stack.push(x);

	}

	
	public int pop(){
		
		int x = stack.pop();
		
		if (aux.peek()==x){
			aux.pop();
		}
		return x;
	}

	public int getMax(){
		return aux.peek();
	}
	
	
	public static void main(String[] args){
		
		MaxStacksWithAuxiliaryStackSolution stack = new MaxStacksWithAuxiliaryStackSolution();

		stack.push(1);
		System.out.println(stack.getMax());

		stack.push(2);
		System.out.println(stack.getMax());


		stack.push(1);
		System.out.println(stack.getMax());

		System.out.println(stack.pop());
		System.out.println(stack.getMax());

		System.out.println(stack.pop());
		System.out.println(stack.getMax());
		

	}



}