package com.sort;

public class SelectionSort {

//	In selectio sort, the smallest element comes to first in the 
//	first pass and the fixed pointer points to the next location  
	
//	Time complexity is O(n^2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,1,2,9,3,5,4,10,12,11};
//		i is the fixed pointer
		for(int i = 0;i<arr.length;i++)
		{
//			j is the variable pointer
			for(int j = i+1;j<arr.length;j++)
			{
				int temp;
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("After Selection sorting : ");
		for(int k = 0;k<arr.length;k++)
		{
			System.out.print(arr[k] + " ");
		}
	}

}
