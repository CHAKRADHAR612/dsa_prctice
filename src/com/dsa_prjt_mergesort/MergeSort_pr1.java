package com.dsa_prjt_mergesort;

public class MergeSort_pr1 {

	public static void main(String[] args) {
		int[] arr = { 11, 23, 5, -11, 10, -2 };
		mergeSort(arr,0,arr.length);
		for(int n:arr) {
			System.out.print(n+" ");
		}
	}
	
	public static void mergeSort(int[]arr,int start,int end) {
//		System.out.println("calling merge sort");
		if((end-start)<2) {
			return;
		}
		int mid=(start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid,end);
		merge(arr,start,mid,end);
	}
	
	public static void merge(int[]arr,int start,int mid,int end) {
		if(arr[mid-1]<=arr[mid]) {
			return;
		}
		int i=start;
		int j=mid;
		int tempIndex=0;
		int[]temp=new int[end-start];
		while(i<mid && j<end) {
			temp[tempIndex++]=arr[i]<=arr[j] ? arr[i++]:arr[j++];
		}
		System.arraycopy(arr, i, arr, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, arr, start, tempIndex);
	}

}
