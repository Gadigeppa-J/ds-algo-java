/**
* @author: Gadigeppa Muthu
* @date: 23-Apr-2020
* 
* Question: Given a list of strings, write a function to get the kth most frequently occurring string.
* 
* kthMostFrequent({"a","b","c","a","b","a"}, 0) = "a"
* kthMostFrequent({"a","b","c","a","b","a"}, 1) = "b"
* kthMostFrequent({"a","b","c","a","b","a"}, 2) = "c"
* kthMostFrequent({"a","b","c","a","b","a"}, 3) = null
* 
**/

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;


public class KthMostFrequentStringSolution{


	
	public static String freq(String[] array, int k){

		Map<String, Integer> map = new HashMap<>();

		for (String s : array){
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());	

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){				
				return o2.getValue().compareTo(o1.getValue());
			}

		});		
		
		return k<list.size()?list.get(k).getKey():null;
		
	}

	public static void main(String[] args){
		System.out.println(freq(new String[]{"a","b","c","a","b","a"}, 2));	
	}



}