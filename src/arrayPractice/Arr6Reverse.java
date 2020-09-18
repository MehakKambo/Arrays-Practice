package arrayPractice;
/*
 * This program is to reverse an array.
 * MethodOne uses a for loop to print the elements from the end.
 * MethodTwo swaps every element like 1st with last, 2nd with second last and so on.
 */
import java.util.Arrays;

public class Arr6Reverse {
	public static void main(String[] args){

		int[] myArray = {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019};
		System.out.println("Original array: " + Arrays.toString(myArray));
		System.out.println();
		methodOne(myArray);
		System.out.println();
		methodTwo(myArray);
	}

	public static void methodOne(int arr[]) {
		System.out.println("Method One by printing from end:");
		System.out.print("Reversed array: ");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}


	public static void methodTwo(int arr[]) {
		System.out.println("\nMethod two by swapping elements: ");
		int arrSize = arr.length;
		for(int i = 0; i < arrSize / 2; i++) { 
			int temp = arr[i];
			arr[i] = arr[arrSize - i - 1];
			arr[arrSize - i - 1] = temp;
		}
		System.out.println("Reversed array : " + Arrays.toString(arr));
	}

}

