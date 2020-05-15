/**
* @author: Gadigeppa Muthu
* @date: 23-Apr-2020
* 
* Question: Given a list of items with values and weights, as well as a max weight, find the maximum value you can generate from items where the sum of the weights is less than the max.
* 
* items = {(w:1, v:6), (w:2, v:10), (w:3, v:12)}
* maxWeight = 5
* knapsack(items, maxWeight) = 22
* 
**/

public class KnapsackRecursiveSolution{

	
	public static int knapsack(int[] weights, int[] values, int maxWeight, int bagWeight, int bagVal, int pointer){

		if (pointer>=weights.length){
			return bagVal;
		}
		
		// without
		int without = knapsack(weights, values, maxWeight, bagWeight, bagVal, pointer+1);

		// with
		bagWeight += weights[pointer];
		int with = -1;

		if (bagWeight<=maxWeight){
			with = knapsack(weights, values, maxWeight, bagWeight, bagVal+values[pointer], pointer+1);
		}
		

		return Math.max(with, without);

	}

	
	
	public static int knapsack(int[] weights, int[] values, int maxWeight){
		return knapsack(weights, values, maxWeight, 0, 0, 0);

	}
	

	public static void main(String[] args){
		
		System.out.println(knapsack(new int[]{5, 4, 6, 3}, new int[]{10, 40, 30, 50}, 10));

	}


}