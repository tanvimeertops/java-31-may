package com.basics;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * for i:
 * initialization:
 * first no of pattern
 * 
 * condition:
 * last no of pattern
 * 
 * min to max :<=
 * max to min :>=
 * 
 * incree/decree
 * <= ---> ++
 * >= ---> --
 * 
 * for j:
 * initialization:
 * first col 
 * same no: that no only
 * diff no: upper loop name
 * 
 * condition:
 * last col
 * same no: that no only
 * diff no: upper loop name
 * 
 * min to max :<=
 * max to min :>=
 * 
 * incree/decree
 * <= ---> ++
 * >= ---> --
 * row :4
 * col :5
 * 
 * 		*
 		**
 		***
 		****
 		*****
 		
 		*****
 		****
 		***
 		**
 		*
 		
 		*
 		**
 		* *
 		*  *
 		*****
 		
 		A
		AB
		ABC
		ABCD
		ABCDE
		
		*****
		*  *
		* *
		**
		*
		
		+++++1
		++++1 2
		+++1 2 3
		++1 2 3 4
		+1 2 3 4 5
		
		k: completely depends on i
		
		*  	 	1   1*2  2-1
	   ***		3	2*2  4-1
	  *****		5   3*2  6-1
	   ***
	    *
	    
	    1
	   1 1
	  1 2 1
	 1 3 3 1
	1 4 4 4 1
		
		2 to the power of 3
		11.40
		
		
 */
public class PatternDemo {
public static void main(String[] args) {
//	for (int i = 1; i <=3; i++) {
//		for (int k = i; k<=3; k++) {
//			System.out.print(" ");
//		}
//		for (int j =1; j <=i*2-1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	for (int i = 2; i >=1; i--) {
//		for (int k = i; k<=3; k++) {
//			System.out.print(" ");
//		}
//		for (int j =i*2-1; j >=1; j--) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	int a=2,b=4,power = 1;
//	for (int i=1;i<=b;i++) {
//		power=power*a;//8
//		
//	}

	System.out.println(Math.pow(a, b));
	
}
}
