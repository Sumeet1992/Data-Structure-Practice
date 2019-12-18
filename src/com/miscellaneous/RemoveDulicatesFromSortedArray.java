package com.miscellaneous;

public class RemoveDulicatesFromSortedArray {

//	This uses O(n) extra space
	public static void usingExtraSpace()
	{
		int arr[] = {1,2,2,3,3,3,4,4,5};
		int l = arr.length;
		int[] temp = new int[l];
		int j = 0;
		for(int i = 0;i<l-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j] = arr[l-1];
		System.out.println("Array after removing duplicates is : ");
		for(int k = 0;k<=j;k++){
			System.out.print(temp[k] + " ");
		}
	}

//	This uses O(1) extra space
	public static void usingConstantSpace()
	{

		int arr[] = {1,2,2,3,3,3,4,4,5};
		int l = arr.length;
		int j = 0;
		for(int i = 0;i<l-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[l-1];
		System.out.println("Array after removing duplicates is : ");
		for(int k = 0;k<=j;k++){
			System.out.print(arr[k] + " ");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		usingExtraSpace();
		usingConstantSpace();
	}

}
