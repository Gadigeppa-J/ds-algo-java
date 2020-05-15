
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class FindDuplicatesSolution{

	public static List<Integer> findDuplicates(int[] nums){
		int n = nums.length;
		int[] indexArray = new int[n];
		
		for (int i = 0 ; i < n; i++){
			indexArray[nums[i]-1] = indexArray[nums[i]-1] + 1;
		}

		List<Integer> duplicates = new ArrayList<>();
		
		for (int i = 0 ; i < n; i++){
			if (indexArray[i]>1){
				duplicates.add(i+1);
			}
		}
		
		return duplicates;
	}


	public static List<Integer> findDuplicates2(int[] nums){
	
		List<Integer> duplicates = new ArrayList<>();
		
		for (int i = 0; i < nums.length; i++){
			
			int k = Math.abs(nums[i]);

			int kIndex = nums[k-1];
			
			if (kIndex < 1){
				if (!duplicates.contains(k)){
					duplicates.add(k);
				}
			}else{
				nums[k-1] = -nums[k-1];
			}	
	
		}

		return duplicates;
	}
	
	public static void main(String[] args){
		
		int[] nums = new int[]{2, 1, 2, 1};
		System.out.println(findDuplicates2(nums));

	}

}