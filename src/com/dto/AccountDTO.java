package com.dto;

import java.util.ArrayList;
import java.util.List;

public class AccountDTO {
	public String accountHolder;
	private double balance;
	private List<String> transactionHistory;
	
	public AccountDTO(String accountHolder,double initialBalance) {
		this.accountHolder=accountHolder;
	this.balance=initialBalance;
		this.transactionHistory=new ArrayList<>();
		transactionHistory.add("Account Created with balance: "+initialBalance+"rs");
		}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public List<String>getTransactionHistory(){
		return transactionHistory;
	}
	public void addTransaction(String detail) {
		transactionHistory.add(detail);
	}
}
