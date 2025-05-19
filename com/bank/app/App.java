package com.bank.app;

import com.bank.accounts.BankAccount;
import com.bank.customers.Customer;

public class App {
    public static void main(String args[]) {
        BankAccount ba = new BankAccount();
        ba.setAccountNumber("SBI6007");   
        ba.setBalance(10000.0);           

        Customer cust = new Customer();
        cust.setCustomerName("Pujitha"); 
        cust.setCustomerId(21);          

        ba.showAccountDetails();
        cust.showCustomerDetails();
    }
}
