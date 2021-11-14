package com.technoelevate.javabasics.hasacompositionassignment;

public class Cpu {
	int price;
	String brand;
	public Cpu(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Cpu [price=" + price + ", brand=" + brand + "]";
	}
	

}
