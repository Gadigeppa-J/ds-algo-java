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

public class FibonacciNumberSolutionWithDP{


	public static int fib(int n){
		
		if (n<0) return -1;		
		if (n==0) return 0;

		int[] cache = new int[n+1];
		
		cache[1]=1;		
		for (int i = 2; i<cache.length; i++){
			cache[i]=-1;
		}
		
		return fib(n, cache);
		
	}

	public static int fib(int n, int[] cache){
		
		if (cache[n]>-1){
			return cache[n];
		}
		
		cache[n] = fib(n-1) + fib(n-2);		

		return cache[n];

	}
	
	public static void main(String[] args){
	
		System.out.println(fib(10));

	}

}