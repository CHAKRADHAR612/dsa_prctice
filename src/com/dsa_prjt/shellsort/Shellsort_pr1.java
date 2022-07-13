package com.dsa_prjt.shellsort;

public class Shellsort_pr1 {

	public static void main(String[] args) {
		int[] arr = { 11, 23, 5, -11, 10, -2 };
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int newElement = arr[i];
				int j = i;
				for (j = i; j >= gap && arr[j - gap] > newElement; j -= gap) {
					arr[j] = arr[j - gap];
				}
				arr[j] = newElement;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
