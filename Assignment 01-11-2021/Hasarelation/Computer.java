package com.technoelevate.javabasics.hasacompositionassignment;

public class Computer {
	Cpu cpu;
	Keyboard keyboard;
	Microprocessor microprocessor;
	Monitor monitor;
	MotherBoard motherBoard;
	Mouse mouse;
	String brand;
	int price;

	public Computer(Cpu cpu, Keyboard keyboard, Microprocessor microprocessor, Monitor monitor, MotherBoard motherBoard,
			Mouse mouse, String brand, int price) {
		super();
		this.cpu = cpu;
		this.keyboard = keyboard;
		this.microprocessor = microprocessor;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
		this.mouse = mouse;
		this.brand = brand;
		this.price = price;
	}

	public void status() {
		System.out.println(this.cpu + " " + this.keyboard + " " + this.microprocessor + " " + this.monitor + " "
				+ this.motherBoard + " " + this.mouse + " " + this.brand + " " + this.price);
		System.out.println("computer is ready");
	}

}
