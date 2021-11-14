package com.technoelevate.javabasics.exceptionhandling;

public class SufficientBalance extends Exception {
	String msg;

	public SufficientBalance(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
