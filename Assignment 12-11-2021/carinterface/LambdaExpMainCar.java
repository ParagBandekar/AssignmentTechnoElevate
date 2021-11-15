package com.technoelevate.javassignment.carinterface;

public class LambdaExpMainCar {
public static void main(String[] args) {
	Car car=(String carName)->{System.out.println("Price of "+carName+" is : "+5+","+50+",000Rs");};
	car.knowCar("Benz");
}
}