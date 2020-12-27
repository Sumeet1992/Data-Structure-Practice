package com.sort;

import java.util.ArrayList;
import java.util.Arrays;

// Complexity O(n^2)
public class BubbleSort {

//	In bubble sort, every ith element is compared with
//	(i+1)th element in every iteration through the array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,1,1,0,0,1,1};
		int length = arr.length;
		int temp;
		System.out.println("Before Bubble Sort : ");
		for(int c=0; c<length;c++)
			System.out.print(arr[c] + " ");
		System.out.println();
		
		 for(int p = 0;p<length; p++){
			 
			 for(int i = 0;i<length-1;i++){
				 if(arr[i] > arr[i+1]){
					 temp = arr[i];
					 arr[i] = arr[i+1];
					 arr[i+1] = temp;
				 }
			 }
		 }
		 System.out.println("After Bubble Sort : ");
		 for(int c=0; c<length;c++)
				System.out.print(arr[c] + " ");
	}

}
