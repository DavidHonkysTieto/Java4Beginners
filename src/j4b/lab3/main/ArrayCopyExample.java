package j4b.lab3.main;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] positiveNumbers = numbers;

		//numbers[0] = -1;

		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(positiveNumbers));

	}

}
