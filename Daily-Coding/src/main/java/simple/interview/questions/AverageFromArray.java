package simple.interview.questions;

import java.util.Scanner;

public class AverageFromArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size");
		int Size = scanner.nextInt();
		int[] nums = new int[Size];
		for (int i = 0; i < Size; i++) {

			System.out.println("Enter Numbers");
			nums[i] = scanner.nextInt();

			double sum = 0;
			for (int num : nums) {
				sum += num;
			}
			double average = sum / nums.length;
			System.out.println("avg " + average);

		}
	}
	// HardCoded
//		int[] nums = {3,5,6,8,10,24,53};
//		double sum = 0;
//		for(int num:nums) {
//			sum+=num;
//		}
//		double average = sum/nums.length;
//		System.out.println("avg "+ average);
//
//	}

}
