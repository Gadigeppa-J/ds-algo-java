/**
* @author: Gadigeppa Muthu
* @date: 18-Apr-2020
* 
* Question: Given a list of integers, write a function that returns all sets of 3 numbers in the list, a, b, and c, so that a + b + c == 0
* 
* threeSum({-1, 0, 1, 2, -1, -4})
* [-1, -1, 2]
* [-1, 0, 1]
*
**/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ThreeSumSolution{

	public static List<List<Integer>> threeSum(int[] nums) {
		
		Arrays.sort(nums);		

		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0 ; i < nums.length-2; i++){

			if (i>0 && nums[i]==nums[i-1]){continue;}
			
			int j=i+1;
			int k=nums.length-1;

			while(j<k){
				//System.out.println(nums[i]);

				if (j>i+1 && nums[j]==nums[j-1]){
					j++;
					continue;
				}

				if (k<nums.length-1 && nums[k]==nums[k+1]){
					k--;
					continue;
				}

				int sm = nums[i] + nums[j] + nums[k];
				
				if (sm==0){
					result.add(Arrays.asList(nums[i], nums[j], nums[k]));
					

					j++;
					k--;

					
				}else if (sm>0){


					k--;


				}else{


					j++;


				}
			
			}
			
		}	

		return result;
	
	}


	public static void main(String[] args){
		
		List<List<Integer>> result = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
		System.out.println(result);
	}

}
