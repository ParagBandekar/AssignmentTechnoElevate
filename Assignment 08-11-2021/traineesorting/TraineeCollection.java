package com.technoelevate.javabasics.traineesorting;

import java.util.TreeSet;

public class TraineeCollection {
	public static void main(String[] args) {
		DescendingOrder order=new DescendingOrder();
TreeSet<Trainee> treeSet=new TreeSet<Trainee>(order);
		
		treeSet.add(new Trainee(22, 201, "parag"));
		treeSet.add(new Trainee(22, 958, "parag"));
		treeSet.add(new Trainee(22, 458, "parag"));
		treeSet.add(new Trainee(22, 154, "parag"));
		for (Trainee trainee:treeSet);
		System.out.println(treeSet);

	}

}

