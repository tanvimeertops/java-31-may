package com.basics;
/*
 *  Convert one primitive type to another 
 *  implicit conversion:(automatic)
 *  convert smaller data type to bigger data type
 *  
 *  explicit conversion:
 *  convert bigger data type to smaller data type
 *  
 */
public class TypeConversionDemo {
public static void main(String[] args) {
	int i1=2147483647;//4
	long l1=i1; //8
	System.out.println("implicit conversion :"+l1);
	 //4         //8
	 int i2=(int)l1;
	System.out.println("explicit conversion: "+i2);
	
	int i3=127;
	byte b1=(byte)i3; //-128 -127 -126 to 127
	System.out.println("explicit conversion: "+b1);
	
	char ch='A';
	int i4=ch;//ascii code A=65
	System.out.println("implicit conversion: "+i4);
	
	int i5=45;
	float f1=i5; //45.0
	
	System.out.println("float is :"+f1);
	
	float f2=45.7889f;
	int i6=(int) f2;//45
	
	System.out.println("int is :"+i6);
	
	int a=10,b=3;//3.33
	System.out.println("div is :"+(float)a/b);
	
}
}
