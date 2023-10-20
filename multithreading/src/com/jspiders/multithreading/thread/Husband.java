package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resources.Account;

public class Husband extends Thread {
private Account account;
	public Husband(Account account) {
		this.account=account;
	}
	public void run()
	{
		account.deposite(10000);
		account.withdraw(2000);
	}
}
