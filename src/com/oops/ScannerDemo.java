package com.oops;
/*
 * Scanner :to  take input from user
 * parameter as system.in
 * int nextInt()
 * float nextFloat()
 * 
 * String
 * next()  word   mansi gohil stops reading when space in pressed
 * nextLine()  line   mansi gohil stops reading when enter in pressed
 */
import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int a;
	System.out.println("enter a:");
	a=sc.nextInt();
	int b;
	System.out.println("enter b:");
	b=sc.nextInt();
	
	System.out.println("sum is :"+(a+b));
	
	int[][] arr=new int[3][4];
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println("enter value for arr["+i+"]["+j+"]:");
			arr[i][j]=sc.nextInt();
		}
	}
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(" "+arr[i][j]);
			
		}
		System.out.println();
	}
}
}
