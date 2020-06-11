package com.hackerrank.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxHourGlassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	
    	int[] hrGlass = new int[16];
    	int count = 0;
    	for(int i=0; i<4; i++){
    		for(int j=0; j<4; j++){
    			int firstRowSum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
    			int thirdRowSum = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
    			int midRow = arr[i+1][j+1];
    			int sum = firstRowSum + midRow + thirdRowSum ;
    			System.out.println(sum);
    			hrGlass[count] = sum;
    			count++;
    		}
    	}
    	Arrays.sort(hrGlass);
    	return hrGlass[15];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
System.out.println("max :"+result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
