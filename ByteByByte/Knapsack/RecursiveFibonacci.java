
public class RecursiveFibonacci{

	public static int fib(n){
		
		if (n<=1){
			return n;
		}
		
		return fib(n-1) + fib(n-2);

	}	
	
	public static void main(String[] args){
		System.out.println(fib(7));
	}	

}