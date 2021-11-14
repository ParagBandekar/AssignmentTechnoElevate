package com.technoelevate.javaassignment.reversestring;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String string=scanner.nextLine();
		for(int i=string.length();i>0;--i) {
			System.out.print(string.charAt(i-1));
			
		}
	}

}
