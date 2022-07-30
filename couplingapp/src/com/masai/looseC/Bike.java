package com.masai.looseC;

public class Bike implements Vehcle {

	public void ride() {
		System.out.println("ride started....");
	}

	@Override
	public void go() {
		ride();
	}
}
