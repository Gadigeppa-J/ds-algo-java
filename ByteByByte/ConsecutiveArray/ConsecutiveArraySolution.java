
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class ConsecutiveArraySolution{

	public static int longestConsecutive(int[] nums){
	
		Set<Integer> numSet = new HashSet<>();

		for (int i : nums){
			numSet.add(i);
		}

		int i = 0, length = 0, maxCount = 0;

		Iterator<Integer> itr = numSet.iterator();

		while(itr.hasNext()){
			int currNum = itr.next();
			
			while(numSet.contains(currNum++)){
				length++;
			}

			if (length > maxCount){
				maxCount = length;
			}
			i++;
			length=0;
		}

		return maxCount;

	}

	
	public static void main(String[] args){
		int[] nums = new int[]{100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(nums));
	}
}