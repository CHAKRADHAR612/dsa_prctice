package com.dsa_prjt_insertionsort;

public class InsertionSort_own {
	public static void main(String[] args) {
		int[] arr = { 20, 35, -11, 23, 11, 1, 9 };
		
		for(int firstUnsortedIndex=1;firstUnsortedIndex<arr.length;firstUnsortedIndex++) {			
			int newElement=arr[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex;i>=1&&arr[i-1]>newElement;i--) {				
				arr[i]=arr[i-1];
			}
			arr[i]=newElement;
		}
		for(int n=0;n<arr.length;n++) {
			System.out.println(n);
		}
	}
}
