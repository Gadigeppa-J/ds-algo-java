/**
* @author: Gadigeppa Muthu
* @date: 26-Apr-2020
* 
* Question: Given an input amount of change x, write a function to determine the minimum number of coins required to make that amount of change
* 
* change(1) = 1
* change(3) = 3
* change(7) = 3
* change(32) = 4
* 
* LeetCode: 322. Coin Change (https://leetcode.com/problems/coin-change/)
* NOTE: This solutions fails in LeetCode with an error "Time Limit Exceeded". 
* This solution needs to be optimized further
*
**/


public class SmallestChangeRecursiveSolution{
	

	public static int coinChange(int[] coins, int amount, int[] cache){

		if (amount==0) return 0;
		if (cache[amount]>0) return cache[amount];		

		int min = Integer.MAX_VALUE;

		for (int coin : coins){
			if (amount-coin >=0){
				int c = coinChange(coins, amount-coin, cache);
				if (c>=0 && min>c+1){
					min=c+1;
				}
			}		
		}
		
		if (min==Integer.MAX_VALUE){
			min=-1;
		}else{
			cache[amount]=min;
		}		
	
		return min;

	}

	public static int coinChange(int[] coins, int amount){
		int[] cache = new int[amount+1];
		
		return coinChange(coins, amount, cache);
		
	}

	
	public static void main(String[] args){
	
		System.out.println(coinChange(new int[]{2}, 11));
		
		

	}	


}