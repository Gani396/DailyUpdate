package com.springcore.bank;

public abstract class BankAccountServiceImpl {
	long accountId;
	double balance;
	long fromAccount;
	long toAccount;
	double account;
	
	public void withdraw() {
		System.out.println("AccounntId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	public void balance() {
		System.out.println("AccounntId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	public void deposit() {
		System.out.println("AccounntId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	public void fundTransfer() {
		System.out.println("AccounntId" +accountId);
		System.out.println("Balance" +balance);
	}
}
