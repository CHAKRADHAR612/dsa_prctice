package com.dsa_prjt_handsOn;

public class BubbleSortHandsOn {

	public static void main(String[] args) {
		int[] arr = {10,-4,11,5,2,13};
		int j=arr.length;
		while(j>0) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
			j--;
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

}
