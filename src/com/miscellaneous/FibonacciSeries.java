package com.miscellaneous;

public class FibonacciSeries {

	public static void fibonacciWithoutRecursion(int index)
	{
		int[] a = new int[index+1];
		a[0] = 0;
		a[1] = 1;
		
		for(int i = 2;i<=index;i++){
			a[i] = a[i-1] + a[i-2];
		}
		
		for(int j = 0;j<a.length;j++)
		{
			System.out.print(a[j] + " ");
		}
	}
	
	public static int fibonacciUsingRecursion(int index)
	{
		if(index == 0 || index == 1)
		{
			return 1;
		}
		return fibonacciUsingRecursion(index-1) +fibonacciUsingRecursion(index-2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciWithoutRecursion(6);
		System.out.println("Using recursion : ");
		int ind = 6;
		for(int i = 0;i<=6;i++){
			System.out.print(fibonacciUsingRecursion(i)+ " ");
		}
	}

}
