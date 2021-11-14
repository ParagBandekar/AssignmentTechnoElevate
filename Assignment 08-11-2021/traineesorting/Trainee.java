package com.technoelevate.javabasics.traineesorting;

	import java.util.TreeSet;

	public class Trainee implements Comparable<Trainee> {
		int age;
		int id;
		String name;
		public Trainee(int age, int id, String name) {
			super();
			this.age = age;
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Trainee [age=" + age + ", id=" + id + ", name=" + name + "]";
		}
		@Override
		public int compareTo(Trainee o) {
			// TODO Auto-generated method stub
			return this.id-o.id;
		}
		
	}

