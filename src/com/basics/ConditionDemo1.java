package com.basics;
/*
 * Condition: 
 * if :
 * if condition is true : true statement print else nothing
 * 
 * if else :if condition is true : true statement print else false 
 * statement print
 * nested if
 * else if ladder
 * switch
 * 11:36
 */
public class ConditionDemo1 {
public static void main(String[] args) {
	//greatest of two nos
//	int a=14,b=78;
//	if(a>10) {
//		System.out.println("a is greater");
//	}else {
//		System.out.println("a is smaller");
//	}
	
	//nested if 
//	int a=140,b=78,c=230;
	
//	if(a>b) {
//		if(a>c) {
//			System.out.println("A is greater");
//		}else {
//			System.out.println("C is greater");
//		}
//	}else {
//		if(b>c) {
//			System.out.println("B is greater");
//		}else {
//			System.out.println("c is greater");
//		}
//	}
	//else if ladder
	//logical operator: && || !
	int a=1400,b=78,c=230;
	if(a>b && a>c ) {
		System.out.println("A is greater");
	}else if(b>a&& b>c) {
		System.out.println("B is greter");
	}else {
		System.out.println("C is greater");
	}
	
	//vowel and consonant
	char ch='A';
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E') {
		System.out.println("Vowel");
	}else {
		System.out.println("consonant");
	}
}
}
