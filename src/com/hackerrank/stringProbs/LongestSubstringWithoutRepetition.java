package com.hackerrank.stringProbs;

import java.util.HashSet;

public class LongestSubstringWithoutRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabcdeacb";
		
		String longestSoFar = "";
		String longestTillNow = "";
		
		HashSet<Character> charSet = new HashSet();
		
		for(int i=0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(charSet.contains(c)) {
				longestTillNow = "";
				charSet.clear();
			}
			
			charSet.add(c);
			longestTillNow = longestTillNow + c;
			
			if(longestTillNow.length() > longestSoFar.length()) {
				longestSoFar = longestTillNow;
			}
			
		}
		
		System.out.println("Longest Substring is : "+longestSoFar);

	}

}
