package com.oops;
/*
 * Class :it is a collection of data member and member function
 * 
 * Object : it gives permission to access functionality of class
 * inheritance
 * polymorphism
 * encapsulation
 * abstraction
 */

class Student{
	int roll_no;//
	String name;
	
	public void setData() {
		roll_no=23;
		name="pranav";
	}
	public void display() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is :"+name);
	}
	
}
public class ClassDemo {
public static void main(String[] args) {
	//[class name] [obj_name]=new [class_name()];
	Student s1=new Student();
	s1.setData();
	s1.display();
}
}
