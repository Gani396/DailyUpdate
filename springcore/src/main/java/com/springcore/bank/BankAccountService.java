package com.springcore.bank;

public interface BankAccountService {
	public interface BankAccService {
		public double withdraw(long accountId, double balance);
		public double deposit(long accountId, double balance);
		public double getBalance(long accountId);
		public boolean fundTransfer(long fromAccount, long toAccount, double account);
	}
}
