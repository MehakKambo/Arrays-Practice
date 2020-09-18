package arrayPractice;
/*
 * This program is to find the maximum and minimum value
 * in an array.
 */
import java.util.Arrays;

public class Arr5FinMaxMin {

	public static void main(String[] args) {

		int[] myArray = {10, 20 , 22, -1, 99, 0};

		System.out.println("Original Array: " + Arrays.toString(myArray));
		int max = getMax(myArray);
		int min = getMin(myArray);
		System.out.println("Maximum value in the above array = " + max);
		System.out.println("Minimum value in the above array = " + min);
	}


	public static int getMin(int[] arr) {
		int minVal = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < minVal) {
				minVal = arr[i];
			}
		}
		return minVal;
	}

	public static int getMax(int[] arr) {
		int maxVal = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
}
