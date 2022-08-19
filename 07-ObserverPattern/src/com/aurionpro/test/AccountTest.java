package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.SMSNotifier;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(1, "reena", 8653);
		acc.registerNotifier(new EmailNotifier());
		acc.registerNotifier(new SMSNotifier());
		acc.deposit(9674);
		System.out.println("---------------------------");
		acc.withdraw(890);
	}

}