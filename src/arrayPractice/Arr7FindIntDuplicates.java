package arrayPractice;
/*
 * This program is to find any duplicates in the array, if any.
 * Uses Brute Force Method.
 */
import java.util.Arrays;
public class Arr7FindIntDuplicates {
	public static void main(String[] args) {
		
		
		int[] myArray = {1, 2, 3, 3, 4, 5, 6, 2};
		System.out.println("Original Array: " + Arrays.toString(myArray));
		System.out.println("Duplicates found are: ");
		
		for (int i = 0; i < myArray.length - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {				
				if ((myArray[i] == myArray[j])) {
					System.out.println(myArray[j]);
				}
			}
		}
	}    
}
