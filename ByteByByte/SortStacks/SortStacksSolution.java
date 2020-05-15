/**
* @author: Gadigeppa Muthu
* @date: 10-Apr-2020
* 
* Question: Given a stack, sort the elements in the stack using one additional stack.
*
* sort([1, 3, 2, 4]) = [1, 2, 3, 4]
*
**/

import java.util.Stack;

public class SortStacksSolution{


	public static Stack<Integer> sortStack(Stack<Integer> stack){

		if (stack==null || stack.isEmpty()) return stack;

		Stack<Integer> stack2 = new Stack<>();

		stack2.push(stack.pop());

		while(!stack.isEmpty()){

			int temp = stack.pop();

			while(!stack2.empty() && stack2.peek()>temp){
				stack.push(stack2.pop());
			}
			stack2.push(temp);
		}
		
		return stack2;
	}
	

	public static void main(String[] args){
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(5);
		stack.push(5);

		stack.push(9);
		stack.push(7);
		
		System.out.println(sortStack(stack));
		

	}
	
}