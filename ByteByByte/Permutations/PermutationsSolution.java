
import java.util.List;
import java.util.ArrayList;

public class PermutationsSolution{

	
	/*
	public static void permutations(int[] nums, List<Integer> items, List<List<Integer>> result){

		if (nums.length==0){
			result.add(items);
		}

		for (int i = 0 ; i < nums.length; i++){
			
			List<Integer> lt = new ArrayList<>(items);
			lt.add(nums[i]);
			int[] nm = removeAtIndex(nums, i);

			permutations(nm, lt, result);		
	
		}

	}
	*/

	public static void permutations(int[] nums, List<Integer> permutation, boolean[] used, List<List<Integer>> result){

		if (nums.length == permutation.size()){			
			result.add(new ArrayList<>(permutation));	
			return;		
		}

		for (int i = 0 ; i < nums.length; i++){
			
			if (used[i]){
				continue;
			}

			used[i] = true;
			permutation.add(nums[i]);
			
			permutations(nums, permutation, used, result);

			permutation.remove(permutation.size()-1);
			used[i]=false;
			
		}
		
	}


	
	public static int[] removeAtIndex(int[] nums, int index){
		
		int[] result = new int[nums.length-1];
		int count = 0;
		
		for (int i=0; i < nums.length; i++){
			if (i != index){
				result[count] = nums[i];
				count++;
			}
		}

		return result;  
		
	}

	public static List<List<Integer>> permute(int[] nums){
		
		List<List<Integer>> result = new ArrayList<>();

		permutations(nums, new ArrayList<>(), new boolean[nums.length], result);
		return result;
	}
	

	public static void main(String[] args){
		int[] nums = new int[]{1, 2, 3};
		List<List<Integer>> result = permute(nums);
		System.out.println(result);
		System.out.println(result.size());
		
	}


}