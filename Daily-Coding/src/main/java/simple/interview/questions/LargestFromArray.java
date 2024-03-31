package simple.interview.questions;

public class LargestFromArray {

	public static void main(String[] args) {
		int[] numbers = { 14,4, 5, 6, 8, 10,12 };
		int largest = numbers[0];
		for (int num : numbers) {
			if (largest < num)
				largest = num;
		}
		System.out.println("largest from the Array is " + largest);

	}
}
