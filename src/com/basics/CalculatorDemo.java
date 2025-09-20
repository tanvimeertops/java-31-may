package com.basics;
/*
 * Arithmetic operator :*% + - / 
 * 12.05
 * %
 * to get last digit do % 10
 * to eliminate last digit /10
 * 
 * If a five-digit number is 12345, write a
program to calculate the sum of its digits.
(Hint: Use the modulus operator ‘%’)
5+4+3+2+1
 */
public class CalculatorDemo {
public static void main(String[] args) {
//	int a=10,b=3;
//	
//	System.out.println("sum is :"+(a+b));
//	System.out.println("sub is :"+(a-b));
//	System.out.println("mul is :"+a*b);
//	System.out.println("div is :"+(float)a/b);
//	System.out.println("mod is :"+a%b);
	
	int num=12345,no1,no2,no3,no4,no5;
	no1=num%10;
	System.out.println(no1);
	num=num/10;
	System.out.println(num);
	no2=num%10;
	System.out.println(no2);
	num=num/10;
	System.out.println(num);
	no3=num%10;
	System.out.println(no3);
}
}
