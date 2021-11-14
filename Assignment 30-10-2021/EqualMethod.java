package com.technoelevate.javaassignment.singleinheritance;

import java.util.Scanner;

public class EqualMethod {
		public void printEqual(int FirstInt,int SecondInt,int ThirdInt) {
			if(FirstInt==SecondInt && FirstInt==ThirdInt) {
				System.out.println("All numbers are equal");
			}
			else if(FirstInt<0 ||SecondInt<0 ||ThirdInt<0) {
				System.out.println("Invalid Value");
			}
			else if(FirstInt!=SecondInt && FirstInt!=ThirdInt) {
				System.out.println("All numbers are different");
			}
			else{
				System.out.println("Neither all are equal or different");
			}	
		}
		public static void main(String[] args) {
			EqualMethod equalMethod=new EqualMethod();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr 3 Integer value :");
			int FirstInt=sc.nextInt();
			int SecondInt=sc.nextInt();
			int thirdInt=sc.nextInt();
			equalMethod.printEqual(FirstInt,SecondInt,thirdInt);

		}
	}
