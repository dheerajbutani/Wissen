package com.bank;

import com.bank.cust.account.Account;
import com.bank.cust.customer.Customer;


public class App {
	public static void main(String args[])
	{
		Account a=new Account();
		a.num=1;
		a.name="john";
		Customer c=new Customer();
		c.Deposit();
		c.Withdraw();
	}
}
