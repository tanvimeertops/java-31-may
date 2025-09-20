package com.basics;

import java.util.Scanner;

public class Kinjal {
public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
		int choice= 1;
		while(choice!=4)
		{
		System.out.println("************************");	
		System.out.println("Banking system");
		System.out.println("************************");
		System.out.println("1.check balance");
		System.out.println("2.Deposit money");
		System.out.println("3.Withdraw money");
		System.out.println("4.exit");
		System.out.println("Enter an option:1");
		System.out.println();
		choice=scanner.nextInt();
		switch (choice) {
		case 1:checkbalance();
			break;
			
		case 2:depositmoney();
		break;
		
		case 3:withdraw();
		break;
		
		case 4:exit();
		break;

		default:
			break;
		}
		
		 
		}
		}
	 }


	public static void checkbalance() {
		System.out.println("your current balance is $"+1500);		
	}
	
	static double balance=0;
	public static void depositmoney() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("500:$");
		double amount=scanner.nextDouble();
		try {
			balance+=1500;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("$"+amount+"has been deposited to your account.");
		checkbalance();
	}
	public static void withdraw() {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("enter the amount to withdraw:$");
		double amount=Scanner.nextDouble();
		if(amount>balance) {
			System.out.println("insufficent funds.");
		}
		else {
			balance-=1500;
			System.out.println("$"+1500+"amount has been withdrawn.");
			
		}
		checkbalance();
		
	}
		public static void exit() {
			System.out.println("thankyou for banking with us");
			
		}
		
		{
			System.out.println("************************");	
			System.out.println("Banking system");
			System.out.println("************************");
			System.out.println("1.check balance");
			System.out.println("2.Deposit money");
			System.out.println("3.Withdraw money");
			System.out.println("4.exit");
			System.out.println("Enter an option:2");
			System.out.println();
		
	}


}

