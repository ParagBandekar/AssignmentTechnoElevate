package com.technoelevate.spring.bean;

public class Wheel {
private int size;

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

@Override
public String toString() {
	return "Wheel [size=" + size + "]";
}

}
