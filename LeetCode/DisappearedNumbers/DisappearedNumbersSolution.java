/**
* @author: Gadigeppa Muthu
* @date: 11-Apr-2020
*
* LeetCode: 448. Find All Numbers Disappeared in an Array (https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)
*
**/

import java.util.List;
import java.util.ArrayList;


public class DisappearedNumbersSolution{


	public List<Integer> findDisappearedNumbers(int[] nums) {

		for (int i = 0 ; i < nums.length; i++){

			int index = Math.abs(nums[i])-1;
			int indexVal = nums[index];

			if (indexVal>0){
				nums[index] = -indexVal;
			}
		}

		List<Integer> result = new ArrayList<>();

		for (int i = 0 ; i < nums.length; i++){
			if (nums[i]>0) result.add(i+1);			
		}
		
		return result;
	}
	
	public static void main(String[] args){
		
		DisappearedNumbersSolution obj = new DisappearedNumbersSolution();

		System.out.println(obj.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));

	}



}