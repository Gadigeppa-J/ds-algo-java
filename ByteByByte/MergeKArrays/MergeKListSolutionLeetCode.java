
import java.util.PriorityQueue;


public class MergeKListSolutionLeetCode{

	
	
	public static ListNode mergeKList(ListNode[] lists){

		if (lists.length==0){
			return null;
		}
		

		PriorityQueue<ListNode> ps = new PriorityQueue<>((o1, o2)->{
			return o1.val-o2.val;
		});
		
		for (int i = 0 ; i < lists.length; i++){

			if (lists[i]!=null){
				ps.add(lists[i]);
			}
		}

		ListNode headNode = new ListNode(0);
		ListNode currNode = headNode;


		while(ps.size()>0){

			ListNode node = ps.poll();
			currNode.next = new ListNode(node.val);
			currNode = currNode.next;

			if (node.next !=null){
				ps.add(node.next);
			}

		}

		return headNode.next;

	}


	public static void main(String[] args){
		

		ListNode ln00 = new ListNode(1);
		ListNode ln01 = new ListNode(4);
		ListNode ln02 = new ListNode(5);

		ln00.next = ln01;
		ln01.next = ln02;

		ListNode ln10 = new ListNode(1);
		ListNode ln11 = new ListNode(3);
		ListNode ln12 = new ListNode(4);

		ln10.next = ln11;
		ln11.next = ln12;


		ListNode ln20 = new ListNode(2);
		ListNode ln21 = new ListNode(6);

		ln20.next = ln21;
		
		ListNode[] lists = new ListNode[]{ln00 , ln10 , ln20};		
		
		ListNode h = mergeKList(lists);

		while(h!=null){
			System.out.println(h.val);
			h=h.next;			
		}
		

	}


}

class ListNode{
	int val; 
	ListNode next;
	public ListNode(int x){
		this.val=x;
	}
}