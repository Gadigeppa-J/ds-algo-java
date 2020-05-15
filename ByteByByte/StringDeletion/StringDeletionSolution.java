/**
* @author: Gadigeppa Muthu
* @date: 19-Apr-2020
* 
* Question: Given a string and a dictionary HashSet, write a function to determine the minimum number of characters to delete to make a word.
* 
* dictionary: ["a", "aa", "aaa"]
* query: "abc"
* output: 2
* 
**/

import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class StringDeletionSolution{


	
	public static int delete(Set<String> dict, String query){
		
		Queue<String> queue = new LinkedList<>();
		Set<String> queueElements = new HashSet<>();		

		queue.add(query);
		queueElements.add(query);		
			
		while(!queue.isEmpty()){
			
			String s = queue.remove();
			queueElements.remove(s);			

			if (dict.contains(s)){
				return query.length()-s.length();
			}		

			for (int i = 0 ; i < s.length(); i++){
				
				String sub = s.substring(0,i)+s.substring(i+1,s.length());
				
				if (!queueElements.contains(sub)){
					queue.add(sub);
					queueElements.add(sub);
				}
				

			}
		}

		return -1;

	}
	
	
	public static void main(String[] args){
		
		Set<String> dict = new HashSet<>();
		dict.add("a");
		dict.add("aa");
		dict.add("aaa");

		System.out.println(delete(dict, "abc"));		
		
	}

}