package arrayPractice;
/*
 * This program is to find the triple duplicate of a String, if any.
 * Uses Brute Force Method
 */
import java.util.Arrays;

public class Arr9FindTripleDuplicates {

	public static void main(String[] args) {

		String[] myArray =  {"apple", "orange", "banana", "apple", "orange",
				"apple", "grape", "orange"};
		System.out.println("Original array: " + Arrays.toString(myArray));
		
		System.out.print("Duplicates found are: \n");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				for(int k = j + 1; k < myArray.length; k++) {
					if((myArray[i].equals(myArray[j])) && myArray[j].equals(myArray[k])) {
						System.out.println(myArray[k] + " ");
					}
				}
			}
		}		
	}
}
