package com.miscellaneous;

// Find prime numbers from 1 to n
public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50;
		int upperLimit = (int) Math.sqrt(n);

		boolean[] arr = new boolean[n+1];
//		Initially making values for all the numbers as true
		for(int i = 0;i<=n;i++){
			arr[i] = true;
		}
		for(int i = 2; i<=upperLimit;i++){
			if(arr[i] == true){
				for(int j = i ;j<=n;j+=i){
					if(j==i)
						continue;
					else {
//					Make all the multiples of i as false 
//					so that only the non-multiples will remain as true
					arr[j] = false;
					}
				}
			}
		}
 		System.out.println("Prime numbers are : ");
		for(int k = 2;k<arr.length;k++){
			if(arr[k] == true)
				System.out.print(k + " ");
		}
		
	}

}
