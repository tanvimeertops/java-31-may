package com.oops;

import java.awt.print.Printable;
import java.security.PublicKey;

/*
 * Array :collection of data of similar type
 * starts with 0
 * size is len-1
 * 
 * return maximum sum [1,2,9,5]- Toms mathematical operation
 * Problem Description

You are given a string S.
 Write a function that counts how many vowels (a, e, i, o, u) 
 are present in the string.
Consider lowercase and uppercase letters as vowels.

Problem Constraints

1 ≤ |S| ≤ 10⁵

Input Format

First and only argument: string S.

Output Format

Return an integer — the count of vowels.

Example Input

S = "Hello World"


Example Output

3
12:08
 * 
 */

class Solve{
	public int countVowel(String data) {
		String str=data;
		
		String low_str=str.toLowerCase();
		char ch;
		int count=0;
		for (int i = 0; i <str.length(); i++) {
			ch=low_str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count+=1;
			}
		}
		return count;
	}
}
public class ArrayDemo {
public static void main(String[] args) {
	
	Solve s1=new Solve();
	System.out.println(s1.countVowel("Hello World"));

	
	
}
}
