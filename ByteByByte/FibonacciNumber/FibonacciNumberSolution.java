/**
* @author: Gadigeppa Muthu
* @date: 19-Apr-2020
* 
* Question: Given an integer n, write a function to compute the nth Fibonacci number.
* 
* fibonacci(1) = 1
* fibonacci(5) = 5
* fibonacci(10) = 55
* 
**/

public class FibonacciNumberSolution{

	
	public static int fibonacci(int n){	
		if (n<=0) return 0;
		if (n==1 || n==2) return 1;		
		return fibonacci(n-2)+fibonacci(n-1);
	}
	
	public static void main(String[] args){
		
		System.out.println(fibonacci(10));
	}


}