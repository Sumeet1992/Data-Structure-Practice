package com.miscellaneous;

public class MinJumpsToReachEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3,2,3,4,5,1,2,8};
		int[] min_jump_arr = new int[arr.length];
		
		int n = arr.length;
		min_jump_arr[0] = 0;
		for(int i = 1;i<n;i++)
		{
			min_jump_arr[i] = 999999999;
		}
		for(int i = 1;i<n;i++)
		{
			for(int j = 0;j<i;j++)
			{
				if(i<= j+arr[j])
				{
					min_jump_arr[i] = (min_jump_arr[i] < min_jump_arr[j]+1 ? min_jump_arr[i] : min_jump_arr[j]+1);
				}
			}
		}
		
		for(int k = 0;k<n;k++)
		{
			System.out.print(min_jump_arr[k] + " ");
		}
		System.out.println();
		System.out.println("The minimum jump required is : "+min_jump_arr[n-1]);

	}

}
