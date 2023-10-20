package com.jspiders.multithreading.resources;

public class Account {
private double accountBalance;
public Account(double accountBalance) {
	this.accountBalance=accountBalance;
}
public void deposite(double amount) {
	accountBalance +=amount;
	System.out.println("Amount of rupees"+amount+"has been Creadited");
	System.out.println("Update account balance"+accountBalance);
}
public void withdraw(double amount) {
	if(amount > accountBalance)
	{
		System.out.println("Insufficient Accoun Balance");

	}
	else {
		accountBalance -=amount;
		System.out.println("Amount of rupees"+amount+"has been Debited");
		System.out.println("Update account balance"+accountBalance);


	}
}
	

}
