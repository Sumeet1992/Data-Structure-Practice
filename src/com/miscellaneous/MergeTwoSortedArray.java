package com.miscellaneous;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,4,6,9,12};
		int[] arr2 = {2,3,5,8,10,11};
		
		int s1 =arr1.length;
		int s2 = arr2.length;
		int[] finalArr = new int[s1+s2];
		int i=0;
		int j=0;
		int k = 0;
		while(i<s1 && j<s2)
		{
			if(arr1[i]<arr2[j])
			{
				finalArr[k] = arr1[i];
//				in this case increase the counter for i as arr1[i]<arr2[j]
//				So the counter for the smaller element will be increased as it has been stored in the final array
				i++;
				k++;
			}
			else
			{
				finalArr[k] = arr2[j];
//				in this case increase the counter for i as arr1[i] > arr2[j]
//				So the counter for the smaller element will be increased as it has been stored in the final array
				j++;
				k++;
			}
		}
//		The remaining elements of the larger array will be stored in the final array
//		if arr1 was larger in size, its remaining elements will be stored
		while(i<s1)
		{
			finalArr[k++] = arr1[i++];
		}
//		if arr2 was larger in size, its remaining elements will be stored
		while(j<s2)
		{
			finalArr[k++] = arr2[j++];
		}
		System.out.println("Final merged sorted array is :");
		for(int c = 0;c<finalArr.length;c++)
		{
			System.out.print(finalArr[c]+" ");
		}
	}

}
