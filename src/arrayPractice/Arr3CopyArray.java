package arrayPractice;
/*
 * This program is to copy one array into another one.
 */
import java.util.Arrays;

public class Arr3CopyArray {
	public static void main(String[] args) {

		int[] myArray = {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};
		int[] newArray = new int[10];     


		for(int i = 0; i < myArray.length; i++) { 
			newArray[i] = myArray[i]; 
		}
		System.out.println("Original Array : " + Arrays.toString(myArray));
		System.out.println("New Array: " + Arrays.toString(newArray));
	}
}

