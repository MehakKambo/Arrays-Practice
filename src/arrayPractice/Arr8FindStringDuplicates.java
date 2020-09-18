package arrayPractice;
/*
 * This program is to find the duplicate of a String, if any.
 * Uses Brute Force Method
 */
import java.util.Arrays;

public class Arr8FindStringDuplicates {
	public static void main(String[] args) {

		String[] myArray =  {"apple", "orange", "kiwi", "mango", "banana", "apple",
		"kiwi"};
		System.out.println("Original array: " + Arrays.toString(myArray));
		System.out.println("Duplicates found are: ");
		for (int i = 0; i < myArray.length - 1; i++) {
			for (int j = i +1 ; j < myArray.length; j++) {
				if( (myArray[i].equals(myArray[j])) && (i != j) ) {
					System.out.println(myArray[j]);
				}
			}
		}
	}    
}
