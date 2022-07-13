package com.dsa_prjt_handsOn;

public class InsertionSortHandsOn {
	public static void main(String[] args) {
		int[] arr = { -4, 10, 11, 5, 2, 13 };
		for (int fui = 1; fui < arr.length; fui++) {
			int newElement = arr[fui];
			int i;
			for (i = fui; i > 0 && arr[i - 1] > newElement; i--) {
				arr[i] = arr[i - 1];
			}
			arr[i] = newElement;
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
