package com.technoelevate.javabasics.traineesorting;

import java.util.Comparator;


public class DescendingOrder implements Comparator<Trainee>{
	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Trainee o1, Trainee o2) {
		// TODO Auto-generated method stub
		return o2.id-o1.id;
	}

}