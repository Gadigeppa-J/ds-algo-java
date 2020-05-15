/**
* @author: Gadigeppa Muthu
* @date: 19-Apr-2020
* 
* Question: Given a string, write a function to compress it by shortening every sequence of the same character to that character followed by the number of repetitions. If the
* compressed string is longer than the original, you should return the original string.
* 
* compress("a") = "a"
* compress("aaa") = "a3"
* compress("aaabbb") = "a3b3"
* compress("aaabccc") = "a3b1c3"
* 
**/

public class StringCompressionSolution{


	public static String compress(String str){
		
		String cmp="";
		int sum=1;
		
		for (int i =  0; i < str.length()-1; i++){
			
			if (str.charAt(i)==str.charAt(i+1)){
				sum++;
			}else{
				cmp = cmp + str.charAt(i) + sum;
				sum=1;
				
			}

		}			
		
		cmp = cmp + str.charAt(str.length()-1) + sum;	

		return cmp.length()<str.length()?cmp:str;		

	}

	public static void main(String[] args){		
		String compressed = compress("a");
		System.out.println(compressed);		
	}		


}