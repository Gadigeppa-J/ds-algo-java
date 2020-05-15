
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.RuntimeException;



public class BuildOrderSolution{


	public static void main(String[] args){
		
		Map<String, List<String>> buildMap = new HashMap<>();
		buildMap.put("1", Arrays.asList("2"));
		buildMap.put("2", Arrays.asList("3"));
		buildMap.put("3", Arrays.asList("5", "2"));
		//buildMap.put("4", Arrays.asList("3"));
		//buildMap.put("c", Arrays.asList("d"));
		
		List<String> buildOrder = new ArrayList<>();
		
		for (String p : buildMap.keySet()){
			buildChain(p, buildOrder, new ArrayList<>(), buildMap);
		}		
		
		for (String p : buildOrder){
			System.out.println(p);
		}


	}
	
	public static void buildChain(String p, List<String> buildOrder, List<String> visitedBuild, Map<String, List<String>> buildMap){


		if (buildOrder.contains(p)){
			return;
		}
		
		if (!buildMap.containsKey(p)){
			buildOrder.add(p);
			return;
		}

		visitedBuild.add(p);

		for (String d : buildMap.get(p)){
			
			if (visitedBuild.contains(d)){
				//System.out.println("Error: cyclic dependency");
				throw new RuntimeException("Error: cyclic dependency for project - " + d);
				//return;
			}
			buildChain(d, buildOrder, visitedBuild, buildMap);
		}
		
		buildOrder.add(p);

	}

}