package com.technoelevate.javaassignment.singleinheritance;

public class RangeOfNumbers {
	public static void main(String[] args) {
		int sum = 0;
		int fiveSum = 0;
		int count = 5;
		for (int number = 1; count != 0; number++) {

			if (number % 3 == 0 && number % 5 == 0) {
				sum = number + sum;
				count--;

			}
		}
		System.out.println("Sum of the first five numbers that divided by 3 and 5 :" + sum);
	}
}