package com.search;


// Complexity : O(logn)
public class BinarySearch {

	public int[] sort(int a[]){
		int arr[] = a;
		int length = arr.length;
		int temp;
		for(int p = 0;p<length; p++){
			 for(int i = 0;i<length-1;i++){
				 if(arr[i] > arr[i+1]){
					 temp = arr[i];
					 arr[i] = arr[i+1];
					 arr[i+1] = temp;
				 }
			 }
		 }
		return arr;
	}
	public int bSearch(int ar[],int start, int end,int num){
		int s = start;
		int e = end;
		int mid = (s+e)/2;
		int index = 0;
		if(ar[mid] == num){
			index = mid;
		}
		else if(num < ar[mid]){
				index = bSearch(ar, s, mid-1, num);
			}
		else if(num > ar[mid]){
				index = bSearch(ar, mid+1, e, num);
			}
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomArr[] = {5,3,7,2,8,1,10};
		BinarySearch binarySearch = new BinarySearch();
		int sortedArr[] = binarySearch.sort(randomArr);
		for(int c=0; c<sortedArr.length;c++)
			System.out.print(sortedArr[c] + " ");
		System.out.println();
		System.out.println("element found at : "+binarySearch.bSearch(sortedArr, 0, sortedArr.length-1, 1));
		

	}

}
