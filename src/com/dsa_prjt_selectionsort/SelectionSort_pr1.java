package com.dsa_prjt_selectionsort;

public class SelectionSort_pr1 {

	public static void main(String[] args) {
		int[] arr= {11,23,5,-11,10,-2};
		int largest=0;
		for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			for(int i=0;i<=lastUnsortedIndex;i++) {
				if(arr[largest]<arr[i]) {
					largest=i;
				}
			}
			swap(arr, lastUnsortedIndex, largest);
			largest=0;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

}
