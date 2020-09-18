package arrayPractice;
/*
 * This program is to find the index of the target element alredy present in the 
 * array, if not found returns -1.
 */
import java.util.Arrays;

public class Arr2FindIndex {
	public static void main(String[] args) {

		int[] myArray = new int [] {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};
		System.out.println("Original Array: " + Arrays.toString(myArray));
		System.out.println("Index position of 55 is: " + findIndex(myArray, 55));
		System.out.println("Index position of 13 is: " + findIndex(myArray, 13));	
	}

	public static int findIndex (int[] myArray, int target) {
		//Returns the index of the targeted element, if found
		//else returns -1, if not found
		for (int i = 0; i < myArray.length; i++) { 
			if(myArray[i] == target) {
				return i; 
			}
		}
		return -1; 
	}
}
