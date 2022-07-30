package com.masai.looseC;

public class Demo {

	public static void main(String[] args) {
		
//		Travel tr = new Travel();
////		tr.setV(new Car());
//		tr.setV(new Bike());
//		tr.journey();
		
		
		//Constructor
		Travel tr = new Travel(new Car());
		tr.journey();
		
		
		
	}

}
