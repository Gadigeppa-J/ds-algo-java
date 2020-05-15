/**
* @author: Gadigeppa Muthu
* @date: 23-Apr-2020
* 
* Question: Implement a Priority Queue
* 
**/

public class PriorityQueueSolution{

	Node head;
	int size;	

	public void push(int val){
		
		Node nwNode = new Node(val);
		
		if (head==null){
			head = nwNode;
		}else if(head.val>val){
			nwNode.next=head;
			head=nwNode;			
		}else{
			Node curr = head;			

			while(true){
				
				if (curr.next==null || curr.next.val > val){
					Node temp = curr.next;
					curr.next=nwNode;
					nwNode.next=temp;
					break;
			
				}
				
				curr=curr.next;
			}
		

		}
		
		size++;


	}


	public int pop(){
		
		if (isEmpty()) throw new RuntimeException("Queue is empty");
		
		int val = head.val;
		head = head.next;
		size--;

		return val;
	}


	public int peek(){
		if (isEmpty()) throw new RuntimeException("Queue is empty");
		return head.val;
	}

	public boolean isEmpty(){
		return head==null?true:false;
	}

	public int size(){
		return size;
	}
	
	public static void main(String[] args){
	
		PriorityQueueSolution pq = new PriorityQueueSolution();
		
		pq.push(2);		
		pq.push(1);
		pq.push(5);
		pq.push(3);
		pq.push(2);		
		//pq.push(4);
		

		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());

		pq.push(7);		
		pq.push(10);
		pq.push(6);
		pq.push(8);
		pq.push(9);
	
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
	
	}


}

class Node{

	int val;
	Node next;

	public Node(int val){
		this.val = val;
	}

}