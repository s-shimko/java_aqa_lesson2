package by.htp.lesson2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Class1 cl1 = new Class1();
		// List list = new List();

		int numbers2[] = new int[] { 1, 55, 6, 7, 6, 79, 88, 33 };
		int[] numbers = new int[numbers2.length];

		System.out.println("Maximum value in array:");
		System.out.println(findMaxValue(numbers2));
		
		System.out.println("Minimum value in array:");
		System.out.println(findMinValue(numbers2));

		System.out.println("Array sorted in ascending order:");
		System.out.println(Arrays.toString(sort(numbers2, "asc"))); 
		
		System.out.println("");
		System.out.println("Array sorted in descending order:");
		System.out.println(Arrays.toString(sort(numbers2, "desc"))); 

	}

	public static int findMaxValue(int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}

	public static int findMinValue(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}

	public static int[] sort(int[] numbers, String order) {
		int temp = 0;
		int[] res = new int[numbers.length];
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers.length - 1; i++) {
				if (order == "asc") {
					if (numbers[i] > numbers[i + 1]) {
						temp = numbers[i + 1];
						numbers[i + 1] = numbers[i];
						numbers[i] = temp;
					}
				}
				if (order == "desc") {
					if (numbers[i] < numbers[i + 1]) {
						temp = numbers[i + 1];
						numbers[i + 1] = numbers[i];
						numbers[i] = temp;
					}
				}
			}
		}
		res = numbers;
		return res;
	}
}
