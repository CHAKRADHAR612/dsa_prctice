package com.dsa_prjt_insertionsort;

public class InsertionSort_pr1 {

	public static void main(String[] args) {
		int[] arr= {11,23,5,-11,10,-2};
		for(int firstUnsortedIndex=1;firstUnsortedIndex<arr.length;firstUnsortedIndex++) {
			int newElement=arr[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex;i>0&&arr[i-1]>newElement;i--) {
				arr[i]=arr[i-1];
			}
			arr[i]=newElement;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
