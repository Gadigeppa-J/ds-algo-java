/**
* @author: Gadigeppa Muthu
* @date: 28-Apr-2020
* 
* Question: Given two integers, write a function to determine whether or not their binary representations differ by a single bit.
* 
* gray(0, 1) = true
* gray(1, 2) = false
**/

public class GrayCodeSolution{


	public static boolean isGrayCode1(int a, int b){

		int c = a ^ b;

		while(c>0){
			
			if (c%2==1){

				if (c>>1 ==0){
					return true;
				}else{
					return false;
				}
			}
			
			c=c>>1;
		}
	
		return false;

	}

	public static boolean isGrayCode2(int a, int b){
	
		int c = a ^ b;

		return (c&(c-1))==0;

	}
	
	public static void main(String[] args){
		System.out.println(isGrayCode2(1, 3));
	}

}