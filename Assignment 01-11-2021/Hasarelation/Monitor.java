package com.technoelevate.javabasics.hasacompositionassignment;

public class Monitor {
	String brand;
	int price;
	int size;
	public Monitor(String brand, int price, int size) {
		super();
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Monitor [brand=" + brand + ", price=" + price + ", size=" + size + "]";
	}
	

}
