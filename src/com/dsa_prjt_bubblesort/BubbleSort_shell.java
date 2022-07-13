package com.dsa_prjt_bubblesort;

public class BubbleSort_shell {

	public static void main(String[] args) {
		int[] arr = { 11, 23, 5, -11, 10, -2 };
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
				for(int i=0;i+gap<arr.length;i+=gap) {
					if(arr[i]>arr[i+gap]) {
						swap(arr,i,i+gap);
					}
				}
			}
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}
	}
	public static void swap(int[] arr,int i, int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

}
