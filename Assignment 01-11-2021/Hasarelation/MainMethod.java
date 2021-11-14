package com.technoelevate.javabasics.hasacompositionassignment;

public class MainMethod {
	public static void main(String[] args) {
		Cpu cpu=new Cpu(5000,"hp");
		Keyboard keyboard=new Keyboard("hp", 2000);
		Microprocessor microprocessor=new Microprocessor("CISC", "atmel", 6000);
		Monitor monitor=new Monitor("hp", 2000, 15);
		MotherBoard motherBoard=new MotherBoard(3000, "hp", "i5");
		Mouse mouse=new Mouse("hp", 500, "wireless");
		Computer computer=new Computer(cpu, keyboard, microprocessor, monitor, motherBoard, mouse, "hp", 15000);
		computer.status();
		
	}

}
