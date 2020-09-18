package arrayPractice;
/*
 * This program is to insert an element at the given index.
 * Replaces the element at given index with the target element
 */
import java.util.Arrays;

public class Arr4InsertElement {
	public static void main(String[] args) {

		int[] myArray =new int[] {10, 10, 10, 10, 10, 10};
		int index = 3;
		int newValue = 12;

		System.out.println("Original Array : "+Arrays.toString(myArray)); 
		System.out.println("After adding " + newValue + " at index " + index);

		for(int i = myArray.length - 1; i > index; i--){
			myArray[i] = myArray[i - 1]; 
		}
		myArray[index] = newValue;   
		System.out.println("\nNew Array: " + Arrays.toString(myArray));
	}
}

