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
		
 */
public class PatternDemo {
public static void main(String[] args) {
	for (int i = 5; i >=1; i--) {
		char ch='A';
		for (int j =5; j >=i; j--) {
			System.out.print(ch++);
		}
		System.out.println();
	}
}
}
