package com.oops;

import java.util.Scanner;

/*// Consecutive Duplicates
	//aabbccdaa
	//abcda
 * Jagged Array: same as 2 D array 
 * eg:
 * 1 3 4
 * 1
 * 1 5 6 7
 * 4 8 9 7 9
 * 
 * nrow=4
 * ncol= 3,1,4,5
 */
public class JaggedArray {
	public static void main(String[] args) {
//		char[] ch= {'a','a','b','b','c','c','d','a','a'};
//		char[] non_dup=new char[12];
//		for(int i=0;i<ch.length-1;i++) {
//			if(ch[i]==ch[i+1]) {
//			//ch[7]==ch[8]
//			//a==a
//				non_dup[i]=ch[i];
//			}
//		}
//		
//		for (int i = 0; i < non_dup.length; i++) {
//			System.out.println(non_dup[i]);
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row:");
		int nrow=sc.nextInt(); //4
		int col;
		int[][] a=new int[nrow][];
		for (int i = 0; i < nrow; i++) {
			System.out.println("Enter no of col in row no "+i);
			col=sc.nextInt();
			a[i]=new int[col];
		//a[3]=
			
		}					//4
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=j+1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		/*
		 * Problem Statement

		A cinema hall has rows with different numbers of seats:
		
		Row 1 → 10 seats
		
		Row 2 → 12 seats
		
		Row 3 → 8 seats
		
		Requirements:
		
		Use a jagged array to represent seats (0 = empty, 1 = booked).
		
		Allow the user to book a seat.
		
		Display the seat layout after each booking.
		Cinema Hall Seats (0=Empty, 1=Booked):
		Row 1: 1 0 0 0 1 0 0 1 0 0 
		Row 2: 1 0 1 0 0 0 1 1 0 0 0 1
		Row 3: 0 0 1 1 0 0 0 0 
		 */
	}
}
