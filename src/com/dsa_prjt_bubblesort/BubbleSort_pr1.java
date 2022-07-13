package com.dsa_prjt_bubblesort;

public class BubbleSort_pr1 {

	public static void main(String[] args) {
		int[] arr = { 11, 23, 5, -11, 10, -2 };
		int j=arr.length-1;
		while(j>0) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {				
					swap(arr,i,i+1);
				}
			}
		j--;
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
