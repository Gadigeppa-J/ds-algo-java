/**
* @author: Gadigeppa Muthu
* @date: 29-Apr-2020
* 
* Question: Given an integer, write a function to compute the number of ones in the binary representation of the number.
* 
* ones(0) = 0
* ones(1) = 1
* ones(2) = 1
* ones(3) = 2
* ones(7) = 3
* 
* LeetCode: 191. Number of 1 Bits (https://leetcode.com/problems/number-of-1-bits/)
**/

public class NumberOfOnesSolution{
	
	static int INTEGER_BIT_COUNT=32;

	public static int numberOfOnes(int num){
		
		int count = 0;
		
		for (int i = 0 ; i < INTEGER_BIT_COUNT; i++){			
			count += num & 1;
			num=num>>1;
		}		
		return count;

	}

	public static void main(String[] args){
		
		System.out.println(numberOfOnes(-2147483648));

	}	

}