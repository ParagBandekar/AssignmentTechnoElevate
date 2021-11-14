package com.technoelevate.javabasics.hasacompositionassignment;

public class MotherBoard {
	int price;
	String brand;
	String type;
	public MotherBoard(int price, String brand, String type) {
		super();
		this.price = price;
		this.brand = brand;
		this.type = type;
	}
	@Override
	public String toString() {
		return "MotherBoard [price=" + price + ", brand=" + brand + ", type=" + type + "]";
	}
	

}
