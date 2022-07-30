package com.masai;

public class Bike implements Vehcle {

	public void ride() {
		System.out.println("ride started....");
	}

	@Override
	public void go() {
		ride();
	}
}
