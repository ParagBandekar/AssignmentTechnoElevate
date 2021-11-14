package com.technoelevate.javabasics.exceptionhandling;

public class MainDeposit {
	public static void main(String[] args) {
		Withdrawal withdrawal=new Withdrawal(40000);
		withdrawal.withdraw(40001);
	}

}
