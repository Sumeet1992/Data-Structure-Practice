package com.miscellaneous;

public class KadaneAlgo_MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,3,-2,-5,-5,-3,-2,-6,-3,-1};
		int start = 0;
		int end = 0;
		int s = 0;
		int maxSoFar = arr[0];
		int maxEndingHere = 0;
		for(int i = 0;i<arr.length;i++){
			maxEndingHere = maxEndingHere + arr[i];
			if(maxEndingHere > maxSoFar){
				maxSoFar = maxEndingHere;
				start = s;
				end = i;
			}
			if(maxEndingHere < 0){
				maxEndingHere = 0;
				s = i+1;
			}
		}
		
		int sum = 0;
		System.out.println("Max Result is between index "+ start+" and "+end);
		for(int j = start;j<=end;j++){
			sum+= arr[j];
		}
		System.out.println("Total sum is : "+sum);

	}

}
