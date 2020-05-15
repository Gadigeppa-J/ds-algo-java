/**
* @author: Gadigeppa Muthu
* @date: 07-Apr-2020
* 
* Question: Given a stack, reverse the items without creating any additional data structures. 
*
* reverse(1->2->3) = 3->2->1
*
**/

import java.util.Stack;

public class ReverseStackSolution{


	public static void pushToBottom(Stack<Integer> stack, Integer num){

		if (stack.isEmpty()){
			stack.push(num);
			return;
		}

		int val = stack.pop();
		pushToBottom(stack, num);
		stack.push(val);

	}
	
	public static void reverse(Stack<Integer> stack){
		
		if (stack.isEmpty()){
			return;
		}

		int val = stack.pop();
		reverse(stack);
		pushToBottom(stack, val);	
	
	}

	public static void main(String[] args){

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		reverse(stack);

		System.out.println(stack);
		
	}

}