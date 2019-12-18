package com.miscellaneous;

public class ReverseArrayWithoutUsingExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			
			start = start + 1;
			end = end - 1;
		}
		
		System.out.println("After Reversing : ");
		for(int j = 0;j<arr.length;j++)
		{
			System.out.print(arr[j] + " ");
		}

	}

}
