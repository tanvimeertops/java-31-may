package com.oops;

import java.awt.print.Printable;

/*
 * 2d array : collection rows and cols
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 
 */
public class _2D_array {
public static void main(String[] args) {
	int[][] a= {
			{1,2,3,4}, //sum=10
			{5,6,7,8},
			{9,2,3,4}
			};
	
	for (int i = 0; i < a.length; i++) {
		int sum=0;
		for (int j = 0; j < a[i].length; j++) {
			sum+=a[i][j];
		}
		System.out.println(sum);
	}
}
}
