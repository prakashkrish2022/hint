package com.computer;
public class Computer extends Desktop {

	public void computerModel1() {
		System.out.println("computer model is desktop");
	}

	public static void main(String[] args) {
		Computer k=new Computer();
		k.computerModel1();
		k.desktopsSize();

	}

}
