/**
* @author: Gadigeppa Muthu
* @date: 19-Apr-2020
* 
* Question: Write an autocomplete class that returns all dictionary words with a given prefix.
* 
* dict: {"abc", "acd", "bcd", "def", "a", "aba"}
* prefix: "a" -> "abc", "acd", "a", "aba"
* prefix: "b" -> "bcd"
**/

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class AutocompleteSolution{


	private Node trie;
	
	public AutocompleteSolution(String[] dict){
		
		trie = new Node("");
		
		for (String word : dict){
			insertWord(word);
		}
		
	}
	
	private void insertWord(String word){
		
		Node curr = trie;

		for (int i = 0 ; i < word.length(); i++){
			
			if (!curr.map.containsKey(word.charAt(i))){
				curr.map.put(word.charAt(i), new Node(word.substring(0, i+1)));
			}
			
			curr=curr.map.get(word.charAt(i));
			if (i==word.length()-1) curr.isWord=true;
		}

	}	

	public List<String> getWordsForPrefix(String prefix){
		
		Node curr = trie;
		List<String> result = new ArrayList<>();		

		for (int i = 0 ; i < prefix.length(); i++){
			
			if (curr.map.containsKey(prefix.charAt(i))){
				curr = curr.map.get(prefix.charAt(i));
			}else{
				return result;
			}				
			
		}
		
		findAllChildWords(curr, result);
		return result;
	}

	public void findAllChildWords(Node node, List<String> result){
		
		if (node.isWord==true){
			result.add(node.prefix);
		}

		for (Character c : node.map.keySet()){
			findAllChildWords(node.map.get(c), result);
		}
		
	}

	
	public static void main(String[] args){
	
		String[] dict = new String[]{"abc", "acd", "bcd", "def", "a", "aba"};
				
		AutocompleteSolution autoComplete = new AutocompleteSolution(dict);
		
		//System.out.println(autoComplete.trie.map);		

			
		List<String> result = autoComplete.getWordsForPrefix("m");
		
		System.out.println(result);
		
		
	}	
	

}

class Node{

	String prefix;
	Map<Character, Node> map;
	boolean isWord;

	public Node(String prefix){
		this.prefix=prefix;
		map=new HashMap<>();
	}

}