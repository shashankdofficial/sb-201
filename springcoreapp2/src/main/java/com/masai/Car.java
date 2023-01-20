package com.masai;


public class Car implements Vehcle {

	public void start() {
		System.out.println("Car started...");
	}

	@Override
	public void go() {
		start();
	}

}
