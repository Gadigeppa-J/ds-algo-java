/**
* @author: Gadigeppa Muthu
* @date: 29-Apr-2020
* 
* Question: Given a number, write a function to rotate the bits (ie circular shift).
* 
* rotate(0xFFFF0000, 8) = 0x00FFFF00
* rotate(0x13579BDF, 12) = 0xBDF13579
* rotate(0b10110011100011110000111110000000, 17) = 0b00011111000000010110011100011110
**/

public class RotateBitsSolution{
	
	static int INTEGER_BIT_COUNT = 32;
		

	public static int rotateRight(int num, int n){		
		return num>>n | num<<(INTEGER_BIT_COUNT-n);		
	}
	
	public static void main(String[] args){

		// 00110000000100010000000100011010 - 806420762
		// 01000000000000000000000000000000 - -780105720

		System.out.println(rotateRight(806420762, 5));
		
	}


}