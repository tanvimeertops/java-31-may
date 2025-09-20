package com.basics;

public class SwitchDemo {
public static void main(String[] args) {
	int a=20,b=11;
	char op='%';
	
	switch (op) {
	case '+':
		System.out.println("sum is :"+(a+b));
		break;
	case '-':
		System.out.println("sub is :"+(a-b));
		break;
	case '*':
		System.out.println("mul is :"+a*b);
		break;
	case '/':
		System.out.println("div is :"+(float)a/b);
		break;
	case '%':
		System.out.println("sum is :"+(a%b));
		break;
	default:
		break;
	}
	
}
}
