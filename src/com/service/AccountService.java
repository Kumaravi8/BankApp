package com.service;
import com.dto.*;
public class AccountService {
	public void deposit(AccountDTO account, double amount) {
	    if (amount > 0) {
	        double newBalance = account.getBalance() + amount;
	        account.setBalance(newBalance);
	        String msg = " Deposited ₹" + amount + " | New Balance: ₹" + newBalance;
	        account.addTransaction(msg);
	        System.out.println(msg); 
	    } else {
	        String msg = " Deposit failed: Invalid amount ₹" + amount;
	        account.addTransaction(msg);
	        System.out.println(msg); 
	    }
	}

	public void withdraw(AccountDTO account, double amount) {
	    if (amount > 0 && account.getBalance() >= amount) {
	        double newBalance = account.getBalance() - amount;
	        account.setBalance(newBalance);
	        String msg = "Withdrew ₹" + amount + " | New Balance: ₹" + newBalance;
	        account.addTransaction(msg);
	        System.out.println(msg); 
	    } else if (amount <= 0) {
	        String msg = " Withdrawal failed: Invalid amount ₹" + amount;
	        account.addTransaction(msg);
	        System.out.println(msg); 
	    } else {
	        String msg = " Withdrawal failed: Insufficient balance for ₹" + amount;
	        account.addTransaction(msg);
	        System.out.println(msg); 
	    }
	}

	public void printTransactionHistory(AccountDTO account) {
		System.out.println("Transaction History for "+account.getAccountHolder()+":");
		for(String txn :account.getTransactionHistory()) {
			System.out.println("-"+ txn);
		}
	}

}
