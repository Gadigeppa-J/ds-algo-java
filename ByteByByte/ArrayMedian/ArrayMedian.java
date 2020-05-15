


public class ArrayMedian{


	
	public static float findMedian(int[] a, int[] b){
		
		int len = a.length + b.length;
		int mid = len/2;
		int[] c = new int[mid+1];
		int i = 0, j = 0, k = 0;

		while(true){
			
			
			if (i<a.length && j < b.length){


			if (a[i]<b[j]){
				c[k]=a[i];
				i++;
				k++;
			}else if (a[i]>b[j]){
				c[k]=b[j];
				j++;
				k++;
			}else{
				c[k]=a[i];
				i++;
				k++;
				
				if (k<c.length){
					c[k]=b[j];
					j++;
					k++;
				}
			}
	

			}else{

				if (i>=a.length){
					c[k]=b[j];
					k++;
					j++;	
				}else if (j>=b.length){
					c[k]=a[i];
					k++;
					i++;
				}				

			}



			if (k>=c.length){
				if (len%2==0){					
					return ((float)c[k-1] + (float) c[k-2])	/ 2;					
				}else{
					return c[k-1];			
				}
			}		

		}

	}
	
	public static void main(String[] args){
	
		int[] a = new int[]{2, 3, 5, 8};			
		int[] b = new int[]{10, 12, 14, 16, 18, 20};
		System.out.println(findMedian(a, b));			
	}



}
