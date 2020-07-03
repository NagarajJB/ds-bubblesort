package com.njb.ds_sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] intArray = { 21, 35, -1, 7, 82, -22, 6 };

		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

			int largestIndex = 0;

			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largestIndex])
					largestIndex = i;
			}

			swap(intArray, largestIndex, lastUnsortedIndex);
		}

		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);

	}

	public static void swap(int[] array, int i, int j) {
		if (i == j)
			return;

		if (array[i] == array[j])
			return;

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
