

public class ArraySearchSolution{


	public static int searchIndex(int[] array, int startIndex, int endIndex, int number){
		
		if (startIndex==endIndex){
			if (array[startIndex]==number){
				return startIndex;
			}else{
				return -1;
			}
		}

		int median = ((endIndex-startIndex)/2) + startIndex;

		if (array[median] == number){
			return median;
		}else if (array[median]>number){
			return searchIndex(array, startIndex, median, number);
		}else{
			return searchIndex(array, median+1, endIndex, number);
		}

	}
	
	public static void main(String[] args){
		
		int[] array = new int[]{1, 3, 7, 9, 13};
		
		int index = searchIndex (array, 0, array.length-1,13);
		
		if (index>=0){
			System.out.println(true);
		}else{
			System.out.println(false);
		}	
	}

}