package com.technoelevate.javabasics.hasacompositionassignment;

public class Mouse {
	String brand;
	int price;
	String type;
	public Mouse(String brand, int price, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Mouse [brand=" + brand + ", price=" + price + ", type=" + type + "]";
	}
	

}
