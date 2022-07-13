package com.dsa_prjt.shellsort;

public class ShellSort_own {

	public static void main(String[] args) {
		int[] arr = { 20, 35, -11, 23, 11, 1, 9 };
		for (int gap = arr.length / 2; gap >= 1; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int newElement = arr[i];
				int j = i;
				while (j >= gap && arr[j - gap] > newElement) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = newElement;
			}
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
