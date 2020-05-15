import java.lang.Math;

public class SolutionMatrixProduct{


	public static int matrixProduct(int[][] matrix, int i, int j){

		int m = matrix.length;
		int n = matrix[0].length;
		
		int rightProduct = 0;
		int downProduct = 0;

		if (i>=m-1 && j >= n-1){
			return matrix[i][j];
		}

		if (i < m-1){
			downProduct = matrixProduct(matrix, i+1, j);
		}

		if (j < n-1){
			rightProduct = matrixProduct(matrix, i , j+1);
		}

		int currentNumber = matrix[i][j];
		
		return Math.max(currentNumber*downProduct, currentNumber*rightProduct);

	}


	public static int matrixProduct2(int[][] matrix, int i, int j, int product){
		
		int m = matrix.length;
		int n = matrix[0].length;

		if (i >= m-1 && j >= n-1){
			return matrix[i][j] * product;
		}

		int downProduct = 0;
		int rightProduct = 0;
		product *= matrix[i][j];		


		if (i < m-1){
			downProduct = matrixProduct2(matrix, i+1, j, product);
		} 

		if (j < n-1){
			rightProduct = matrixProduct2(matrix, i, j+1, product);
		}
		
		return Math.max(downProduct, rightProduct);

	}
	
	public static void main(String[] args){
		int[][] matrix = new int[][]{{-1, 2, 3}, {4, 5, -6}, {7, 8, 9}};
		System.out.println(matrixProduct2(matrix, 0, 0, 1));
	}		
	

}