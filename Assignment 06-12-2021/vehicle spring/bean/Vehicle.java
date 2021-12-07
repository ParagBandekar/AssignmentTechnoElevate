package com.technoelevate.spring.bean;

public class Vehicle {
private String name;
private int price;
private Engine engine;
private Wheel wheel;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public Wheel getWheel() {
	return wheel;
}
public void setWheel(Wheel wheel) {
	this.wheel = wheel;
}
@Override
public String toString() {
	return "Vehicle [name=" + name + ", price=" + price + ", engine=" + engine + ", wheel=" + wheel + "]";
}

}
