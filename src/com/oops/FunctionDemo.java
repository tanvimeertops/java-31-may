package com.oops;

import java.util.jar.Attributes.Name;

/*
 * function: does something
 * 1.function without parameter without return type
 * 2.function with parameter without return type
 * 3.function without parameter with return type
 * 4.function with parameter with return type
 * public void func_name()
 *
 *
 *
 */
class Employee{
//	int a,b;
//1.function with parameter with return type
	public double setEmp(int b,int a) {
		return (double)b/a;
		}
	//1.function without parameter without return type
//	public void display() {
//		System.out.println("emp id:"+id);
//		System.out.println("emp name:"+emp_name);
//		System.out.println("emp salary:"+salary);
//	}
}
public class FunctionDemo {
public static void main(String[] args) {
	Employee emp=new Employee();
	System.out.println(emp.setEmp(85,6)); 
//	emp.display();
}
}
