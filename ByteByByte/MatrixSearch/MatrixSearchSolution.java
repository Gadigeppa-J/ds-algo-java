
public class MatrixSearchSolution{


	public static int findRowIndex(int[][] matrix, int min, int max, int number){
			
		if (min==max) return max;
		if ((min+1) == max){
			
			if (number >= matrix[max][0]){
				return max;
			}else if (number >= matrix[min][0]){
				return min;
			}else{
				return -1;
			}
		
		}


		int mid = ((max-min)/2) + min;

		if (matrix[mid][0]==number){
			return mid; 
		}else if (matrix[mid][0] > number){
			return findRowIndex(matrix, min, mid-1, number);
		}else{
			return findRowIndex(matrix, mid, max, number);
		}
		
	}

	public static int findColIndex(int[] array, int startIndex, int endIndex, int number){
		
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
			return findColIndex(array, startIndex, median, number);
		}else{
			return findColIndex(array, median+1, endIndex, number);
		}

	}
	
	
	public static boolean searchMatrix(int[][] matrix, int target){
		
		if (matrix.length==0 || matrix[0].length==0){ return false;}

		int rowIndex = findRowIndex(matrix, 0, matrix.length-1, target);
		
		if (rowIndex>=0){
			if (findColIndex(matrix[rowIndex], 0, matrix[rowIndex].length-1, target) >= 0){
				return true;
			}
		}

		
		return false;		
		
	}


	public static void main(String[] args){
			
		int[][] matrix = new int[][]{
						{1,   3,  5,  7},		
						{10, 11, 16, 20},
						{23, 30, 34, 50}
					};
		
		System.out.println(searchMatrix(matrix, 13));

	}



}