package com.technoelevate.javabasics.hasacompositionassignment;

public class Microprocessor {
	String type;
	String brand;
	int price;
	public Microprocessor(String type, String brand, int price) {
		super();
		this.type = type;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Microprocessor [type=" + type + ", brand=" + brand + ", price=" + price + "]";
	}
	

}
