
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class ZeroSumSubarraySolution{

	
	public static int[] subArray(int[] array){

		
		Map<Integer, Integer> map = new HashMap<>();

		int[] subarray = new int[0];
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++){
			
			sum += array[i];

			if (map.containsKey(sum)){

				return Arrays.copyOfRange(array, map.get(sum) + 1, i+1);

			}else if (sum == 0){


				return Arrays.copyOfRange(array, 0, i+1);

			}else{
				map.put(sum, i);
			}
			
		}

		return subarray;

	}

	public static void main(String[] args){
	
		int[] array = new int[]{1, 2, -5, 1, 2, -1};
		int[] subarray = subArray(array);
		
		for (int i = 0 ; i < subarray.length; i++){
			System.out.println(subarray[i]);
		}
	}


}