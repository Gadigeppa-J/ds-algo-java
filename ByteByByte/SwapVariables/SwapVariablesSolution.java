/**
* @author: Gadigeppa Muthu
* @date: 27-Apr-2020
* 
* Question: Given two integers, write a function that swaps them without using any temporary variables.
* 
**/
public class SwapVariablesSolution{



	public static void main(String[] args){
		
		int a = 5;
		int b = 3;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("a: " + a + ", b: " + b );

	}


}



