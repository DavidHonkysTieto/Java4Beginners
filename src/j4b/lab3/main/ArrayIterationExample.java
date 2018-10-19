package j4b.lab3.main;

import java.util.Arrays;

public class ArrayIterationExample {

	public static void main(String[] args) {

		int[] source = { 1, 2, 3, 4, 5, 6 };
		int[] destination = new int[6];

		// Iterating through array
		for (int i = 0; i < source.length; ++i) {
			destination[i] = source[i];
		}

		// converting array to string
		System.out.println(Arrays.toString(destination));

	}

}
