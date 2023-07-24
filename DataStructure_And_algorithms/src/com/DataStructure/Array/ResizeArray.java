package com.DataStructure.Array;

public class ResizeArray {

	public void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public int[] resize(int[] arr, int capacity) {
		int [] temp=new int [capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		ResizeArray resizeAr=new ResizeArray();
		int[] original=new int[] {5,1,2,9,10};
		System.out.println("The size of original array -"+original.length);
		original=resizeAr.resize(original,10);
		System.out.println("The size of original array after resize -"+original.length);

	}

}
