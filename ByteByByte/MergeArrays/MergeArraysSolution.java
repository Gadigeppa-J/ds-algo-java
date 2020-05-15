


public class MergeArraysSolution{


	public	static void merge(int[] nums1, int m, int[] nums2, int n){
		
		int a = m + n - 1;
		int b = m - 1;
		int c = n - 1;

		while(b >= 0 && c >= 0){

			if (nums1[b] < nums2[c]){
				nums1[a] = nums2[c];
				a--;
				c--;
			}else if (nums1[b]>=nums2[c]){
				nums1[a]=nums1[b];
				a--;
				b--;
			}
		}
	}

	public static void main(String[] args){
		
		int[] nums1 = new int[]{1,3,5,0,0,0};
		int[] nums2 = new int[]{2,4,6};
		
		merge (nums1, 3, nums2, 3);
		
		for (int i = 0 ; i < nums1.length; i++){
			System.out.println(nums1[i]);
		}
	}

}