
/**
* @author: Gadigeppa Muthu
* @date: 04-Apr-2020
**/

public class NstackSolution{


	int[] array;
	int[] topOfStack;
	int[] nextArray;
	int free;
	
	public NstackSolution(int capacity, int noOfStacks){
		
		array = new int[capacity];
		nextArray = new int[capacity];
		topOfStack= new int[noOfStacks];
		free = 0;

		for (int i = 0 ; i < topOfStack.length; i++){
			topOfStack[i] = -1;
		}

		for (int i = 0 ; i < nextArray.length; i++){
			
			if(i == nextArray.length-1){
				nextArray[i] = -1;
			}else{
				nextArray[i] = i + 1;
			}
		}
		
	}

	public void push(int stackNo, int value){
		if (free == -1) throw new RuntimeException("Stack overflow!!");
		int indexToAdd = free;
		array[indexToAdd] = value;
		free = nextArray[free];
		nextArray[indexToAdd]=topOfStack[stackNo];
		topOfStack[stackNo]=indexToAdd;
		
	}

	public int pop(int stackNo){		
		if (topOfStack[stackNo]==-1) throw new RuntimeException("Stack underflow!!");
		int stackTop = topOfStack[stackNo];		
		int result = array[stackTop];
		topOfStack[stackNo] = nextArray[stackTop];
		nextArray[stackTop]=free;
		free=stackTop;
		return result;
	}

	public static void main(String[] args){

		NstackSolution nstack = new NstackSolution(10, 3);
		
		nstack.push(0, 4);
		nstack.push(1, 5);
		nstack.push(2, 8);

		nstack.push(1, 12);
		nstack.push(2, 24);
		nstack.push(0, 36);

		nstack.push(2, 14);
		nstack.push(2, 6);
		nstack.push(0, 76);

		nstack.push(0, 5);
		
		
		try{
			nstack.push(0, 1);
			System.out.println("failed");
			return;
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		

		try{
			nstack.push(1, 1);
			System.out.println("failed");
			return;
		}catch(RuntimeException e){System.out.println(e.getMessage());}

		try{
			nstack.push(2, 1);
			System.out.println("failed");
			return;
		}catch(RuntimeException e){System.out.println(e.getMessage());}
		

		assert nstack.pop(0)==5;
		assert nstack.pop(0)==76;
		assert nstack.pop(0)==36;
		assert nstack.pop(0)==4;


		assert nstack.pop(1)==12;
		assert nstack.pop(1)==5;


		assert nstack.pop(2)==6;
		assert nstack.pop(2)==14;
		assert nstack.pop(2)==24;
		assert nstack.pop(2)==8;

		try{
			nstack.pop(0);
			System.out.println("failed");
			return;
		}catch(RuntimeException e){System.out.println(e.getMessage());}
		

		try{
			nstack.pop(1);
			System.out.println("failed");
			return;
		}catch(RuntimeException e){System.out.println(e.getMessage());}

		try{
			nstack.pop(2);
			System.out.println("failed");
			return;
		}catch(RuntimeException e){System.out.println(e.getMessage());}
		
	}



}