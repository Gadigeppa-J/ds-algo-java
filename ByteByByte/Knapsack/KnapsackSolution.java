
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class KnapsackSolution{


	public static float maxProfit(List<Item> items, int maxWeight){
	
		Collections.sort(items, (o1, o2)->{
			
			if (o1.valPerUnit>o2.valPerUnit){
				return -1;
			}else if (o1.valPerUnit<o2.valPerUnit){
				return 1;
			}else{
				return 0;	
			}
		
		});
		
		float profit = 0;
		
		for (Item item : items){
			
			if (item.weight<=maxWeight){
				profit += item.value;
				maxWeight -= item.weight;
			}else{
				profit += (maxWeight * item.valPerUnit);
				maxWeight=0;
			}

			if (maxWeight<=0){
				break;
			}	
		
		}
		
		return profit;
	}
	
	public static void main(String[] args){
		
		List<Item> items = new ArrayList<>();
		items.add(new Item(2, 10));
		items.add(new Item(3, 5));
		items.add(new Item(5, 15));

		items.add(new Item(7, 7));
		items.add(new Item(1, 6));
		items.add(new Item(4, 18));
		items.add(new Item(1, 3));

		System.out.println(maxProfit(items, 15));

	}
	

}

class Item{

	int weight;
	int value;
	float valPerUnit;
	
	public Item(int weight, int value){
		this.weight=weight;
		this.value=value;
		this.valPerUnit=((float)value)/((float)weight);
	}
}