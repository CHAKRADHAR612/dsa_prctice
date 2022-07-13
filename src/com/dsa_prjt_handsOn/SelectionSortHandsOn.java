package com.dsa_prjt_handsOn;

public class SelectionSortHandsOn {

	public static void main(String[] args) {
		Integer[] arr = {10,-4,11,5,2,13};
		//find out the largest element every time and push it to the end
		//next iteration don't consider it
		int largest=0,lastUnsortedIndex=arr.length-1,j=arr.length;
		while(j>0) {
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(arr[largest]<arr[i]) {
					largest=i;
				}
				
				if(i==lastUnsortedIndex) {
					swap(arr,largest,i);
					lastUnsortedIndex--;
					largest=0;
				}
			}
			j--;
		}
		for(Integer i : arr) {
			System.out.println(i);
		}
	}
	
	private static void swap(Integer[] arr, int i, int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

}
