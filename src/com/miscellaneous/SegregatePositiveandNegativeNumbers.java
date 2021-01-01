package com.miscellaneous;

public class SegregatePositiveandNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {-1,2,3,-4,-2,7,0};
		
		System.out.println("Before Segregating : ");
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		int i = 0;
		int j = a.length - 1;
		
		while(true) {
			
			while(a[i] < 0 && i<j) {
				i++;
			}
			
			while(a[j] >=0 && i<j) {
				j--;
			}
			
			if(i<j) {
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			
			i++;
			j--;
			}
			else {
				break;
			}
			
			
		}
		
		System.out.println("After segregating : ");
		for(int k = 0; k<a.length; k++) {
			System.out.println(a[k]);
		}

	}

}
