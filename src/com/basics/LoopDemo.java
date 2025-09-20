package com.basics;
/*
 * Loop : iterative, repetitive
 * 1.entry control
 *  for :
 *  	for(initialization;condition;incree/decree){
 *  		statement
 *  		}
 *  while
 *  initialization
 *  while(condition){
 *  statement;
 *  incree/decree
 *  }
 * 
 * 2.exit control
 * do while
 * initialization
 * do{
 * statement
 * incree/decree
 * }while(condition)
 * 
 * 
 */
public class LoopDemo {
public static void main(String[] args) {
//	for(int i=1;i<=5;i++) {  //6
//		System.out.println(i);//5
//	}
//	// 11 times lines executed
//	
//	int i=1; //1
//	while (i<=5) { //6
//		System.out.println(i); //5
//		i++;//5
//	}
//	// 17 times lines executed
//	
//	int j=6; //1
//	do {
//		System.out.println(j);
//		j++;
//	} while (j<=5);
	// 21 times lines executed
	
	
//	If a five-digit number is 12345, write a
//	program to calculate the sum of its digits.
//	(Hint: Use the modulus operator ‘%’)
//	5+4+3+2+1
	//12:12
	
	int num=12345,rem,sum=0;
	
	while(num>0) {
		rem=num%10;
		num=num/10;
		sum+=rem;
	}
	System.out.println(sum);
	
}
}
