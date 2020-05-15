

public class MatrxiZeroSolution{


	public static void setZeros(int[][] matrix){
		
		int m = matrix.length;
		
		if (m<=0) return;

		int n = matrix[0].length;
		
		int[] colArr = new int[n];
		int[] rowArr = new int[m];

		for(int i = 0 ; i < m; i++){

			for(int j = 0; j < n; j++){
			
				if (matrix[i][j]==0){
					rowArr[i]=-1;
					colArr[j]=-1;
				}

			}

		}


		for(int i = 0; i < rowArr.length; i++){
			
			if (rowArr[i]=-1){
			
				for (int j = 0; j < n.length; j++){
					matrix[i][j] = 0;
				}
			}	
		
		}


		for(int i = 0 ; i < colArr.length; i++){
			if (colArr[i]==-1){
				for(int j = 0; j < m.length; j++){
					matrix[j][i] = 0;
				}
			}
		}
		
	} 


	public static void main(String[] args){
		
		int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
		setZeros(matrix)
		printMatrix(matrix);
		
	}

	
	public static void printMatrix(int[][] matrix){
		
		if (matrix.length<=0) return;
		
		for(int i = 0 ; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}		
		
	}

}