package com.miscellaneous;

// We have to segregate 0's, 1's , 2's together in the least time complexity.
// So, we do it in O(n)
// here we take 1 as the pole position. So, all the 0s will be before 1 and 
// all the 2s will be after 1
public class DutchNationalFlagAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0,0,1,2,0,1,0,0,1,2,2,1};
		
		int mid = 0;
		int low = 0;
		int high = arr.length-1;
		
		while(mid<=high)
		{
			switch(arr[mid])
			{
			case 0:
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
				break;
			case 1 :
				mid++;
				break;
			case 2:
				int t = arr[high];
				arr[high] = arr[mid];
				arr[mid] = t;
				high--;
				break;
			
			}
		}
		System.out.println("After segregating : ");
		for(int j = 0;j<arr.length;j++)
		{
			System.out.print(arr[j] + " ");
		}
	}

}
