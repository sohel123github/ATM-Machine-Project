package com.atmmachine;

import java.util.Scanner;

public class AtmMachine {
	
	float balance;
	int pin = 5674;
	
	public void checkPin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Pin -");
		int enterPin = sc.nextInt();
		if(enterPin==pin) {
			menu();
		}else {
			System.out.println("Incorrect Pin !");
			checkPin();
		}
	}
	
	public void menu() {
		System.out.println("========== **** WELCOME **** ==========");
		
		System.out.println("1. Check A/C Balance \t\t\t 2. Withdraw Money");
		
		System.out.println("3. Deposit Money \t\t\t 4. Exit");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice -");
		int choice = sc.nextInt();
		if(choice == 1) {
			checkBalance();
		}else if(choice == 2) {
			withdrawMoney();
		}else if(choice == 3) {
			depositMoney();
		}else if(choice == 4) {
			return;
		}
		menu();
	}
	
	public void checkBalance() {
		System.out.println("Your Accout Balance - "+balance);
		menu();
	}
	
	public void withdrawMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amout -");
		int amount = sc.nextInt();
		if(amount > balance) {
			System.out.println("Insufficient Amount !");
		}else {
			balance = balance - amount;
			System.out.println("Money Withdraw Successfully");
		}
		menu();
	}

	public void depositMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount -");
		int amount = sc.nextInt();
		balance = balance + amount;
		System.out.println("Money Deposited Successfully");
		menu();
	}
	
	public static void main(String[] args) {
	
		AtmMachine obj = new AtmMachine();
		obj.checkPin();
		
		
		
		
		
		
		
		
}
}
