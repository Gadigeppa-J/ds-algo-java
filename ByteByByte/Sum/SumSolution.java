/**
* @author: Gadigeppa Muthu
* @date: 06-Apr-2020
* Question: Given two integers, write a function to sum the numbers without using any arithmetic operators.
* 
* LeetCode: 371. Sum of Two Integers (https://leetcode.com/problems/sum-of-two-integers/)
**/

public class SumSolution{

	public static int sum(int a, int b){
		
		if (a==0) return b;
		if (b==0) return a;

		int sum = 0;
		
		while(b!=0){			
			sum = a ^ b;
			int carry = a & b;
			a=sum;
			b=carry<<1;
		}		

		return sum;
		
		
	}
	
	public static void main(String[] args){
		
		System.out.println(sum(-2, 3));
		
	}


}