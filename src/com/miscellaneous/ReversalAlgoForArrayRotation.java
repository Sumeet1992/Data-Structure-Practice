package com.miscellaneous;

public class ReversalAlgoForArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8};
//		number of rotations : 
		int r = 2;
		int n = arr.length;
		
//		Make 2 parts of array as n-r and r
		int[] arr1 = new int[n-r];
		int[] arr2 = new int[r];
		
		for(int i = 0;i<n-r;i++)
		{
			arr1[i] = arr[i];
			System.out.print(arr1[i] + " ");
		}
		for(int i = 0;i<r;i++)
		{
			arr2[i] = arr[n-r+i];
			System.out.print(arr2[i] + " ");
		}
		
//		Reversing both the arrays separately
		int s1 = 0;
		int e1 = arr1.length-1;
		while(s1<e1)
		{
			int temp = arr1[e1];
			arr1[e1] = arr1[s1];
			arr1[s1] = temp;
			s1++;
			e1--;
		}
		
		int s2 = 0;
		int e2 = arr2.length-1;
		while(s2<e2)
		{
			int temp = arr2[e2];
			arr2[e2] = arr2[s2];
			arr2[s2] = temp;
			s2++;
			e2--;
		}
		
//		Merge both the separate arrays
		int k = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(i >= (n-r))
			{
				arr[i] = arr2[k];
				k++;
			}
			else
			{
				arr[i] = arr1[i];
			}
		}
		
//		Reverse this final merged array
		
		int start = 0;
		int end = arr.length-1;
		while(start < end)
		{
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
		
		System.out.println("Final Rotated array is :");
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
