package com.hackerrank.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftArrayRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	
    	int size = a.length;
    	int[] arr1 = new int[d];
    	int[] arr2 = new int[size-d];
    	for(int i = 0; i<size-d; i++){
    		arr2[i] = a[d+i];
    	}
    	for(int j = 0;j<d;j++){
    		arr1[j] = a[j];
    	}
    	
    	int s1 = 0;
    	int e1 = arr1.length-1;
    	while(s1<e1){
    		int temp = arr1[s1];
    		arr1[s1] = arr1[e1];
    		arr1[e1] = temp;
    		s1++;
    		e1--;
    	}
    	int s2 = 0;
    	int e2 = arr2.length-1;
    	while(s2<e2){
    		int temp = arr2[s2];
    		arr2[s2] = arr2[e2];
    		arr2[e2] = temp;
    		s2++;
    		e2--;
    	}
    	int c = 0;
    	for(int k = 0;k < size; k++){
    		if(k < d){
    			a[k] = arr1[k];

    		}
    		else{
    			a[k] = arr2[c];
    			c++;
    		}
    	}
    	
    	int start = 0;
		int end = a.length-1;
		while(start < end)
		{
			int temp = a[end];
			a[end] = a[start];
			a[start] = temp;
			start++;
			end--;
		}

    	return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
	
}
