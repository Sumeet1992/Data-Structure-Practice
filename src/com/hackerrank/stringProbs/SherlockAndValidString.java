package com.hackerrank.stringProbs;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class SherlockAndValidString {



    // Complete the isValid function below.
    static String isValid(String s) {

//        String s = null;
        int l = s.length();
        Map<String,Integer> countMap = new HashMap<String,Integer>();
        for(int i = 0;i<l;i++){
        	String ch = String.valueOf(s.charAt(i));
            if(countMap.containsKey(ch)){
                countMap.put(ch,countMap.get(ch) + 1);
            }
            else{
                countMap.put(ch,1);
            }
        }
        List<Integer> values = new ArrayList<Integer>();
        
        for(Map.Entry m : countMap.entrySet()	){
			System.out.println(m);
			values.add((Integer)m.getValue());
		}
        int size = values.size();
        for(int i=0; i<=size-1; i++){


        }
        for(int i : values)
        System.out.println(i);
        return null;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
	
}
