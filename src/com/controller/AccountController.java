package com.controller;
import java.util.Scanner;

import com.dto.AccountDTO;
import com.service.AccountService;

public class AccountController {
	private AccountDTO account;
	private AccountService service=new AccountService();
	private Scanner scanner=new Scanner(System.in);
	public void start() {
		System.out.println("Enter Account Holder Name: ");
		String name=scanner.nextLine();
		System.out.println("Enter Initial balance: ");
		double balance=scanner.nextDouble();
		account=new AccountDTO(name, balance);
		
		int choice;
		do {
			System.out.println("***** Bank Menu *****");
			System.out.println("1. Deposit");
			System.out.println("2 Withdraw");
			System.out.println("3. View Balance");
			System.out.println("4. Transaction History");
			System.out.println("0. Exit");
			System.out.println("Enter Your choice: ");
			choice=scanner.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("Enter Ammount to be deposit: ");
				double depositAmt=scanner.nextDouble();
				service.deposit(account,depositAmt);
				break;
			case 2:
				System.out.println("Enter Amount to withdraw: ");
				double withdrawAmt=scanner.nextDouble();
				service.withdraw(account,withdrawAmt);
				break;
			case 3:
				System.out.println("Current Balance: "+account.getBalance());
				break;
			case 4:
				service.printTransactionHistory(account);
				break;
			case 0:
				System.out.println("Thank you For using our Bank !!!");
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			
		}while(choice!=0);
				
		
	}

}
