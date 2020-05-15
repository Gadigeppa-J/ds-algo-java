/**
* @author: Gadigeppa Muthu
* @date: 27-Apr-2020
* 
* Question: Given an array containing all the numbers from 1 to n except two, find the two missing numbers.
* 
* missing([4, 2, 3]) = 1, 5
*
**/

public class TwoMissingNumbersSolution{


	public static int findOneMissingNum(int[] nums){

		int val1  = 0;
		int val2  = 0;
		
		for (int i=1; i<=nums.length+1; i++){
			val1 = val1^i;
		}
				
		for (int i=0; i<nums.length; i++){
			val2 = val2^nums[i];
		}
	
		return (val1^val2);

	}
	
	
	public static int[] twoMissingNumbers(int[] nums){

		int n = nums.length+2;
		
		int totalSum = (n*(n+1))/2;

		int arrSum = 0;
		for (int i = 0 ; i < nums.length; i++){
			arrSum += nums[i];
		}		
		
		int missingSum = totalSum - arrSum;

		int pivot = missingSum/2;

		if (missingSum%2==0){
			pivot-=1;
		}
		
		int pivotSum = 0 ;		
		for (int num : nums){
			if (num<=pivot){
				pivotSum += num;
			}
		}		

		int pivotIdealSum = (pivot*(pivot+1))/2;
		int fNum = pivotIdealSum-pivotSum;
		int sNum = missingSum - fNum;
	
		return new int[]{fNum, sNum};


	}
	

	public static void main(String[] args){
		
		//System.out.println(findOneMissingNum(new int[]{2, 3, 4}));	

		// System.out.println(2^3^3);		
		

		int[] nums = twoMissingNumbers(new int[]{1, 2, 4, 5, 6, 8, 9});
		
		System.out.println(nums[0] + ", " + nums[1]);

	}




}