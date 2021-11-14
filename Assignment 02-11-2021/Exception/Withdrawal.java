package com.technoelevate.javabasics.exceptionhandling;

public class Withdrawal {
	double limit;
	public Withdrawal(double limit) {
		this.limit = limit;
	}

	public void withdraw(double amount) throws SufficientBalance {
		if (amount <= limit) {
			System.out.println("succesfull deposit");
			System.out.println("balance =" + (balance + amount));
		} else {
			throw new SufficientBalance("The amount exceeds the deposite limit");
		}
	}

}
