package com.bank.accounts;
public class BankAccount{
	private String accountNumber;
	private double balance;
	public void setAccountNumber(String accountNumber){
		this.accountNumber=accountNumber;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public String getAccountNumber(){
		return accountNumber;
	}
	public double balance(){
		return balance;
	}
	public void showAccountDetails(){
		System.out.println("Bank Account NUmber: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}