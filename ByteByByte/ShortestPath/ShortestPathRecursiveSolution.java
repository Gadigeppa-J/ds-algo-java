
/**
* @author: Gadigeppa Muthu
* @date: 04-Apr-2020
**/

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ShortestPathRecursiveSolution{
	

	public static void findPath(Map<Integer, List<Integer>> map, int startNode, int endNode, List<Integer> visited, List<List<Integer>> paths){


		if (visited.contains(startNode)) return;


		if (startNode == endNode){
			visited.add(startNode);
			paths.add(new ArrayList<>(visited));
			return;			
		}


		if (!map.containsKey(startNode)) return;
		
		for (Integer val : map.get(startNode)){
			visited.add(startNode);
			findPath(map, val, endNode, visited, paths);
			visited.remove(visited.size()-1);
		}				

	}


	public static void main(String[] args){
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		map.put(1, Arrays.asList(2, 3));
		map.put(2, Arrays.asList(5));
		map.put(5, Arrays.asList(4));
		map.put(4, Arrays.asList(3, 1));

		List<List<Integer>> paths = new ArrayList<>();
		
		findPath(map, 2, 3, new ArrayList<>(), paths);

		int min = Integer.MAX_VALUE;
		int index = -1;
		
		for (int i = 0 ; i < paths.size(); i++){
			
			if (paths.get(i).size()<min){
				min = paths.get(i).size();
				index = i;
			}
			
		}
		
		if (index > -1){
			System.out.println(paths.get(index));
		}else{
			System.out.println("No shortest path found!!");
		}
		

	}

}
