package arrayPractice;
/*
 * This program is to find the average of the array.
 */
import java.util.Arrays;

public class Arr1FindAverage {
	public static void main(String[] args) {

		double sum = 0.0;
		int[] numbers = {13, 25, 38, 45, 56};
		System.out.println("Original array: " + Arrays.toString(numbers));
		for(int i = 0; i < numbers.length; i++) {
			sum += (double)numbers[i]; 
		}

		double avg = sum / numbers.length; 
		System.out.printf("Average value of the array elements is "+ "%.2f",avg);
	}
}
